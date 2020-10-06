SUMMARY = "Simple helloworld application"
SECTION = "examples"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

SRC_URI = "file://simple-hello-world.c;subdir=sources"

S = "${WORKDIR}/sources"

EXTRANATIVEPATH += "python3-native"

inherit codechecker
CODECHECKER_ENABLED ?= "1"
CODECHECKER_REPORT_HTML ?= "1"
#CODECHECKER_REPORT_STORE ?= "1"
#CODECHECKER_REPORT_HOST ?= "http://localhost:8003/Default"

do_compile() {
    ${CC} -w simple-hello-world.c ${CFLAGS} ${LDFLAGS} -o simple-hello-world
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 simple-hello-world ${D}${bindir}
}

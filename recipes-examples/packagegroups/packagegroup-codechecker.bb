SUMMARY = "Packagegroup for CodeChecker enabled packages"

inherit packagegroup

RDEPENDS_${PN} += "simple-helloworld"
RDEPENDS_${PN} += "babeltrace"
RDEPENDS_${PN} += "babeltrace2"
RDEPENDS_${PN} += "liburcu"
RDEPENDS_${PN} += "lttng-tools"
RDEPENDS_${PN} += "lttng-ust"
RDEPENDS_${PN} += "minicoredumper"
RDEPENDS_${PN} += "ptest-runner"

do_cleanall[depends] = "\
simple-helloworld:do_cleanall \
babeltrace:do_cleanall \
babeltrace2:do_cleanall \
liburcu:do_cleanall \
lttng-tools:do_cleanall \
lttng-ust:do_cleanall \
minicoredumper:do_cleanall \
ptest-runner:do_cleanall \
"

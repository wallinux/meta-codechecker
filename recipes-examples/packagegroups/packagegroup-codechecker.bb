SUMMARY = "Packagegroup for CodeChecker enabled packages"

inherit packagegroup

RDEPENDS_${PN} = "simple-helloworld"

do_cleanall[depends] = "simple-helloworld:do_cleanall"

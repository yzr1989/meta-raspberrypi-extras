require linux-raspberrypi-5.9.inc
require linux-raspberrypi-common-rt.inc

SRC_URI += "http://cdn.kernel.org/pub/linux/kernel/projects/rt/5.9/patch-5.9.1-rt20.patch.gz"
SRC_URI[sha256sum] = "5fde368f5cede92087725d66b75849fb6383014fd2fbd535b662d960bfdfc386"

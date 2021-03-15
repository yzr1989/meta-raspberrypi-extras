require linux-raspberrypi-5.10.inc
require linux-raspberrypi-common-rt.inc

SRC_URI += "http://cdn.kernel.org/pub/linux/kernel/projects/rt/5.10/older/patch-5.10.17-rt32.patch.gz"
SRC_URI[sha256sum] = "148c42cc27fab0a2ca4b756f3089382006361e11c938b3512c1f1fc8be4e142e"

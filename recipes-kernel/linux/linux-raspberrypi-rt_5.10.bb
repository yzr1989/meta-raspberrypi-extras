require linux-raspberrypi-5.10.inc
require linux-raspberrypi-common-rt.inc

SRC_URI += "http://cdn.kernel.org/pub/linux/kernel/projects/rt/5.10/patch-5.10.4-rt22.patch.gz"
SRC_URI[sha256sum] = "77a6d9aad676452010f891728713c5ff2bae503e574b2ff51645d674af9e2c08"

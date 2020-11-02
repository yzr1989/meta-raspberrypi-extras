require linux-raspberrypi-5.10.inc
require linux-raspberrypi-common-rt.inc

SRC_URI += "http://cdn.kernel.org/pub/linux/kernel/projects/rt/5.10/patch-5.10-rc1-rt2.patch.gz"
SRC_URI[sha256sum] = "0f8428660614885daeee537f04ecc94240c5690c4b306d2025f33e9897b0125d"

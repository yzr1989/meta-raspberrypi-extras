require linux-raspberrypi-5.10.inc
require linux-raspberrypi-common-rt.inc

SRC_URI += "http://cdn.kernel.org/pub/linux/kernel/projects/rt/5.10/older/patch-5.10.47-rt45.patch.gz"
SRC_URI[sha256sum] = "d60a1a497099f57e9ef7d924601564dc67f61ada143b3e3c22aae4c34049fcdb"

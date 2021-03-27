require linux-raspberrypi-5.10.inc
require linux-raspberrypi-common-rt.inc

SRC_URI += "http://cdn.kernel.org/pub/linux/kernel/projects/rt/5.10/older/patch-5.10.25-rt35.patch.gz"
SRC_URI[sha256sum] = "75668c8451726bb25c04fec67494016ee4f542e62e63fd4a6101725062f5a9cb"

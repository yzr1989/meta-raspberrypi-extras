require linux-raspberrypi-5.10.inc
require linux-raspberrypi-common-rt.inc

SRC_URI += "http://cdn.kernel.org/pub/linux/kernel/projects/rt/5.10/older/patch-5.10.17-rt32.patch.gz"
SRC_URI[sha256sum] = "411d633e91a292c55b8ecca08268c8e7296b8b2b8b315bbd9adf18df48a44682"

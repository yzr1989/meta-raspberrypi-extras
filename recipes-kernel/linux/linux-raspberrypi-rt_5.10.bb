require linux-raspberrypi-5.10.inc
require linux-raspberrypi-common-rt.inc

SRC_URI += "http://cdn.kernel.org/pub/linux/kernel/projects/rt/5.10/older/patch-5.10.27-rt36.patch.gz"
SRC_URI[sha256sum] = "b695f7fbc35114980535f2363691607efc27df91e9ae15aac3d875565a925f6b"

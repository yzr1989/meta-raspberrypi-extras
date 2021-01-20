require linux-raspberrypi-5.10.inc
require linux-raspberrypi-common-rt.inc

SRC_URI += "https://cdn.kernel.org/pub/linux/kernel/projects/rt/5.10/older/patch-5.10.8-rt24.patch.gz"
SRC_URI[sha256sum] = "c772f6b1276ea4e150bb9bb9e8288cc16d1f9d4a191731506edf0f9b1e588520"

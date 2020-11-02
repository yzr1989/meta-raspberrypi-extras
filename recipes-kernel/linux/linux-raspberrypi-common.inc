KMETA = "kernel-meta"
YOCTO_CACHE_BRANCH ?= "yocto-5.4"

SRC_URI = " \
    git://github.com/raspberrypi/linux.git;name=machine;branch=${LINUX_RPI_BRANCH} \
    git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=${YOCTO_CACHE_BRANCH};destsuffix=${KMETA} \
    file://powersave.cfg \
    file://android-drivers.cfg \
    "

SRC_URI_remove = "file://rpi-kernel-misc.cfg"

require linux-raspberrypi.inc

LICENSE_CHECKSUM ?= "bbea815ee2795b2f4230826c0c6b8814"

LIC_FILES_CHKSUM = "file://COPYING;md5=${LICENSE_CHECKSUM}"

KERNEL_EXTRA_ARGS_append_rpi = " DTC_FLAGS='-@ -H epapr'"

LINUX_VERSION ?= "5.9.2"
LINUX_RPI_BRANCH ?= "rpi-5.9.y"

YOCTO_CACHE_BRANCH = "master"

SRCREV_machine = "675b23e1cee89bf23a15420f70137bef4f23c337"
SRCREV_meta = "82f9b7c963dacc24c41d6c8b10a4f79da985d5ae"

LICENSE_CHECKSUM = "6bc538ed5bd9a7fc9398086aedcd7e46"

require linux-raspberrypi-common.inc

SRC_URI += "file://powersave.cfg \
            file://android-drivers.cfg \
            "
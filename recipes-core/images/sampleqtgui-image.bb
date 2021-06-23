DESCRIPTION = "Fairly minimal image for simple Qt Gui app (sampleqtgui)"
LICENSE = "MIT"

inherit core-image

DEPENDS += "bootfiles"

IMAGE_FEATURES += "\
    splash \
    ssh-server-dropbear \
    debug-tweaks \
"

IMAGE_INSTALL += " \
    packagegroup-sampleqtgui-devtools \
    packagegroup-qml-basic \
    sampleqtgui \
"

# Add an extra 0.5 GB of free space to the root filesystem
IMAGE_ROOTFS_EXTRA_SPACE = "524288"

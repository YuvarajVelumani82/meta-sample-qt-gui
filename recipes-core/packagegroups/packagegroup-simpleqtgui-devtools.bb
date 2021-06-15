DESCRIPTION = "Tools for target device during SimpleQtGui development"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = "\
    openssh-sftp-server \
    rsync \
"

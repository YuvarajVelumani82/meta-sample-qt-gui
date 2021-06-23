DESCRIPTION = "Tools for target device during SampleQtGui development"
LICENSE = "MIT"
PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = "\
    openssh-sftp-server \
    rsync \
"

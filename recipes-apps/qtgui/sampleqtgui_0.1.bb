SUMMARY = "Sample Qt GUI for showing QML and Qt on embedded systems"
AUTHOR  = "YuvarajVelumani82"
HOMEPAGE = "https://github.com/YuvarajVelumani82/sampleqtgui-app"

SECTION = "app"

LICENSE = "MIT"
LIC_FILES_CHKSUM="file://LICENSE;md5=d209ab822c4151f8b834aef9ec8afa05"

inherit cmake_qt5 update-rc.d

SRC_URI = "\
    git://github.com/YuvarajVelumani82/sampleqtgui-app.git;branch=master;protocol=https \
    file://sampleqtgui \
"

SRCREV = "4cd58a846fa4c2f5b8fbb89945476ab1bea3213c"

PV = "0.1+git${SRCREV}"

DEPENDS = "qtmultimedia"

INITSCRIPT_NAME = "sampleqtgui"
INITSCRIPT_PARAMS = "defaults 70"

S = "${WORKDIR}/git"

do_install_append() {
  install -d ${D}${sysconfdir}/init.d/
  install -m 0755 ${WORKDIR}/sampleqtgui ${D}${sysconfdir}/init.d/sampleqtgui
}


FILES_${PN} += "/usr/local/bin/${PN}"


require recipes-kernel/linux/linux-f1c100s.inc
DESCRIPTION = "Linux kernel for F1C100s"
KERNEL_IMAGETYPE = "zImage"

COMPATIBLE_MACHINE = "(f1c100s)"

KERNEL_DEVICETREE = " \
    suniv-f1c100s-licheepi-nano.dtb \
"

PV = "5.4.77"
PR = "r0"

SRCREV_pn-${PN} = "${AUTOREV}"

SRC_URI += "git://github.com/ninhnn2/linux-5.4.77.git;protocol=https"

S = "${WORKDIR}/git/"
LDFLAGS = ""
TARGET_LDFLAGS = ""
B = "${S}"

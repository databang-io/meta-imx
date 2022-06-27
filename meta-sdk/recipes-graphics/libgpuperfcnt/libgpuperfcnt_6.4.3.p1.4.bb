DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb" 

SRC_URI[arm-fb.md5sum] = "102508a7d3d3babc07687fbb55335a20"
SRC_URI[arm-fb.sha256sum] = "7d49ce9b2189d0cedfe18a85f7d2ba98391616b1f1770b134b2707a5b0afb884"

SRC_URI[arm-wayland.md5sum] = "2cc27a3307117fb89400cf5e41932026"
SRC_URI[arm-wayland.sha256sum] = "a2a14f6194dfd19ec4ee365d8b4e546676d338d947678c6d6c10a4f9674d06be"

SRC_URI[arm-x11.md5sum] = "d28439180e6cade50f0081fad6adb1ea"
SRC_URI[arm-x11.sha256sum] = "c0507abd84a1d9235fe32a35d6f9817e7122af523b9e62f4575feb1c389e9587"

SRC_URI[aarch64-fb.md5sum] = "3201a4d1a730c249fab3403a9851f96c"
SRC_URI[aarch64-fb.sha256sum] = "9b4e51486a715fa748e6625f549aa254fb6f4ff21923cb376aff07d150156ebe"

SRC_URI[aarch64-wayland.md5sum] = "314038752439a5b146ad8d222f1387a7"
SRC_URI[aarch64-wayland.sha256sum] = "a2b15e47314ee4ad0c1b31ff37465afa1fa662bb19d07419ad05f17b59787a2e"

SRC_URI[aarch64-x11.md5sum] = "c6a7ea6ea5f4641d6c63e6f8e879ae2f"
SRC_URI[aarch64-x11.sha256sum] = "4296614e0525c55631ef867a8968bc2dd996377c8cf72f2f742d0368231ee1e1"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
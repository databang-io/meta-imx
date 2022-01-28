DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=17d2319de7baa686e8a755ba58a9ebf5"

SRC_URI[arm-fb.md5sum] = "3511d15c475e54e5583dbf261b03a387"
SRC_URI[arm-fb.sha256sum] = "f7b172ac0effb0e14481a7806fce34a88720aa257b16e7369fa19a6ce596599d"

SRC_URI[arm-wayland.md5sum] = "72653444aa9578934ad6c8885bee1cc6"
SRC_URI[arm-wayland.sha256sum] = "e3761ec25d44efd7f64d1dce2e3bfeb84659cdcd77263baaa60ec45499ddc74d"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "fd597becc21066b66d5522281c40a5b2"
SRC_URI[aarch64-wayland.sha256sum] = "a23fd43141e85ed51fc63821950a55ca6ab045077dc02a173733d65b4594ff44"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"
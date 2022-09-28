# Copyright 2019-2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe"
LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=65c483bb431ccd9a1820e6872c604771"

SRC_URI[imx8mn.md5sum] = "d7ade5eef38ebeb297eb855d4bf565eb"
SRC_URI[imx8mn.sha256sum] = "ba7f078d17369e3a9e3ddd74dbe3853cbfa127ad1cbdb7fd2b99f58427a5bfb1"

SRC_URI[imx8mnddr3l.md5sum] = "c0768666809999af84d8a529b8ec140f"
SRC_URI[imx8mnddr3l.sha256sum] = "79d716e0d4de689bb0cd015a3d2102e28bfa0f89291fb61210a72bc0afec442e"

SRC_URI[imx8mp.md5sum] = "2838ef9097d2d9b083e3e8bb2babaf6f"
SRC_URI[imx8mp.sha256sum] = "5a2976887bef03943dc49f875620642a1622414990b40eb7a5a95a2fdd738abe"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
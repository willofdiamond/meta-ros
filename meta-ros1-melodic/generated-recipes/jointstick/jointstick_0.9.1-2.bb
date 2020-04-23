# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Move any joint with any controller!"
AUTHOR = "George Stavrinos <stavrinosgeo@gmail.com>"
ROS_AUTHOR = "George Stavrinos <stavrinosgeo@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "jointstick"
ROS_BPN = "jointstick"

ROS_BUILD_DEPENDS = " \
    controller-manager-msgs \
    geometry-msgs \
    nav-msgs \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager-msgs \
    geometry-msgs \
    nav-msgs \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager-msgs \
    geometry-msgs \
    nav-msgs \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/gstavrinos/jointstick-release/archive/release/melodic/jointstick/0.9.1-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jointstick"
SRC_URI = "git://github.com/gstavrinos/jointstick-release;${ROS_BRANCH};protocol=https"
SRCREV = "2a77b4eb0bf08286f92af6295f0727b326430907"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
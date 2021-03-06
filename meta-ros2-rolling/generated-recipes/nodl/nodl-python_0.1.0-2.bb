# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Implementation of the NoDL API in Python."
AUTHOR = "Ubuntu Robotics <ubuntu-robotics@lists.launchpad.net>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "nodl"
ROS_BPN = "nodl_python"

ROS_BUILD_DEPENDS = " \
    ament-index-python \
    python3-lxml \
    rclpy \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ament-index-python \
    python3-lxml \
    rclpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    python3-lxml \
    rclpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python3-pytest-mock} \
    ament-flake8 \
    ament-lint-auto \
    ament-lint-common \
    ament-mypy \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/nodl-release/archive/release/rolling/nodl_python/0.1.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/nodl_python"
SRC_URI = "git://github.com/ros2-gbp/nodl-release;${ROS_BRANCH};protocol=https"
SRCREV = "5f95b8770df73e49f6bedc70225831dc443f78eb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}

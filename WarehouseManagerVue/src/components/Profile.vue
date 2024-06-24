<!--
 * @Description: 

-->
<template>
    <div
        style="
            text-align: center;
            height: 100%;
            padding: 20px 0 0 0;
            margin: 0px;
        "
    >
    <div class="userInfo">
        <b> 当前登录信息</b>
    </div>
        
        <el-descriptions
            title=""
            :column="1"
            size="40"
            border
            style="padding: 20px 0 20px 0"
        >
            <el-descriptions-item>
                <template slot="label">
                    <i class="el-icon-s-custom"></i>
                    账号
                </template>

                <el-tag type="info">{{ user.no }}</el-tag>
            </el-descriptions-item>
            <el-descriptions-item>
                <template slot="label">
                    <i class="el-icon-user"></i>
                    姓名
                </template>
                <el-tag type="info">{{ user.name }}</el-tag>
            </el-descriptions-item>
            <el-descriptions-item>
                <template slot="label">
                    <i class="el-icon-mobile-phone"></i>
                    电话
                </template>
                <el-tag type="info">{{ user.phone }}</el-tag>
            </el-descriptions-item>
            <el-descriptions-item>
                <template slot="label">
                    <i class="el-icon-location-outline"></i>
                    性别
                </template>
                <el-tag
                    :type="user.sex == 1 ? 'primary' : 'danger'"
                    disable-transitions
                    ><i
                        :class="
                            user.sex == 1 ? 'el-icon-male' : 'el-icon-female'
                        "
                    ></i
                    >{{ user.sex == 1 ? "男" : "女" }}</el-tag
                >
            </el-descriptions-item>
            <el-descriptions-item>
                <template slot="label">
                    <i class="iconfont icon-r-mark1"></i>
                    角色
                </template>
                <el-tag type="success" disable-transitions>{{
                    user.roleId == 0
                        ? "超级管理员"
                        : user.roleId == 1
                        ? "管理员"
                        : "用户"
                }}</el-tag>
            </el-descriptions-item>
        </el-descriptions>
        <hr />
        <el-row style="text-align: left">
            <el-button
                type="danger"
                @click="logout"
                style="margin: 25px 0 0 90px; font-size: 22px;"
                >
                 退出登录</el-button
            >
        </el-row>
    </div>
</template>

<script>
export default {
    name: "Home",
    data() {
        return {
            user: {},
        };
    },
    computed: {},
    methods: {
        init() {
            this.user = JSON.parse(sessionStorage.getItem("CurUser"));
        },
        logout() {
            this.$confirm("您确定要退出登录吗？", "提示", {
                confirmButtonText: "确定", //确认按钮的文字显示
                type: "warning",
                center: true, //文字居中显示
            })
                .then(() => {
                    this.$message({
                        type: "success",
                        message: "退出登录成功！",
                    });

                    this.$router.push("/");
                    sessionStorage.clear();
                })
                .catch(() => {
                    this.$message({
                        type: "info",
                        message: "已取消退出登录！",
                    });
                });
        },
    },
    created() {
        this.init();
    },
};
</script>

<style scoped>
.el-descriptions {
    width: 90%;

    margin: 0 auto;
    text-align: center;
}

.userInfo {
    font-size: 32px;
}
</style>
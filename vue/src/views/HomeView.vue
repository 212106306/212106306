<template>
  <div class="home">
    <h1>{{ msg }}</h1>
    <el-button>{{ msg }}</el-button>
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
    HelloWorld
  },
  data(){
    return {
      msg:"hello"
    }
  }
}
</script>

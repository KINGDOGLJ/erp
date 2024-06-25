<template>
  <div id="app">
    <!-- 路由占位符 -->
    <router-view></router-view>
  </div>
<!--<test></test>-->
</template>

<script>

import test from './test.vue'
export default {
  name: 'app',
  components: {
    test
  }
}

</script>

<style>

</style>

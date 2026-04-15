<template>
  <header class="dashboard-header">
    <div class="dashboard-header__brand">
      <div class="dashboard-header__mark">M</div>
      <div>
        <h1 class="dashboard-header__title">MES Dashboard</h1>
        <p class="dashboard-header__subtitle">Smart Factory Control Center</p>
      </div>
    </div>

    <div class="dashboard-header__meta">
      <div class="dashboard-header__user" v-if="user">
        <p class="dashboard-header__welcome">{{ user.displayName }}</p>
        <button type="button" class="dashboard-header__logout" @click="handleLogout">Logout</button>
      </div>
      <div class="dashboard-header__clock">
        <p class="dashboard-header__time">{{ currentTime }}</p>
        <p class="dashboard-header__date">{{ currentDate }}</p>
      </div>
      <button type="button" class="icon-button" aria-label="Refresh time" @click="refreshTime">R</button>
    </div>
  </header>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue'
import { useRouter } from 'vue-router'
import { getCurrentUser, logout } from '@/lib/auth'

const router = useRouter()
const now = ref(new Date())
const user = ref(getCurrentUser())
let timerId

const refreshTime = () => {
  now.value = new Date()
}

const handleLogout = () => {
  logout()
  router.push('/login')
}

const currentTime = computed(() =>
  now.value.toLocaleTimeString('en-US', {
    hour: '2-digit',
    minute: '2-digit',
    second: '2-digit',
    hour12: false,
  }),
)

const currentDate = computed(() =>
  now.value.toLocaleDateString('en-US', {
    weekday: 'short',
    month: 'short',
    day: 'numeric',
  }),
)

onMounted(() => {
  refreshTime()
  timerId = window.setInterval(refreshTime, 1000)
})

onBeforeUnmount(() => {
  window.clearInterval(timerId)
})
</script>

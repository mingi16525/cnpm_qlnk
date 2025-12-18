import { useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div className="app-container">
        <h1>Hệ Thống Quản Lý Nhân Khẩu</h1>
        <div className="card">
          <button onClick={() => setCount((count) => count + 1)}>
            count is {count}
          </button>
          <p>
            Chỉnh sửa <code>src/App.jsx</code> để bắt đầu phát triển
          </p>
        </div>
        <p className="info">
          API Base URL: {import.meta.env.VITE_API_BASE_URL}
        </p>
      </div>
    </>
  )
}

export default App

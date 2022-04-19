package oose.hellokotlinendpoint

import org.springframework.stereotype.Service

@Service
class BerichtService {
    fun haalLaatsteBerichtOp(): TestBerichtDTO {
        return TestBerichtDTO("Test titel", "Test content")
    }
}
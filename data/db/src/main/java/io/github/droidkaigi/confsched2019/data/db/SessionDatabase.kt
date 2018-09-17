package io.github.droidkaigi.confsched2019.data.db

import io.github.droidkaigi.confsched2019.data.api.response.Response
import io.github.droidkaigi.confsched2019.data.db.entity.SessionEntity
import io.github.droidkaigi.confsched2019.data.db.entity.SessionWithSpeakers
import io.github.droidkaigi.confsched2019.data.db.entity.SpeakerEntity
import kotlinx.coroutines.experimental.channels.ReceiveChannel

interface SessionDatabase {
    fun sessionsChannel(): ReceiveChannel<List<SessionEntity>>
    suspend fun sessions(): List<SessionWithSpeakers>
    suspend fun allSpeaker(): List<SpeakerEntity>
    suspend fun save(apiResponse: Response)
}

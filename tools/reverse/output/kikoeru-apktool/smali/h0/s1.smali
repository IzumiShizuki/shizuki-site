.class public final Lh0/s1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:Landroidx/media3/exoplayer/offline/u;

.field public b:Landroidx/media3/exoplayer/offline/u;

.field public c:I

.field public d:Ljava/lang/Long;

.field public e:Z


# virtual methods
.method public final a(Ly2/y;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lh0/s1;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Lh0/s1;->a:Landroidx/media3/exoplayer/offline/u;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ly2/y;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v1

    .line 15
    :goto_0
    invoke-static {p1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_5

    .line 22
    .line 23
    :cond_1
    iget-object v0, p1, Ly2/y;->a:Lt2/g;

    .line 24
    .line 25
    iget-object v0, v0, Lt2/g;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, Lh0/s1;->a:Landroidx/media3/exoplayer/offline/u;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget-object v2, v2, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ly2/y;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-object v2, v2, Ly2/y;->a:Lt2/g;

    .line 38
    .line 39
    iget-object v2, v2, Lt2/g;->b:Ljava/lang/String;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v2, v1

    .line 43
    :goto_1
    invoke-static {v0, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    iget-object v0, p0, Lh0/s1;->a:Landroidx/media3/exoplayer/offline/u;

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_3
    iput-object p1, v0, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_4
    iget-object v0, p0, Lh0/s1;->a:Landroidx/media3/exoplayer/offline/u;

    .line 58
    .line 59
    new-instance v2, Landroidx/media3/exoplayer/offline/u;

    .line 60
    .line 61
    const/16 v3, 0x13

    .line 62
    .line 63
    invoke-direct {v2, v3, v0, p1}, Landroidx/media3/exoplayer/offline/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, p0, Lh0/s1;->a:Landroidx/media3/exoplayer/offline/u;

    .line 67
    .line 68
    iput-object v1, p0, Lh0/s1;->b:Landroidx/media3/exoplayer/offline/u;

    .line 69
    .line 70
    iget v0, p0, Lh0/s1;->c:I

    .line 71
    .line 72
    iget-object p1, p1, Ly2/y;->a:Lt2/g;

    .line 73
    .line 74
    iget-object p1, p1, Lt2/g;->b:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    add-int/2addr p1, v0

    .line 81
    iput p1, p0, Lh0/s1;->c:I

    .line 82
    .line 83
    const v0, 0x186a0

    .line 84
    .line 85
    .line 86
    if-le p1, v0, :cond_a

    .line 87
    .line 88
    iget-object p1, p0, Lh0/s1;->a:Landroidx/media3/exoplayer/offline/u;

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    iget-object v0, p1, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Landroidx/media3/exoplayer/offline/u;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object v0, v1

    .line 98
    :goto_2
    if-nez v0, :cond_6

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_6
    :goto_3
    if-eqz p1, :cond_7

    .line 102
    .line 103
    iget-object v0, p1, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Landroidx/media3/exoplayer/offline/u;

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Landroidx/media3/exoplayer/offline/u;

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    move-object v0, v1

    .line 115
    :goto_4
    if-eqz v0, :cond_8

    .line 116
    .line 117
    iget-object p1, p1, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, Landroidx/media3/exoplayer/offline/u;

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_8
    if-nez p1, :cond_9

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_9
    iput-object v1, p1, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 126
    .line 127
    :cond_a
    :goto_5
    return-void
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

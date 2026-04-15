.class public final Lqg/k;
.super Ljava/io/InputStream;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Ljava/io/PushbackInputStream;

.field public b:Lqg/c;

.field public final c:Lc7/e1;

.field public d:Lrg/f;

.field public final e:Ljava/util/zip/CRC32;

.field public f:Z

.field public final g:Lrg/g;

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Lqg/h;)V
    .locals 4

    .line 1
    new-instance v0, Lrg/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x1000

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, Lrg/g;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lc7/e1;

    .line 13
    .line 14
    const/16 v3, 0x1a

    .line 15
    .line 16
    invoke-direct {v1, v3}, Lc7/e1;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lqg/k;->c:Lc7/e1;

    .line 20
    .line 21
    new-instance v1, Ljava/util/zip/CRC32;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lqg/k;->e:Ljava/util/zip/CRC32;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-boolean v1, p0, Lqg/k;->f:Z

    .line 30
    .line 31
    iput-boolean v1, p0, Lqg/k;->h:Z

    .line 32
    .line 33
    iput-boolean v1, p0, Lqg/k;->i:Z

    .line 34
    .line 35
    new-instance v1, Ljava/io/PushbackInputStream;

    .line 36
    .line 37
    invoke-direct {v1, p1, v2}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lqg/k;->a:Ljava/io/PushbackInputStream;

    .line 41
    .line 42
    iput-object v0, p0, Lqg/k;->g:Lrg/g;

    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lqg/k;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lqg/k;->i:Z

    .line 6
    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 11
    .line 12
    const-string v1, "Stream closed"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final b()V
    .locals 13

    .line 1
    iget-object v0, p0, Lqg/k;->b:Lqg/c;

    .line 2
    .line 3
    iget-object v1, p0, Lqg/k;->a:Ljava/io/PushbackInputStream;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lqg/c;->g(Ljava/io/PushbackInputStream;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v2, p0, Lqg/k;->b:Lqg/c;

    .line 10
    .line 11
    invoke-virtual {v2, v1, v0}, Lqg/c;->b(Ljava/io/InputStream;I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lqg/k;->d:Lrg/f;

    .line 15
    .line 16
    iget-boolean v2, v0, Lrg/b;->z:Z

    .line 17
    .line 18
    const/4 v3, 0x4

    .line 19
    const/4 v4, 0x1

    .line 20
    if-eqz v2, :cond_6

    .line 21
    .line 22
    iget-boolean v2, p0, Lqg/k;->f:Z

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    iget-object v0, v0, Lrg/b;->D:Ljava/util/List;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Lrg/d;

    .line 49
    .line 50
    iget-wide v5, v5, Lrg/d;->o:J

    .line 51
    .line 52
    const-wide/16 v7, 0x1

    .line 53
    .line 54
    cmp-long v9, v5, v7

    .line 55
    .line 56
    if-nez v9, :cond_3

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    :goto_0
    iget-object v5, p0, Lqg/k;->c:Lc7/e1;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-array v6, v3, [B

    .line 65
    .line 66
    invoke-static {v1, v6}, Ln7/d;->x(Ljava/io/InputStream;[B)I

    .line 67
    .line 68
    .line 69
    iget-object v5, v5, Lc7/e1;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v5, Ltc/b0;

    .line 72
    .line 73
    iget-object v7, v5, Ltc/b0;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v7, [B

    .line 76
    .line 77
    invoke-virtual {v5, v6, v2}, Ltc/b0;->n([BI)J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    const-wide/32 v10, 0x8074b50

    .line 82
    .line 83
    .line 84
    cmp-long v12, v8, v10

    .line 85
    .line 86
    if-nez v12, :cond_4

    .line 87
    .line 88
    invoke-static {v1, v6}, Ln7/d;->x(Ljava/io/InputStream;[B)I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v6, v2}, Ltc/b0;->n([BI)J

    .line 92
    .line 93
    .line 94
    move-result-wide v8

    .line 95
    :cond_4
    if-eqz v0, :cond_5

    .line 96
    .line 97
    array-length v0, v7

    .line 98
    invoke-static {v1, v7, v0}, Ltc/b0;->j(Ljava/io/InputStream;[BI)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v7, v2}, Ltc/b0;->n([BI)J

    .line 102
    .line 103
    .line 104
    move-result-wide v10

    .line 105
    array-length v0, v7

    .line 106
    invoke-static {v1, v7, v0}, Ltc/b0;->j(Ljava/io/InputStream;[BI)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v7, v2}, Ltc/b0;->n([BI)J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    goto :goto_1

    .line 114
    :cond_5
    invoke-virtual {v5, v1}, Ltc/b0;->k(Ljava/io/PushbackInputStream;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    int-to-long v10, v0

    .line 119
    invoke-virtual {v5, v1}, Ltc/b0;->k(Ljava/io/PushbackInputStream;)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    int-to-long v0, v0

    .line 124
    :goto_1
    iget-object v2, p0, Lqg/k;->d:Lrg/f;

    .line 125
    .line 126
    iput-wide v10, v2, Lrg/b;->s:J

    .line 127
    .line 128
    iput-wide v0, v2, Lrg/b;->t:J

    .line 129
    .line 130
    iput-wide v8, v2, Lrg/b;->r:J

    .line 131
    .line 132
    :cond_6
    :goto_2
    iget-object v0, p0, Lqg/k;->d:Lrg/f;

    .line 133
    .line 134
    iget v1, v0, Lrg/b;->y:I

    .line 135
    .line 136
    const/4 v2, 0x2

    .line 137
    iget-object v5, p0, Lqg/k;->e:Ljava/util/zip/CRC32;

    .line 138
    .line 139
    if-ne v1, v3, :cond_7

    .line 140
    .line 141
    iget-object v0, v0, Lrg/b;->B:Lrg/a;

    .line 142
    .line 143
    iget v0, v0, Lrg/a;->o:I

    .line 144
    .line 145
    invoke-static {v0, v2}, Lw0/c;->a(II)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_7

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    iget-object v0, p0, Lqg/k;->d:Lrg/f;

    .line 153
    .line 154
    iget-wide v0, v0, Lrg/b;->r:J

    .line 155
    .line 156
    invoke-virtual {v5}, Ljava/util/zip/CRC32;->getValue()J

    .line 157
    .line 158
    .line 159
    move-result-wide v6

    .line 160
    cmp-long v3, v0, v6

    .line 161
    .line 162
    if-nez v3, :cond_8

    .line 163
    .line 164
    :goto_3
    const/4 v0, 0x0

    .line 165
    iput-object v0, p0, Lqg/k;->d:Lrg/f;

    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/util/zip/CRC32;->reset()V

    .line 168
    .line 169
    .line 170
    iput-boolean v4, p0, Lqg/k;->i:Z

    .line 171
    .line 172
    return-void

    .line 173
    :cond_8
    iget-object v0, p0, Lqg/k;->d:Lrg/f;

    .line 174
    .line 175
    iget-boolean v1, v0, Lrg/b;->x:Z

    .line 176
    .line 177
    if-eqz v1, :cond_9

    .line 178
    .line 179
    iget v0, v0, Lrg/b;->y:I

    .line 180
    .line 181
    invoke-static {v2, v0}, Lw0/c;->a(II)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    :cond_9
    new-instance v0, Log/a;

    .line 186
    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v2, "Reached end of entry, but crc verification failed for "

    .line 190
    .line 191
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object v2, p0, Lqg/k;->d:Lrg/f;

    .line 195
    .line 196
    iget-object v2, v2, Lrg/b;->v:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqg/k;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lqg/k;->b:Lqg/c;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lqg/c;->close()V

    .line 11
    .line 12
    .line 13
    :cond_1
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lqg/k;->h:Z

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final g(Lrg/e;)Lrg/f;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lqg/k;->g:Lrg/g;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Lqg/k;->c:Lc7/e1;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v4, Lrg/f;

    .line 16
    .line 17
    invoke-direct {v4}, Lrg/b;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x4

    .line 21
    new-array v6, v5, [B

    .line 22
    .line 23
    iget-object v7, v3, Lc7/e1;->c:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v9, v7

    .line 26
    check-cast v9, Ltc/b0;

    .line 27
    .line 28
    iget-object v7, v9, Ltc/b0;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v7, [B

    .line 31
    .line 32
    iget-object v8, v9, Ltc/b0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v8, [B

    .line 35
    .line 36
    iget-object v10, v0, Lqg/k;->a:Ljava/io/PushbackInputStream;

    .line 37
    .line 38
    invoke-virtual {v9, v10}, Ltc/b0;->k(Ljava/io/PushbackInputStream;)I

    .line 39
    .line 40
    .line 41
    move-result v11

    .line 42
    int-to-long v12, v11

    .line 43
    const-wide/32 v14, 0x30304b50

    .line 44
    .line 45
    .line 46
    cmp-long v16, v12, v14

    .line 47
    .line 48
    if-nez v16, :cond_0

    .line 49
    .line 50
    invoke-virtual {v9, v10}, Ltc/b0;->k(Ljava/io/PushbackInputStream;)I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    :cond_0
    int-to-long v11, v11

    .line 55
    const-wide/32 v16, 0x4034b50

    .line 56
    .line 57
    .line 58
    const/4 v14, 0x2

    .line 59
    const-wide/16 v18, -0x1

    .line 60
    .line 61
    const-string v13, "\\"

    .line 62
    .line 63
    const/16 v20, 0x1

    .line 64
    .line 65
    const-string v15, "/"

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    cmp-long v22, v11, v16

    .line 69
    .line 70
    if-eqz v22, :cond_1

    .line 71
    .line 72
    move-object/from16 v23, v10

    .line 73
    .line 74
    move-object v7, v13

    .line 75
    move-object v5, v15

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v6, 0x2

    .line 78
    const/16 v17, 0x0

    .line 79
    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :cond_1
    array-length v11, v8

    .line 83
    invoke-static {v10, v8, v11}, Ltc/b0;->j(Ljava/io/InputStream;[BI)V

    .line 84
    .line 85
    .line 86
    invoke-static {v8, v5}, Ltc/b0;->o([BI)I

    .line 87
    .line 88
    .line 89
    new-array v11, v14, [B

    .line 90
    .line 91
    invoke-static {v10, v11}, Ln7/d;->x(Ljava/io/InputStream;[B)I

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-ne v12, v14, :cond_1f

    .line 96
    .line 97
    aget-byte v12, v11, v5

    .line 98
    .line 99
    invoke-static {v12, v5}, Lnd/h;->p(BI)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    iput-boolean v12, v4, Lrg/b;->x:Z

    .line 104
    .line 105
    aget-byte v12, v11, v5

    .line 106
    .line 107
    const/4 v14, 0x3

    .line 108
    invoke-static {v12, v14}, Lnd/h;->p(BI)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    iput-boolean v12, v4, Lrg/b;->z:Z

    .line 113
    .line 114
    aget-byte v12, v11, v20

    .line 115
    .line 116
    invoke-static {v12, v14}, Lnd/h;->p(BI)Z

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    iput-boolean v12, v4, Lrg/b;->C:Z

    .line 121
    .line 122
    invoke-virtual {v11}, [B->clone()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    check-cast v11, [B

    .line 127
    .line 128
    iput-object v11, v4, Lrg/b;->o:[B

    .line 129
    .line 130
    array-length v11, v8

    .line 131
    invoke-static {v10, v8, v11}, Ltc/b0;->j(Ljava/io/InputStream;[BI)V

    .line 132
    .line 133
    .line 134
    invoke-static {v8, v5}, Ltc/b0;->o([BI)I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    invoke-static {v11}, Lq/t0;->e(I)I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    iput v11, v4, Lrg/b;->p:I

    .line 143
    .line 144
    invoke-virtual {v9, v10}, Ltc/b0;->k(Ljava/io/PushbackInputStream;)I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    int-to-long v11, v11

    .line 149
    iput-wide v11, v4, Lrg/b;->q:J

    .line 150
    .line 151
    invoke-static {v10, v6}, Ln7/d;->x(Ljava/io/InputStream;[B)I

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9, v6, v5}, Ltc/b0;->n([BI)J

    .line 155
    .line 156
    .line 157
    move-result-wide v11

    .line 158
    iput-wide v11, v4, Lrg/b;->r:J

    .line 159
    .line 160
    invoke-static {v7, v5}, Ljava/util/Arrays;->fill([BB)V

    .line 161
    .line 162
    .line 163
    const/4 v6, 0x4

    .line 164
    invoke-static {v10, v7, v6}, Ltc/b0;->j(Ljava/io/InputStream;[BI)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v9, v7, v5}, Ltc/b0;->n([BI)J

    .line 168
    .line 169
    .line 170
    move-result-wide v11

    .line 171
    iput-wide v11, v4, Lrg/b;->s:J

    .line 172
    .line 173
    invoke-static {v7, v5}, Ljava/util/Arrays;->fill([BB)V

    .line 174
    .line 175
    .line 176
    invoke-static {v10, v7, v6}, Ltc/b0;->j(Ljava/io/InputStream;[BI)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9, v7, v5}, Ltc/b0;->n([BI)J

    .line 180
    .line 181
    .line 182
    move-result-wide v6

    .line 183
    iput-wide v6, v4, Lrg/b;->t:J

    .line 184
    .line 185
    array-length v6, v8

    .line 186
    invoke-static {v10, v8, v6}, Ltc/b0;->j(Ljava/io/InputStream;[BI)V

    .line 187
    .line 188
    .line 189
    invoke-static {v8, v5}, Ltc/b0;->o([BI)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    array-length v7, v8

    .line 194
    invoke-static {v10, v8, v7}, Ltc/b0;->j(Ljava/io/InputStream;[BI)V

    .line 195
    .line 196
    .line 197
    invoke-static {v8, v5}, Ltc/b0;->o([BI)I

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    iput v7, v4, Lrg/b;->u:I

    .line 202
    .line 203
    if-lez v6, :cond_1e

    .line 204
    .line 205
    new-array v6, v6, [B

    .line 206
    .line 207
    invoke-static {v10, v6}, Ln7/d;->x(Ljava/io/InputStream;[B)I

    .line 208
    .line 209
    .line 210
    iget-boolean v7, v4, Lrg/b;->C:Z

    .line 211
    .line 212
    const/4 v8, 0x0

    .line 213
    invoke-static {v6, v7, v8}, Lu3/x0;->j([BZLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    iput-object v7, v4, Lrg/b;->v:Ljava/lang/String;

    .line 218
    .line 219
    iput-object v6, v4, Lrg/b;->w:[B

    .line 220
    .line 221
    invoke-virtual {v7, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-nez v6, :cond_3

    .line 226
    .line 227
    invoke-virtual {v7, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-eqz v6, :cond_2

    .line 232
    .line 233
    goto :goto_0

    .line 234
    :cond_2
    const/4 v6, 0x0

    .line 235
    goto :goto_1

    .line 236
    :cond_3
    :goto_0
    const/4 v6, 0x1

    .line 237
    :goto_1
    iput-boolean v6, v4, Lrg/b;->E:Z

    .line 238
    .line 239
    iget v6, v4, Lrg/b;->u:I

    .line 240
    .line 241
    if-gtz v6, :cond_4

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_4
    const/4 v7, 0x4

    .line 245
    if-ge v6, v7, :cond_6

    .line 246
    .line 247
    if-lez v6, :cond_5

    .line 248
    .line 249
    int-to-long v6, v6

    .line 250
    invoke-virtual {v10, v6, v7}, Ljava/io/InputStream;->skip(J)J

    .line 251
    .line 252
    .line 253
    :cond_5
    const/4 v8, 0x0

    .line 254
    goto :goto_2

    .line 255
    :cond_6
    new-array v7, v6, [B

    .line 256
    .line 257
    invoke-static {v10, v7}, Ln7/d;->x(Ljava/io/InputStream;[B)I

    .line 258
    .line 259
    .line 260
    :try_start_0
    invoke-virtual {v3, v7, v6}, Lc7/e1;->N([BI)Ljava/util/ArrayList;

    .line 261
    .line 262
    .line 263
    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    goto :goto_2

    .line 265
    :catch_0
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 266
    .line 267
    :goto_2
    iput-object v8, v4, Lrg/b;->D:Ljava/util/List;

    .line 268
    .line 269
    :goto_3
    iget-object v3, v4, Lrg/b;->D:Ljava/util/List;

    .line 270
    .line 271
    if-eqz v3, :cond_7

    .line 272
    .line 273
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-gtz v3, :cond_8

    .line 278
    .line 279
    :cond_7
    move-object/from16 v23, v10

    .line 280
    .line 281
    move-object v7, v13

    .line 282
    move-object v5, v15

    .line 283
    const/4 v3, 0x3

    .line 284
    const/4 v6, 0x2

    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_8
    iget-object v8, v4, Lrg/b;->D:Ljava/util/List;

    .line 289
    .line 290
    move-object v3, v10

    .line 291
    iget-wide v10, v4, Lrg/b;->t:J

    .line 292
    .line 293
    move-object v6, v13

    .line 294
    iget-wide v12, v4, Lrg/b;->s:J

    .line 295
    .line 296
    move-object v7, v15

    .line 297
    const/16 v17, 0x3

    .line 298
    .line 299
    const-wide/16 v14, 0x0

    .line 300
    .line 301
    const/16 v22, 0x2

    .line 302
    .line 303
    const/16 v16, 0x0

    .line 304
    .line 305
    move-object/from16 v23, v3

    .line 306
    .line 307
    move-object v5, v7

    .line 308
    const/4 v3, 0x3

    .line 309
    const/16 v17, 0x0

    .line 310
    .line 311
    move-object v7, v6

    .line 312
    const/4 v6, 0x2

    .line 313
    invoke-static/range {v8 .. v16}, Lc7/e1;->S(Ljava/util/List;Ltc/b0;JJJI)Lrg/i;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    if-nez v8, :cond_9

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_9
    iput-object v8, v4, Lrg/b;->A:Lrg/i;

    .line 321
    .line 322
    iget-wide v10, v8, Lrg/i;->p:J

    .line 323
    .line 324
    cmp-long v12, v10, v18

    .line 325
    .line 326
    if-eqz v12, :cond_a

    .line 327
    .line 328
    iput-wide v10, v4, Lrg/b;->t:J

    .line 329
    .line 330
    :cond_a
    iget-wide v10, v8, Lrg/i;->o:J

    .line 331
    .line 332
    cmp-long v8, v10, v18

    .line 333
    .line 334
    if-eqz v8, :cond_b

    .line 335
    .line 336
    iput-wide v10, v4, Lrg/b;->s:J

    .line 337
    .line 338
    :cond_b
    :goto_4
    invoke-static {v4, v9}, Lc7/e1;->P(Lrg/b;Ltc/b0;)V

    .line 339
    .line 340
    .line 341
    iget-boolean v8, v4, Lrg/b;->x:Z

    .line 342
    .line 343
    if-eqz v8, :cond_e

    .line 344
    .line 345
    iget v8, v4, Lrg/b;->y:I

    .line 346
    .line 347
    const/4 v9, 0x4

    .line 348
    if-ne v8, v9, :cond_c

    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_c
    iget-object v8, v4, Lrg/b;->o:[B

    .line 352
    .line 353
    aget-byte v8, v8, v17

    .line 354
    .line 355
    const/4 v9, 0x6

    .line 356
    invoke-static {v8, v9}, Lnd/h;->p(BI)Z

    .line 357
    .line 358
    .line 359
    move-result v8

    .line 360
    if-eqz v8, :cond_d

    .line 361
    .line 362
    iput v3, v4, Lrg/b;->y:I

    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_d
    iput v6, v4, Lrg/b;->y:I

    .line 366
    .line 367
    :cond_e
    :goto_5
    iput-object v4, v0, Lqg/k;->d:Lrg/f;

    .line 368
    .line 369
    if-nez v4, :cond_f

    .line 370
    .line 371
    const/16 v21, 0x0

    .line 372
    .line 373
    return-object v21

    .line 374
    :cond_f
    iget-object v3, v4, Lrg/b;->v:Ljava/lang/String;

    .line 375
    .line 376
    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    const-wide/16 v8, 0x0

    .line 381
    .line 382
    if-nez v5, :cond_12

    .line 383
    .line 384
    invoke-virtual {v3, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    if-eqz v3, :cond_10

    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_10
    iget v3, v4, Lrg/b;->p:I

    .line 392
    .line 393
    const/4 v5, 0x1

    .line 394
    if-ne v3, v5, :cond_12

    .line 395
    .line 396
    iget-wide v10, v4, Lrg/b;->t:J

    .line 397
    .line 398
    cmp-long v3, v10, v8

    .line 399
    .line 400
    if-ltz v3, :cond_11

    .line 401
    .line 402
    goto :goto_6

    .line 403
    :cond_11
    new-instance v1, Ljava/io/IOException;

    .line 404
    .line 405
    new-instance v2, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    const-string v3, "Invalid local file header for: "

    .line 408
    .line 409
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    iget-object v3, v4, Lrg/b;->v:Ljava/lang/String;

    .line 413
    .line 414
    const-string v4, ". Uncompressed size has to be set for entry of compression type store which is not a directory"

    .line 415
    .line 416
    invoke-static {v2, v3, v4}, Lj2/h0;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw v1

    .line 424
    :cond_12
    :goto_6
    iget-object v3, v0, Lqg/k;->e:Ljava/util/zip/CRC32;

    .line 425
    .line 426
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->reset()V

    .line 427
    .line 428
    .line 429
    if-eqz v1, :cond_13

    .line 430
    .line 431
    iget-object v3, v0, Lqg/k;->d:Lrg/f;

    .line 432
    .line 433
    iget-wide v4, v1, Lrg/b;->r:J

    .line 434
    .line 435
    iput-wide v4, v3, Lrg/b;->r:J

    .line 436
    .line 437
    iget-wide v4, v1, Lrg/b;->s:J

    .line 438
    .line 439
    iput-wide v4, v3, Lrg/b;->s:J

    .line 440
    .line 441
    iget-wide v4, v1, Lrg/b;->t:J

    .line 442
    .line 443
    iput-wide v4, v3, Lrg/b;->t:J

    .line 444
    .line 445
    iget-boolean v1, v1, Lrg/b;->E:Z

    .line 446
    .line 447
    iput-boolean v1, v3, Lrg/b;->E:Z

    .line 448
    .line 449
    const/4 v5, 0x1

    .line 450
    iput-boolean v5, v0, Lqg/k;->f:Z

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :cond_13
    const/4 v1, 0x0

    .line 454
    const/4 v5, 0x1

    .line 455
    iput-boolean v1, v0, Lqg/k;->f:Z

    .line 456
    .line 457
    :goto_7
    iget-object v12, v0, Lqg/k;->d:Lrg/f;

    .line 458
    .line 459
    new-instance v11, Lqg/j;

    .line 460
    .line 461
    invoke-static {v12}, Ln7/d;->r(Lrg/b;)I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    invoke-static {v1, v5}, Lw0/c;->a(II)Z

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    if-eqz v1, :cond_14

    .line 470
    .line 471
    iget-wide v3, v12, Lrg/b;->t:J

    .line 472
    .line 473
    goto :goto_a

    .line 474
    :cond_14
    iget-boolean v1, v12, Lrg/b;->z:Z

    .line 475
    .line 476
    if-eqz v1, :cond_15

    .line 477
    .line 478
    iget-boolean v1, v0, Lqg/k;->f:Z

    .line 479
    .line 480
    if-nez v1, :cond_15

    .line 481
    .line 482
    :goto_8
    move-wide/from16 v3, v18

    .line 483
    .line 484
    goto :goto_a

    .line 485
    :cond_15
    iget-wide v3, v12, Lrg/b;->s:J

    .line 486
    .line 487
    iget-boolean v1, v12, Lrg/b;->x:Z

    .line 488
    .line 489
    if-nez v1, :cond_17

    .line 490
    .line 491
    :cond_16
    const/4 v1, 0x0

    .line 492
    goto :goto_9

    .line 493
    :cond_17
    iget v1, v12, Lrg/b;->y:I

    .line 494
    .line 495
    const/4 v7, 0x4

    .line 496
    invoke-static {v1, v7}, Lw0/c;->a(II)Z

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    const/16 v5, 0xc

    .line 501
    .line 502
    if-eqz v1, :cond_19

    .line 503
    .line 504
    iget-object v1, v12, Lrg/b;->B:Lrg/a;

    .line 505
    .line 506
    if-eqz v1, :cond_18

    .line 507
    .line 508
    iget v1, v1, Lrg/a;->p:I

    .line 509
    .line 510
    if-eqz v1, :cond_18

    .line 511
    .line 512
    invoke-static {v1}, Lq/t0;->u(I)I

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    add-int/2addr v1, v5

    .line 517
    goto :goto_9

    .line 518
    :cond_18
    new-instance v1, Log/a;

    .line 519
    .line 520
    const-string v2, "AesExtraDataRecord not found or invalid for Aes encrypted entry"

    .line 521
    .line 522
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    throw v1

    .line 526
    :cond_19
    iget v1, v12, Lrg/b;->y:I

    .line 527
    .line 528
    invoke-static {v1, v6}, Lw0/c;->a(II)Z

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    if-eqz v1, :cond_16

    .line 533
    .line 534
    const/16 v1, 0xc

    .line 535
    .line 536
    :goto_9
    int-to-long v13, v1

    .line 537
    sub-long v18, v3, v13

    .line 538
    .line 539
    goto :goto_8

    .line 540
    :goto_a
    invoke-direct {v11}, Ljava/io/InputStream;-><init>()V

    .line 541
    .line 542
    .line 543
    iput-wide v8, v11, Lqg/j;->b:J

    .line 544
    .line 545
    const/4 v5, 0x1

    .line 546
    new-array v1, v5, [B

    .line 547
    .line 548
    iput-object v1, v11, Lqg/j;->c:[B

    .line 549
    .line 550
    move-object/from16 v1, v23

    .line 551
    .line 552
    iput-object v1, v11, Lqg/j;->a:Ljava/io/PushbackInputStream;

    .line 553
    .line 554
    iput-wide v3, v11, Lqg/j;->d:J

    .line 555
    .line 556
    iget-boolean v1, v12, Lrg/b;->x:Z

    .line 557
    .line 558
    if-nez v1, :cond_1a

    .line 559
    .line 560
    new-instance v10, Lqg/e;

    .line 561
    .line 562
    iget v14, v2, Lrg/g;->a:I

    .line 563
    .line 564
    const/4 v15, 0x1

    .line 565
    const/16 v16, 0x0

    .line 566
    .line 567
    const/4 v13, 0x0

    .line 568
    invoke-direct/range {v10 .. v16}, Lqg/e;-><init>(Lqg/j;Lrg/f;[CIZI)V

    .line 569
    .line 570
    .line 571
    goto :goto_b

    .line 572
    :cond_1a
    iget v1, v12, Lrg/b;->y:I

    .line 573
    .line 574
    const/4 v7, 0x4

    .line 575
    if-ne v1, v7, :cond_1b

    .line 576
    .line 577
    new-instance v10, Lqg/a;

    .line 578
    .line 579
    iget v14, v2, Lrg/g;->a:I

    .line 580
    .line 581
    iget-boolean v15, v2, Lrg/g;->b:Z

    .line 582
    .line 583
    const/4 v13, 0x0

    .line 584
    invoke-direct/range {v10 .. v15}, Lqg/b;-><init>(Lqg/j;Lrg/f;[CIZ)V

    .line 585
    .line 586
    .line 587
    const/4 v5, 0x1

    .line 588
    new-array v1, v5, [B

    .line 589
    .line 590
    iput-object v1, v10, Lqg/a;->e:[B

    .line 591
    .line 592
    const/16 v1, 0x10

    .line 593
    .line 594
    new-array v1, v1, [B

    .line 595
    .line 596
    iput-object v1, v10, Lqg/a;->f:[B

    .line 597
    .line 598
    const/4 v1, 0x0

    .line 599
    iput v1, v10, Lqg/a;->g:I

    .line 600
    .line 601
    iput v1, v10, Lqg/a;->h:I

    .line 602
    .line 603
    iput v1, v10, Lqg/a;->i:I

    .line 604
    .line 605
    iput v1, v10, Lqg/a;->j:I

    .line 606
    .line 607
    iput v1, v10, Lqg/a;->k:I

    .line 608
    .line 609
    iput v1, v10, Lqg/a;->l:I

    .line 610
    .line 611
    goto :goto_b

    .line 612
    :cond_1b
    if-ne v1, v6, :cond_1d

    .line 613
    .line 614
    new-instance v10, Lqg/e;

    .line 615
    .line 616
    iget v14, v2, Lrg/g;->a:I

    .line 617
    .line 618
    iget-boolean v15, v2, Lrg/g;->b:Z

    .line 619
    .line 620
    const/16 v16, 0x1

    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    invoke-direct/range {v10 .. v16}, Lqg/e;-><init>(Lqg/j;Lrg/f;[CIZI)V

    .line 624
    .line 625
    .line 626
    :goto_b
    invoke-static {v12}, Ln7/d;->r(Lrg/b;)I

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    if-ne v1, v6, :cond_1c

    .line 631
    .line 632
    new-instance v1, Lqg/d;

    .line 633
    .line 634
    iget v2, v2, Lrg/g;->a:I

    .line 635
    .line 636
    invoke-direct {v1, v10}, Lqg/c;-><init>(Lqg/b;)V

    .line 637
    .line 638
    .line 639
    const/4 v5, 0x1

    .line 640
    new-array v3, v5, [B

    .line 641
    .line 642
    iput-object v3, v1, Lqg/d;->e:[B

    .line 643
    .line 644
    new-instance v3, Ljava/util/zip/Inflater;

    .line 645
    .line 646
    invoke-direct {v3, v5}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 647
    .line 648
    .line 649
    iput-object v3, v1, Lqg/d;->c:Ljava/util/zip/Inflater;

    .line 650
    .line 651
    new-array v2, v2, [B

    .line 652
    .line 653
    iput-object v2, v1, Lqg/d;->d:[B

    .line 654
    .line 655
    goto :goto_c

    .line 656
    :cond_1c
    new-instance v1, Lqg/i;

    .line 657
    .line 658
    invoke-direct {v1, v10}, Lqg/c;-><init>(Lqg/b;)V

    .line 659
    .line 660
    .line 661
    :goto_c
    iput-object v1, v0, Lqg/k;->b:Lqg/c;

    .line 662
    .line 663
    const/4 v1, 0x0

    .line 664
    iput-boolean v1, v0, Lqg/k;->i:Z

    .line 665
    .line 666
    iget-object v1, v0, Lqg/k;->d:Lrg/f;

    .line 667
    .line 668
    return-object v1

    .line 669
    :cond_1d
    iget-object v1, v12, Lrg/b;->v:Ljava/lang/String;

    .line 670
    .line 671
    const-string v2, "Entry ["

    .line 672
    .line 673
    const-string v3, "] Strong Encryption not supported"

    .line 674
    .line 675
    invoke-static {v2, v1, v3}, Lq/t0;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    new-instance v2, Log/a;

    .line 680
    .line 681
    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    throw v2

    .line 685
    :cond_1e
    new-instance v1, Log/a;

    .line 686
    .line 687
    const-string v2, "Invalid entry name in local file header"

    .line 688
    .line 689
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    throw v1

    .line 693
    :cond_1f
    new-instance v1, Log/a;

    .line 694
    .line 695
    const-string v2, "Could not read enough bytes for generalPurposeFlags"

    .line 696
    .line 697
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    throw v1
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 1
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 2
    invoke-virtual {p0, v1, v2, v0}, Lqg/k;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    .line 3
    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 4
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lqg/k;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 2

    .line 5
    iget-boolean v0, p0, Lqg/k;->h:Z

    if-nez v0, :cond_5

    if-ltz p3, :cond_4

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 6
    :cond_0
    iget-object v0, p0, Lqg/k;->d:Lrg/f;

    const/4 v1, -0x1

    if-nez v0, :cond_1

    return v1

    .line 7
    :cond_1
    :try_start_0
    iget-object v0, p0, Lqg/k;->b:Lqg/c;

    invoke-virtual {v0, p1, p2, p3}, Lqg/c;->read([BII)I

    move-result p3

    if-ne p3, v1, :cond_2

    .line 8
    invoke-virtual {p0}, Lqg/k;->b()V

    return p3

    :catch_0
    move-exception p1

    goto :goto_0

    .line 9
    :cond_2
    iget-object v0, p0, Lqg/k;->e:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p3

    .line 10
    :goto_0
    iget-object p2, p0, Lqg/k;->d:Lrg/f;

    .line 11
    iget-boolean p3, p2, Lrg/b;->x:Z

    if-eqz p3, :cond_3

    const/4 p3, 0x2

    .line 12
    iget p2, p2, Lrg/b;->y:I

    .line 13
    invoke-static {p3, p2}, Lw0/c;->a(II)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 14
    new-instance p2, Log/a;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 15
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    throw p2

    .line 17
    :cond_3
    throw p1

    .line 18
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative read length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

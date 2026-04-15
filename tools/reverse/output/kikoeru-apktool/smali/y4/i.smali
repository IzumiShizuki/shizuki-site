.class public final Ly4/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lzg/h;


# instance fields
.field public final a:J

.field public b:J

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLz4/m;Lz4/b;Lk5/e;JLy4/h;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-wide p1, p0, Ly4/i;->a:J

    .line 10
    iput-object p3, p0, Ly4/i;->d:Ljava/lang/Object;

    .line 11
    iput-object p4, p0, Ly4/i;->e:Ljava/lang/Object;

    .line 12
    iput-wide p6, p0, Ly4/i;->b:J

    .line 13
    iput-object p5, p0, Ly4/i;->c:Ljava/lang/Object;

    .line 14
    iput-object p8, p0, Ly4/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzg/p;Lyg/c;)V
    .locals 2

    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly4/i;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Ly4/i;->d:Ljava/lang/Object;

    .line 4
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0xfa

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    iput-wide p1, p0, Ly4/i;->a:J

    const-wide/high16 p1, -0x8000000000000000L

    .line 5
    iput-wide p1, p0, Ly4/i;->b:J

    .line 6
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Ly4/i;->e:Ljava/lang/Object;

    .line 7
    new-instance p1, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object p1, p0, Ly4/i;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lzg/o;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :cond_0
    :goto_0
    :try_start_0
    iget-object v2, p0, Ly4/i;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    iget-object v2, p0, Ly4/i;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lzg/p;

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Lzg/p;->a(Lzg/o;)Z

    .line 18
    .line 19
    .line 20
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0}, Ly4/i;->b()V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto/16 :goto_8

    .line 33
    .line 34
    :cond_2
    :goto_1
    :try_start_1
    iget-object v2, p0, Ly4/i;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lzg/p;

    .line 37
    .line 38
    iget-object v2, v2, Lzg/p;->k:Lzg/n;

    .line 39
    .line 40
    iget-boolean v2, v2, Lzg/n;->p:Z

    .line 41
    .line 42
    if-nez v2, :cond_f

    .line 43
    .line 44
    iget-object v2, p0, Ly4/i;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lyg/c;

    .line 47
    .line 48
    iget-object v2, v2, Lyg/c;->a:Lxa/h;

    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    iget-wide v4, p0, Ly4/i;->b:J

    .line 55
    .line 56
    sub-long/2addr v4, v2

    .line 57
    iget-object v6, p0, Ly4/i;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-nez v6, :cond_4

    .line 66
    .line 67
    const-wide/16 v6, 0x0

    .line 68
    .line 69
    cmp-long v8, v4, v6

    .line 70
    .line 71
    if-gtz v8, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-wide v5, v4

    .line 75
    move-object v4, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    :goto_2
    invoke-virtual {p0}, Ly4/i;->k()Lzg/r;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iget-wide v5, p0, Ly4/i;->a:J

    .line 82
    .line 83
    add-long/2addr v2, v5

    .line 84
    iput-wide v2, p0, Ly4/i;->b:J

    .line 85
    .line 86
    :goto_3
    if-nez v4, :cond_7

    .line 87
    .line 88
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 89
    .line 90
    iget-object v3, p0, Ly4/i;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    :goto_4
    move-object v4, v0

    .line 101
    goto :goto_5

    .line 102
    :cond_5
    iget-object v4, p0, Ly4/i;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v4, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 105
    .line 106
    invoke-virtual {v4, v5, v6, v2}, Ljava/util/concurrent/LinkedBlockingDeque;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Lzg/r;

    .line 111
    .line 112
    if-nez v2, :cond_6

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    iget-object v4, v2, Lzg/r;->a:Lzg/s;

    .line 116
    .line 117
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-object v4, v2

    .line 121
    :goto_5
    if-nez v4, :cond_7

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_7
    iget-object v2, v4, Lzg/r;->b:Lzg/s;

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    const/4 v5, 0x1

    .line 128
    if-nez v2, :cond_8

    .line 129
    .line 130
    iget-object v2, v4, Lzg/r;->c:Ljava/lang/Throwable;

    .line 131
    .line 132
    if-nez v2, :cond_8

    .line 133
    .line 134
    const/4 v2, 0x1

    .line 135
    goto :goto_6

    .line 136
    :cond_8
    const/4 v2, 0x0

    .line 137
    :goto_6
    if-eqz v2, :cond_b

    .line 138
    .line 139
    invoke-virtual {p0}, Ly4/i;->b()V

    .line 140
    .line 141
    .line 142
    iget-object v2, v4, Lzg/r;->a:Lzg/s;

    .line 143
    .line 144
    invoke-interface {v2}, Lzg/s;->a()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_9

    .line 149
    .line 150
    iget-object v2, v4, Lzg/r;->a:Lzg/s;

    .line 151
    .line 152
    invoke-interface {v2}, Lzg/s;->g()Lzg/r;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    :cond_9
    iget-object v2, v4, Lzg/r;->b:Lzg/s;

    .line 157
    .line 158
    if-nez v2, :cond_a

    .line 159
    .line 160
    iget-object v2, v4, Lzg/r;->c:Ljava/lang/Throwable;

    .line 161
    .line 162
    if-nez v2, :cond_a

    .line 163
    .line 164
    const/4 v3, 0x1

    .line 165
    :cond_a
    if-eqz v3, :cond_b

    .line 166
    .line 167
    iget-object v0, v4, Lzg/r;->a:Lzg/s;

    .line 168
    .line 169
    invoke-interface {v0}, Lzg/s;->c()Lzg/o;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    invoke-virtual {p0}, Ly4/i;->b()V

    .line 174
    .line 175
    .line 176
    return-object v0

    .line 177
    :cond_b
    :try_start_2
    iget-object v2, v4, Lzg/r;->c:Ljava/lang/Throwable;

    .line 178
    .line 179
    if-eqz v2, :cond_e

    .line 180
    .line 181
    instance-of v3, v2, Ljava/io/IOException;

    .line 182
    .line 183
    if-eqz v3, :cond_d

    .line 184
    .line 185
    if-nez v1, :cond_c

    .line 186
    .line 187
    check-cast v2, Ljava/io/IOException;

    .line 188
    .line 189
    move-object v1, v2

    .line 190
    goto :goto_7

    .line 191
    :cond_c
    invoke-static {v1, v2}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_d
    throw v2

    .line 196
    :cond_e
    :goto_7
    iget-object v2, v4, Lzg/r;->b:Lzg/s;

    .line 197
    .line 198
    if-eqz v2, :cond_0

    .line 199
    .line 200
    iget-object v3, p0, Ly4/i;->c:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v3, Lzg/p;

    .line 203
    .line 204
    iget-object v3, v3, Lzg/p;->p:Lvb/j;

    .line 205
    .line 206
    invoke-virtual {v3, v2}, Lvb/j;->addFirst(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_f
    new-instance v0, Ljava/io/IOException;

    .line 212
    .line 213
    const-string v1, "Canceled"

    .line 214
    .line 215
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 219
    :goto_8
    invoke-virtual {p0}, Ly4/i;->b()V

    .line 220
    .line 221
    .line 222
    throw v0
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

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly4/i;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "iterator(...)"

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lzg/s;

    .line 25
    .line 26
    invoke-interface {v2}, Lzg/s;->cancel()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v2}, Lzg/s;->b()Lzg/s;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v3, p0, Ly4/i;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Lzg/p;

    .line 39
    .line 40
    iget-object v3, v3, Lzg/p;->p:Lvb/j;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, Lvb/j;->addLast(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 47
    .line 48
    .line 49
    return-void
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
.end method

.method public c(JLz4/m;)Ly4/i;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ly4/i;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lz4/m;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz4/m;->d()Ly4/h;

    .line 8
    .line 9
    .line 10
    move-result-object v9

    .line 11
    move-object v1, v9

    .line 12
    invoke-virtual/range {p3 .. p3}, Lz4/m;->d()Ly4/h;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move-object v9, v1

    .line 19
    new-instance v1, Ly4/i;

    .line 20
    .line 21
    iget-object v2, v0, Ly4/i;->e:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, v2

    .line 24
    check-cast v5, Lz4/b;

    .line 25
    .line 26
    iget-object v2, v0, Ly4/i;->c:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v6, v2

    .line 29
    check-cast v6, Lk5/e;

    .line 30
    .line 31
    iget-wide v7, v0, Ly4/i;->b:J

    .line 32
    .line 33
    move-wide/from16 v2, p1

    .line 34
    .line 35
    move-object/from16 v4, p3

    .line 36
    .line 37
    invoke-direct/range {v1 .. v9}, Ly4/i;-><init>(JLz4/m;Lz4/b;Lk5/e;JLy4/h;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_0
    move-object/from16 v20, v9

    .line 42
    .line 43
    move-object v9, v1

    .line 44
    move-object/from16 v1, v20

    .line 45
    .line 46
    invoke-interface {v9}, Ly4/h;->s()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    move-object v9, v1

    .line 53
    new-instance v1, Ly4/i;

    .line 54
    .line 55
    iget-object v2, v0, Ly4/i;->e:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v5, v2

    .line 58
    check-cast v5, Lz4/b;

    .line 59
    .line 60
    iget-object v2, v0, Ly4/i;->c:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v6, v2

    .line 63
    check-cast v6, Lk5/e;

    .line 64
    .line 65
    iget-wide v7, v0, Ly4/i;->b:J

    .line 66
    .line 67
    move-wide/from16 v2, p1

    .line 68
    .line 69
    move-object/from16 v4, p3

    .line 70
    .line 71
    invoke-direct/range {v1 .. v9}, Ly4/i;-><init>(JLz4/m;Lz4/b;Lk5/e;JLy4/h;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_1
    move-object v2, v9

    .line 76
    move-object v9, v1

    .line 77
    move-object v1, v2

    .line 78
    move-wide/from16 v2, p1

    .line 79
    .line 80
    invoke-interface {v1, v2, v3}, Ly4/h;->x(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    const-wide/16 v6, 0x0

    .line 85
    .line 86
    cmp-long v8, v4, v6

    .line 87
    .line 88
    if-nez v8, :cond_2

    .line 89
    .line 90
    new-instance v1, Ly4/i;

    .line 91
    .line 92
    iget-object v4, v0, Ly4/i;->e:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v5, v4

    .line 95
    check-cast v5, Lz4/b;

    .line 96
    .line 97
    iget-object v4, v0, Ly4/i;->c:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v6, v4

    .line 100
    check-cast v6, Lk5/e;

    .line 101
    .line 102
    iget-wide v7, v0, Ly4/i;->b:J

    .line 103
    .line 104
    move-object/from16 v4, p3

    .line 105
    .line 106
    invoke-direct/range {v1 .. v9}, Ly4/i;-><init>(JLz4/m;Lz4/b;Lk5/e;JLy4/h;)V

    .line 107
    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_2
    invoke-static {v9}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v1}, Ly4/h;->v()J

    .line 114
    .line 115
    .line 116
    move-result-wide v6

    .line 117
    invoke-interface {v1, v6, v7}, Ly4/h;->b(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v10

    .line 121
    add-long/2addr v4, v6

    .line 122
    const-wide/16 v12, 0x1

    .line 123
    .line 124
    sub-long v12, v4, v12

    .line 125
    .line 126
    invoke-interface {v1, v12, v13}, Ly4/h;->b(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v14

    .line 130
    invoke-interface {v1, v12, v13, v2, v3}, Ly4/h;->c(JJ)J

    .line 131
    .line 132
    .line 133
    move-result-wide v12

    .line 134
    add-long/2addr v12, v14

    .line 135
    invoke-interface {v9}, Ly4/h;->v()J

    .line 136
    .line 137
    .line 138
    move-result-wide v14

    .line 139
    move-wide/from16 v16, v4

    .line 140
    .line 141
    invoke-interface {v9, v14, v15}, Ly4/h;->b(J)J

    .line 142
    .line 143
    .line 144
    move-result-wide v4

    .line 145
    move-wide/from16 v18, v6

    .line 146
    .line 147
    iget-wide v6, v0, Ly4/i;->b:J

    .line 148
    .line 149
    cmp-long v8, v12, v4

    .line 150
    .line 151
    if-nez v8, :cond_3

    .line 152
    .line 153
    sub-long v4, v16, v14

    .line 154
    .line 155
    :goto_0
    add-long/2addr v4, v6

    .line 156
    :goto_1
    move-wide v7, v4

    .line 157
    goto :goto_2

    .line 158
    :cond_3
    if-ltz v8, :cond_5

    .line 159
    .line 160
    cmp-long v8, v4, v10

    .line 161
    .line 162
    if-gez v8, :cond_4

    .line 163
    .line 164
    invoke-interface {v9, v10, v11, v2, v3}, Ly4/h;->l(JJ)J

    .line 165
    .line 166
    .line 167
    move-result-wide v4

    .line 168
    sub-long v4, v4, v18

    .line 169
    .line 170
    sub-long v4, v6, v4

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    invoke-interface {v1, v4, v5, v2, v3}, Ly4/h;->l(JJ)J

    .line 174
    .line 175
    .line 176
    move-result-wide v4

    .line 177
    sub-long/2addr v4, v14

    .line 178
    goto :goto_0

    .line 179
    :goto_2
    new-instance v1, Ly4/i;

    .line 180
    .line 181
    iget-object v4, v0, Ly4/i;->e:Ljava/lang/Object;

    .line 182
    .line 183
    move-object v5, v4

    .line 184
    check-cast v5, Lz4/b;

    .line 185
    .line 186
    iget-object v4, v0, Ly4/i;->c:Ljava/lang/Object;

    .line 187
    .line 188
    move-object v6, v4

    .line 189
    check-cast v6, Lk5/e;

    .line 190
    .line 191
    move-object/from16 v4, p3

    .line 192
    .line 193
    invoke-direct/range {v1 .. v9}, Ly4/i;-><init>(JLz4/m;Lz4/b;Lk5/e;JLy4/h;)V

    .line 194
    .line 195
    .line 196
    return-object v1

    .line 197
    :cond_5
    new-instance v1, Lj5/b;

    .line 198
    .line 199
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 200
    .line 201
    .line 202
    throw v1
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
.end method

.method public d(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/i;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly4/h;

    .line 4
    .line 5
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Ly4/i;->a:J

    .line 9
    .line 10
    invoke-interface {v0, v1, v2, p1, p2}, Ly4/h;->e(JJ)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iget-wide v0, p0, Ly4/i;->b:J

    .line 15
    .line 16
    add-long/2addr p1, v0

    .line 17
    return-wide p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public e(J)J
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p2}, Ly4/i;->d(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Ly4/i;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ly4/h;

    .line 8
    .line 9
    invoke-static {v2}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-wide v3, p0, Ly4/i;->a:J

    .line 13
    .line 14
    invoke-interface {v2, v3, v4, p1, p2}, Ly4/h;->y(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    add-long/2addr p1, v0

    .line 19
    const-wide/16 v0, 0x1

    .line 20
    .line 21
    sub-long/2addr p1, v0

    .line 22
    return-wide p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public f()Lzg/p;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/i;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzg/p;

    .line 4
    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
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

.method public g()J
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/i;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly4/h;

    .line 4
    .line 5
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Ly4/i;->a:J

    .line 9
    .line 10
    invoke-interface {v0, v1, v2}, Ly4/h;->x(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
    .line 15
    .line 16
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

.method public h(J)J
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p2}, Ly4/i;->i(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Ly4/i;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ly4/h;

    .line 8
    .line 9
    invoke-static {v2}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-wide v3, p0, Ly4/i;->b:J

    .line 13
    .line 14
    sub-long/2addr p1, v3

    .line 15
    iget-wide v3, p0, Ly4/i;->a:J

    .line 16
    .line 17
    invoke-interface {v2, p1, p2, v3, v4}, Ly4/h;->c(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    add-long/2addr p1, v0

    .line 22
    return-wide p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public i(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/i;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly4/h;

    .line 4
    .line 5
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Ly4/i;->b:J

    .line 9
    .line 10
    sub-long/2addr p1, v1

    .line 11
    invoke-interface {v0, p1, p2}, Ly4/h;->b(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    return-wide p1
    .line 16
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public j(JJ)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/i;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly4/h;

    .line 4
    .line 5
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ly4/h;->s()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v2, p3, v0

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Ly4/i;->h(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    cmp-long v0, p1, p3

    .line 29
    .line 30
    if-gtz v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 36
    return p1
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
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
.end method

.method public k()Lzg/r;
    .locals 7

    .line 1
    iget-object v0, p0, Ly4/i;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzg/p;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lzg/p;->a(Lzg/o;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0}, Lzg/p;->b()Lzg/s;

    .line 13
    .line 14
    .line 15
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v2

    .line 18
    new-instance v3, Lzg/i;

    .line 19
    .line 20
    invoke-direct {v3, v2}, Lzg/i;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object v2, v3

    .line 24
    :goto_0
    invoke-interface {v2}, Lzg/s;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    new-instance v0, Lzg/r;

    .line 31
    .line 32
    const/4 v3, 0x6

    .line 33
    invoke-direct {v0, v2, v1, v3}, Lzg/r;-><init>(Lzg/s;Ljava/lang/Throwable;I)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    instance-of v3, v2, Lzg/i;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    check-cast v2, Lzg/i;

    .line 42
    .line 43
    iget-object v0, v2, Lzg/i;->a:Lzg/r;

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    iget-object v3, p0, Ly4/i;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    sget-object v4, Lwg/g;->b:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v4, " connect "

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v0, v0, Lzg/p;->i:Lug/a;

    .line 69
    .line 70
    iget-object v0, v0, Lug/a;->h:Lug/t;

    .line 71
    .line 72
    invoke-virtual {v0}, Lug/t;->h()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v3, p0, Ly4/i;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Lyg/c;

    .line 86
    .line 87
    invoke-virtual {v3}, Lyg/c;->d()Lyg/b;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    new-instance v4, Lzg/j;

    .line 92
    .line 93
    invoke-direct {v4, v0, v2, p0}, Lzg/j;-><init>(Ljava/lang/String;Lzg/s;Ly4/i;)V

    .line 94
    .line 95
    .line 96
    const-wide/16 v5, 0x0

    .line 97
    .line 98
    invoke-virtual {v3, v4, v5, v6}, Lyg/b;->d(Lyg/a;J)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-object v1
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
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

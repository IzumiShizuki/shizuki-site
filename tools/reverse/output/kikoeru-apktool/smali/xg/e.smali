.class public final Lxg/e;
.super Lyg/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lxg/e;->e:I

    iput-object p2, p0, Lxg/e;->f:Ljava/lang/Object;

    invoke-direct {p0, p3}, Lyg/a;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lic/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxg/e;->e:I

    iput-object p2, p0, Lxg/e;->f:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p1}, Lyg/a;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private final b()J
    .locals 5

    .line 1
    iget-object v0, p0, Lxg/e;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lxg/g;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, v0, Lxg/g;->m:Z

    .line 7
    .line 8
    const-wide/16 v2, -0x1

    .line 9
    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    iget-boolean v1, v0, Lxg/g;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    const/4 v1, 0x1

    .line 18
    :try_start_1
    invoke-virtual {v0}, Lxg/g;->G()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_3

    .line 24
    :catch_0
    :try_start_2
    iput-boolean v1, v0, Lxg/g;->o:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    .line 26
    :goto_0
    :try_start_3
    invoke-virtual {v0}, Lxg/g;->o()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Lxg/g;->B()V

    .line 33
    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    iput v4, v0, Lxg/g;->j:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catch_1
    :try_start_4
    iput-boolean v1, v0, Lxg/g;->p:Z

    .line 40
    .line 41
    iget-object v1, v0, Lxg/g;->h:Llh/a0;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-static {v1}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    new-instance v1, Llh/d;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Lg8/a;->k(Llh/f0;)Llh/a0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, v0, Lxg/g;->h:Llh/a0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 58
    .line 59
    :cond_2
    :goto_1
    monitor-exit v0

    .line 60
    return-wide v2

    .line 61
    :cond_3
    :goto_2
    monitor-exit v0

    .line 62
    return-wide v2

    .line 63
    :goto_3
    monitor-exit v0

    .line 64
    throw v1
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


# virtual methods
.method public final a()J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lxg/e;->e:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lxg/e;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lh9/b;

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-wide v4, v0, Lh9/b;->a:J

    .line 17
    .line 18
    sub-long v4, v2, v4

    .line 19
    .line 20
    const-wide/16 v6, 0x1

    .line 21
    .line 22
    add-long/2addr v4, v6

    .line 23
    iget-object v6, v0, Lh9/b;->d:Ljava/io/Serializable;

    .line 24
    .line 25
    check-cast v6, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    const-string v7, "iterator(...)"

    .line 32
    .line 33
    invoke-static {v6, v7}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-wide v8, 0x7fffffffffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v12, 0x0

    .line 44
    const/4 v13, 0x0

    .line 45
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v14

    .line 49
    if-eqz v14, :cond_3

    .line 50
    .line 51
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v14

    .line 55
    check-cast v14, Lzg/o;

    .line 56
    .line 57
    invoke-static {v14}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    monitor-enter v14

    .line 61
    :try_start_0
    invoke-virtual {v0, v14, v2, v3}, Lh9/b;->a(Lzg/o;J)I

    .line 62
    .line 63
    .line 64
    move-result v15

    .line 65
    if-lez v15, :cond_0

    .line 66
    .line 67
    add-int/lit8 v11, v11, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    move-wide/from16 v16, v8

    .line 71
    .line 72
    iget-wide v7, v14, Lzg/o;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    cmp-long v9, v7, v4

    .line 75
    .line 76
    if-gez v9, :cond_1

    .line 77
    .line 78
    move-wide v4, v7

    .line 79
    move-object v12, v14

    .line 80
    :cond_1
    add-int/lit8 v10, v10, 0x1

    .line 81
    .line 82
    cmp-long v9, v7, v16

    .line 83
    .line 84
    if-gez v9, :cond_2

    .line 85
    .line 86
    move-wide v8, v7

    .line 87
    move-object v13, v14

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    move-wide/from16 v8, v16

    .line 90
    .line 91
    :goto_1
    monitor-exit v14

    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    monitor-exit v14

    .line 95
    throw v0

    .line 96
    :cond_3
    move-wide/from16 v16, v8

    .line 97
    .line 98
    const-wide/16 v6, -0x1

    .line 99
    .line 100
    if-eqz v12, :cond_4

    .line 101
    .line 102
    move-object v15, v12

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const/4 v4, 0x5

    .line 105
    if-le v10, v4, :cond_5

    .line 106
    .line 107
    move-object v15, v13

    .line 108
    move-wide/from16 v4, v16

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    move-wide v4, v6

    .line 112
    const/4 v15, 0x0

    .line 113
    :goto_2
    if-eqz v15, :cond_8

    .line 114
    .line 115
    monitor-enter v15

    .line 116
    :try_start_1
    iget-object v2, v15, Lzg/o;->p:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    const-wide/16 v6, 0x0

    .line 123
    .line 124
    if-nez v2, :cond_6

    .line 125
    .line 126
    :goto_3
    monitor-exit v15

    .line 127
    goto :goto_4

    .line 128
    :cond_6
    :try_start_2
    iget-wide v2, v15, Lzg/o;->q:J

    .line 129
    .line 130
    cmp-long v8, v2, v4

    .line 131
    .line 132
    if-eqz v8, :cond_7

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_7
    const/4 v2, 0x1

    .line 136
    iput-boolean v2, v15, Lzg/o;->j:Z

    .line 137
    .line 138
    iget-object v2, v0, Lh9/b;->d:Ljava/io/Serializable;

    .line 139
    .line 140
    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 141
    .line 142
    invoke-virtual {v2, v15}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 143
    .line 144
    .line 145
    monitor-exit v15

    .line 146
    iget-object v2, v15, Lzg/o;->e:Ljava/net/Socket;

    .line 147
    .line 148
    invoke-static {v2}, Lwg/g;->b(Ljava/net/Socket;)V

    .line 149
    .line 150
    .line 151
    iget-object v2, v0, Lh9/b;->d:Ljava/io/Serializable;

    .line 152
    .line 153
    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_a

    .line 160
    .line 161
    iget-object v0, v0, Lh9/b;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Lyg/b;

    .line 164
    .line 165
    invoke-virtual {v0}, Lyg/b;->a()V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :catchall_1
    move-exception v0

    .line 170
    monitor-exit v15

    .line 171
    throw v0

    .line 172
    :cond_8
    if-eqz v13, :cond_9

    .line 173
    .line 174
    iget-wide v4, v0, Lh9/b;->a:J

    .line 175
    .line 176
    add-long v8, v16, v4

    .line 177
    .line 178
    sub-long v6, v8, v2

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_9
    if-lez v11, :cond_a

    .line 182
    .line 183
    iget-wide v6, v0, Lh9/b;->a:J

    .line 184
    .line 185
    :cond_a
    :goto_4
    return-wide v6

    .line 186
    :pswitch_0
    iget-object v0, v1, Lxg/e;->f:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, Lic/a;

    .line 189
    .line 190
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    const-wide/16 v2, -0x1

    .line 194
    .line 195
    return-wide v2

    .line 196
    :pswitch_1
    invoke-direct {v1}, Lxg/e;->b()J

    .line 197
    .line 198
    .line 199
    move-result-wide v2

    .line 200
    return-wide v2

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.class public final Lb7/d4;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lg5/k;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lb7/d4;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 3
    new-instance v0, Lo/e;

    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lo/u0;-><init>(I)V

    .line 5
    iput-object v0, p0, Lb7/d4;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Lg5/l;Lc7/e1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb7/d4;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 8
    new-instance p1, Lg5/f;

    invoke-direct {p1, p2}, Lg5/f;-><init>(Landroid/os/HandlerThread;)V

    iput-object p1, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 9
    iput-object p3, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 10
    iput-object p4, p0, Lb7/d4;->g:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lb7/d4;->c:I

    return-void
.end method

.method public constructor <init>(Li2/d1;Lj1/p;ILz0/e;Lz0/e;Z)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb7/d4;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/d4;->g:Ljava/lang/Object;

    .line 13
    iput-object p2, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 14
    iput p3, p0, Lb7/d4;->c:I

    .line 15
    iput-object p4, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 16
    iput-object p5, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 17
    iput-boolean p6, p0, Lb7/d4;->b:Z

    return-void
.end method

.method public static b(Lb7/d4;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg5/f;

    .line 4
    .line 5
    iget-object v1, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/media/MediaCodec;

    .line 8
    .line 9
    iget-object v2, v0, Lg5/f;->b:Landroid/os/HandlerThread;

    .line 10
    .line 11
    iget-object v3, v0, Lg5/f;->c:Landroid/os/Handler;

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v3, 0x0

    .line 19
    :goto_0
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v3, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v0, v3}, Landroid/support/v4/media/c;->l(Landroid/media/MediaCodec;Landroid/media/MediaCodec$Callback;Landroid/os/Handler;)V

    .line 35
    .line 36
    .line 37
    iput-object v3, v0, Lg5/f;->c:Landroid/os/Handler;

    .line 38
    .line 39
    const-string v0, "configureCodec"

    .line 40
    .line 41
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lg5/l;

    .line 53
    .line 54
    invoke-interface {p1}, Lg5/l;->start()V

    .line 55
    .line 56
    .line 57
    const-string p1, "startCodec"

    .line 58
    .line 59
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 66
    .line 67
    .line 68
    sget p1, Lp4/c0;->a:I

    .line 69
    .line 70
    const/16 p2, 0x23

    .line 71
    .line 72
    if-lt p1, p2, :cond_2

    .line 73
    .line 74
    iget-object p1, p0, Lb7/d4;->g:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Lc7/e1;

    .line 77
    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    iget-object p2, p1, Lc7/e1;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Landroid/media/LoudnessCodecController;

    .line 83
    .line 84
    if-eqz p2, :cond_1

    .line 85
    .line 86
    invoke-static {p2, v1}, Lg5/a;->f(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-nez p2, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    iget-object p1, p1, Lc7/e1;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Ljava/util/HashSet;

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {p1}, Lp4/c;->i(Z)V

    .line 102
    .line 103
    .line 104
    :cond_2
    :goto_1
    iput v4, p0, Lb7/d4;->c:I

    .line 105
    .line 106
    return-void
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
.end method

.method public static g(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    if-ne p0, p1, :cond_0

    .line 8
    .line 9
    const-string p0, "Audio"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x2

    .line 16
    if-ne p0, p1, :cond_1

    .line 17
    .line 18
    const-string p0, "Video"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string p1, "Unknown("

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, ")"

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
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

.method private final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lb7/d4;->b:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lo/e;

    .line 12
    .line 13
    invoke-virtual {v2}, Lo/e;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lo/e;

    .line 23
    .line 24
    invoke-virtual {v2}, Lo/u0;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, La9/m;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget-object v2, p0, Lb7/d4;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, La9/m;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    iput-object v2, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v2, p0, Lb7/d4;->g:Ljava/lang/Object;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    goto :goto_2

    .line 55
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lb7/c4;

    .line 71
    .line 72
    invoke-virtual {v1}, Lb7/c4;->m()V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    return-void

    .line 77
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw v1
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
.method public B()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {v0}, Lg5/a;->d(Landroid/media/MediaCodec;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public E0(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public N(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
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

.method public O()I
    .locals 9

    .line 1
    iget-object v0, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg5/l;

    .line 4
    .line 5
    invoke-interface {v0}, Lg5/l;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lg5/f;

    .line 11
    .line 12
    iget-object v1, v0, Lg5/f;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    iget-object v2, v0, Lg5/f;->n:Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v2, :cond_8

    .line 19
    .line 20
    iget-object v2, v0, Lg5/f;->j:Landroid/media/MediaCodec$CodecException;

    .line 21
    .line 22
    if-nez v2, :cond_7

    .line 23
    .line 24
    iget-object v2, v0, Lg5/f;->k:Landroid/media/MediaCodec$CryptoException;

    .line 25
    .line 26
    if-nez v2, :cond_6

    .line 27
    .line 28
    iget-wide v2, v0, Lg5/f;->l:J

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x1

    .line 34
    cmp-long v8, v2, v4

    .line 35
    .line 36
    if-gtz v8, :cond_1

    .line 37
    .line 38
    iget-boolean v2, v0, Lg5/f;->m:Z

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v2, 0x0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 46
    :goto_1
    const/4 v3, -0x1

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    monitor-exit v1

    .line 50
    return v3

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_3

    .line 53
    :cond_2
    iget-object v0, v0, Lg5/f;->d:Lm4/j;

    .line 54
    .line 55
    iget v2, v0, Lm4/j;->b:I

    .line 56
    .line 57
    iget v4, v0, Lm4/j;->c:I

    .line 58
    .line 59
    if-ne v2, v4, :cond_3

    .line 60
    .line 61
    const/4 v6, 0x1

    .line 62
    :cond_3
    if-eqz v6, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    if-eq v2, v4, :cond_5

    .line 66
    .line 67
    iget-object v3, v0, Lm4/j;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, [I

    .line 70
    .line 71
    aget v3, v3, v2

    .line 72
    .line 73
    add-int/2addr v2, v7

    .line 74
    iget v4, v0, Lm4/j;->d:I

    .line 75
    .line 76
    and-int/2addr v2, v4

    .line 77
    iput v2, v0, Lm4/j;->b:I

    .line 78
    .line 79
    :goto_2
    monitor-exit v1

    .line 80
    return v3

    .line 81
    :cond_5
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_6
    iput-object v3, v0, Lg5/f;->k:Landroid/media/MediaCodec$CryptoException;

    .line 88
    .line 89
    throw v2

    .line 90
    :cond_7
    iput-object v3, v0, Lg5/f;->j:Landroid/media/MediaCodec$CodecException;

    .line 91
    .line 92
    throw v2

    .line 93
    :cond_8
    iput-object v3, v0, Lg5/f;->n:Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    throw v2

    .line 96
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    throw v0
    .line 98
.end method

.method public W(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 10

    .line 1
    iget-object v0, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg5/l;

    .line 4
    .line 5
    invoke-interface {v0}, Lg5/l;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lg5/f;

    .line 11
    .line 12
    iget-object v1, v0, Lg5/f;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    iget-object v2, v0, Lg5/f;->n:Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v2, :cond_a

    .line 19
    .line 20
    iget-object v2, v0, Lg5/f;->j:Landroid/media/MediaCodec$CodecException;

    .line 21
    .line 22
    if-nez v2, :cond_9

    .line 23
    .line 24
    iget-object v2, v0, Lg5/f;->k:Landroid/media/MediaCodec$CryptoException;

    .line 25
    .line 26
    if-nez v2, :cond_8

    .line 27
    .line 28
    iget-wide v2, v0, Lg5/f;->l:J

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x1

    .line 34
    cmp-long v8, v2, v4

    .line 35
    .line 36
    if-gtz v8, :cond_1

    .line 37
    .line 38
    iget-boolean v2, v0, Lg5/f;->m:Z

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v2, 0x0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 46
    :goto_1
    const/4 v3, -0x1

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    monitor-exit v1

    .line 50
    return v3

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p1, v0

    .line 53
    goto :goto_3

    .line 54
    :cond_2
    iget-object v2, v0, Lg5/f;->e:Lm4/j;

    .line 55
    .line 56
    iget v4, v2, Lm4/j;->b:I

    .line 57
    .line 58
    iget v5, v2, Lm4/j;->c:I

    .line 59
    .line 60
    if-ne v4, v5, :cond_3

    .line 61
    .line 62
    const/4 v6, 0x1

    .line 63
    :cond_3
    if-eqz v6, :cond_4

    .line 64
    .line 65
    monitor-exit v1

    .line 66
    return v3

    .line 67
    :cond_4
    if-eq v4, v5, :cond_7

    .line 68
    .line 69
    iget-object v3, v2, Lm4/j;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, [I

    .line 72
    .line 73
    aget v3, v3, v4

    .line 74
    .line 75
    add-int/2addr v4, v7

    .line 76
    iget v5, v2, Lm4/j;->d:I

    .line 77
    .line 78
    and-int/2addr v4, v5

    .line 79
    iput v4, v2, Lm4/j;->b:I

    .line 80
    .line 81
    if-ltz v3, :cond_5

    .line 82
    .line 83
    iget-object v2, v0, Lg5/f;->h:Landroid/media/MediaFormat;

    .line 84
    .line 85
    invoke-static {v2}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, Lg5/f;->f:Ljava/util/ArrayDeque;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Landroid/media/MediaCodec$BufferInfo;

    .line 95
    .line 96
    iget v5, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 97
    .line 98
    iget v6, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 99
    .line 100
    iget-wide v7, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 101
    .line 102
    iget v9, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 103
    .line 104
    move-object v4, p1

    .line 105
    invoke-virtual/range {v4 .. v9}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    const/4 p1, -0x2

    .line 110
    if-ne v3, p1, :cond_6

    .line 111
    .line 112
    iget-object p1, v0, Lg5/f;->g:Ljava/util/ArrayDeque;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Landroid/media/MediaFormat;

    .line 119
    .line 120
    iput-object p1, v0, Lg5/f;->h:Landroid/media/MediaFormat;

    .line 121
    .line 122
    :cond_6
    :goto_2
    monitor-exit v1

    .line 123
    return v3

    .line 124
    :cond_7
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 125
    .line 126
    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_8
    iput-object v3, v0, Lg5/f;->k:Landroid/media/MediaCodec$CryptoException;

    .line 131
    .line 132
    throw v2

    .line 133
    :cond_9
    iput-object v3, v0, Lg5/f;->j:Landroid/media/MediaCodec$CodecException;

    .line 134
    .line 135
    throw v2

    .line 136
    :cond_a
    iput-object v3, v0, Lg5/f;->n:Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    throw v2

    .line 139
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    throw p1
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

.method public a()V
    .locals 7

    .line 1
    iget v0, p0, Lb7/d4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x21

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    const/16 v2, 0x23

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    :try_start_0
    iget v4, p0, Lb7/d4;->c:I

    .line 14
    .line 15
    if-ne v4, v3, :cond_0

    .line 16
    .line 17
    iget-object v4, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Lg5/l;

    .line 20
    .line 21
    invoke-interface {v4}, Lg5/l;->shutdown()V

    .line 22
    .line 23
    .line 24
    iget-object v4, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Lg5/f;

    .line 27
    .line 28
    iget-object v5, v4, Lg5/f;->a:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    :try_start_1
    iput-boolean v3, v4, Lg5/f;->m:Z

    .line 32
    .line 33
    iget-object v6, v4, Lg5/f;->b:Landroid/os/HandlerThread;

    .line 34
    .line 35
    invoke-virtual {v6}, Landroid/os/HandlerThread;->quit()Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Lg5/f;->a()V

    .line 39
    .line 40
    .line 41
    monitor-exit v5

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v4

    .line 44
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :try_start_2
    throw v4

    .line 46
    :catchall_1
    move-exception v4

    .line 47
    goto :goto_4

    .line 48
    :cond_0
    :goto_0
    const/4 v4, 0x2

    .line 49
    iput v4, p0, Lb7/d4;->c:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 50
    .line 51
    iget-boolean v4, p0, Lb7/d4;->b:Z

    .line 52
    .line 53
    if-nez v4, :cond_4

    .line 54
    .line 55
    :try_start_3
    sget v4, Lp4/c0;->a:I

    .line 56
    .line 57
    if-lt v4, v1, :cond_1

    .line 58
    .line 59
    if-ge v4, v0, :cond_1

    .line 60
    .line 61
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Landroid/media/MediaCodec;

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_2
    move-exception v0

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    :goto_1
    if-lt v4, v2, :cond_2

    .line 72
    .line 73
    iget-object v0, p0, Lb7/d4;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lc7/e1;

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    iget-object v1, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Landroid/media/MediaCodec;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Lc7/e1;->U(Landroid/media/MediaCodec;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Landroid/media/MediaCodec;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 91
    .line 92
    .line 93
    iput-boolean v3, p0, Lb7/d4;->b:Z

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :goto_2
    sget v1, Lp4/c0;->a:I

    .line 97
    .line 98
    if-lt v1, v2, :cond_3

    .line 99
    .line 100
    iget-object v1, p0, Lb7/d4;->g:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Lc7/e1;

    .line 103
    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    iget-object v2, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Landroid/media/MediaCodec;

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Lc7/e1;->U(Landroid/media/MediaCodec;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    iget-object v1, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v1, Landroid/media/MediaCodec;

    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 118
    .line 119
    .line 120
    iput-boolean v3, p0, Lb7/d4;->b:Z

    .line 121
    .line 122
    throw v0

    .line 123
    :cond_4
    :goto_3
    return-void

    .line 124
    :goto_4
    iget-boolean v5, p0, Lb7/d4;->b:Z

    .line 125
    .line 126
    if-nez v5, :cond_8

    .line 127
    .line 128
    :try_start_4
    sget v5, Lp4/c0;->a:I

    .line 129
    .line 130
    if-lt v5, v1, :cond_5

    .line 131
    .line 132
    if-ge v5, v0, :cond_5

    .line 133
    .line 134
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Landroid/media/MediaCodec;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :catchall_3
    move-exception v0

    .line 143
    goto :goto_6

    .line 144
    :cond_5
    :goto_5
    if-lt v5, v2, :cond_6

    .line 145
    .line 146
    iget-object v0, p0, Lb7/d4;->g:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Lc7/e1;

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    iget-object v1, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, Landroid/media/MediaCodec;

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lc7/e1;->U(Landroid/media/MediaCodec;)V

    .line 157
    .line 158
    .line 159
    :cond_6
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Landroid/media/MediaCodec;

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 164
    .line 165
    .line 166
    iput-boolean v3, p0, Lb7/d4;->b:Z

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :goto_6
    sget v1, Lp4/c0;->a:I

    .line 170
    .line 171
    if-lt v1, v2, :cond_7

    .line 172
    .line 173
    iget-object v1, p0, Lb7/d4;->g:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v1, Lc7/e1;

    .line 176
    .line 177
    if-eqz v1, :cond_7

    .line 178
    .line 179
    iget-object v2, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v2, Landroid/media/MediaCodec;

    .line 182
    .line 183
    invoke-virtual {v1, v2}, Lc7/e1;->U(Landroid/media/MediaCodec;)V

    .line 184
    .line 185
    .line 186
    :cond_7
    iget-object v1, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Landroid/media/MediaCodec;

    .line 189
    .line 190
    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    .line 191
    .line 192
    .line 193
    iput-boolean v3, p0, Lb7/d4;->b:Z

    .line 194
    .line 195
    throw v0

    .line 196
    :cond_8
    :goto_7
    throw v4

    .line 197
    :pswitch_0
    invoke-direct {p0}, Lb7/d4;->k()V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
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

.method public c(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg5/l;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lg5/l;->c(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public d(IIIJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lg5/l;

    .line 5
    .line 6
    move v2, p1

    .line 7
    move v3, p2

    .line 8
    move v4, p3

    .line 9
    move-wide v5, p4

    .line 10
    invoke-interface/range {v1 .. v6}, Lg5/l;->d(IIIJ)V

    .line 11
    .line 12
    .line 13
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
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
.end method

.method public e(ILu4/b;JI)V
    .locals 7

    .line 1
    iget-object v0, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lg5/l;

    .line 5
    .line 6
    move v2, p1

    .line 7
    move-object v3, p2

    .line 8
    move-wide v4, p3

    .line 9
    move v6, p5

    .line 10
    invoke-interface/range {v1 .. v6}, Lg5/l;->e(ILu4/b;JI)V

    .line 11
    .line 12
    .line 13
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
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
.end method

.method public f(II)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz0/e;

    .line 4
    .line 5
    iget v1, p0, Lb7/d4;->c:I

    .line 6
    .line 7
    add-int/2addr p1, v1

    .line 8
    iget-object v0, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object p1, v0, p1

    .line 11
    .line 12
    check-cast p1, Lj1/o;

    .line 13
    .line 14
    iget-object v0, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lz0/e;

    .line 17
    .line 18
    add-int/2addr v1, p2

    .line 19
    iget-object p2, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object p2, p2, v1

    .line 22
    .line 23
    check-cast p2, Lj1/o;

    .line 24
    .line 25
    invoke-static {p1, p2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-ne p1, p2, :cond_1

    .line 41
    .line 42
    :goto_0
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_1
    const/4 p1, 0x0

    .line 45
    return p1
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

.method public flush()V
    .locals 6

    .line 1
    iget-object v0, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg5/l;

    .line 4
    .line 5
    invoke-interface {v0}, Lg5/l;->flush()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/media/MediaCodec;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lg5/f;

    .line 18
    .line 19
    iget-object v1, v0, Lg5/f;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    iget-wide v2, v0, Lg5/f;->l:J

    .line 23
    .line 24
    const-wide/16 v4, 0x1

    .line 25
    .line 26
    add-long/2addr v2, v4

    .line 27
    iput-wide v2, v0, Lg5/f;->l:J

    .line 28
    .line 29
    iget-object v2, v0, Lg5/f;->c:Landroid/os/Handler;

    .line 30
    .line 31
    sget v3, Lp4/c0;->a:I

    .line 32
    .line 33
    new-instance v3, La9/m;

    .line 34
    .line 35
    const/16 v4, 0xe

    .line 36
    .line 37
    invoke-direct {v3, v4, v0}, La9/m;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Landroid/media/MediaCodec;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw v0
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

.method public h(Lp5/h;Landroid/os/Handler;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    new-instance v1, Lg5/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lg5/b;-><init>(Lg5/k;Lp5/h;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Landroid/support/v4/media/c;->n(Landroid/media/MediaCodec;Lg5/b;Landroid/os/Handler;)V

    .line 12
    .line 13
    .line 14
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
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

.method public i(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public j()I
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lb7/d4;->c:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    iput v2, p0, Lb7/d4;->c:I

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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

.method public j0(Lb0/c1;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg5/f;

    .line 4
    .line 5
    iget-object v1, v0, Lg5/f;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iput-object p1, v0, Lg5/f;->o:Lb0/c1;

    .line 9
    .line 10
    monitor-exit v1

    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p1
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

.method public l(ILjava/lang/Object;)V
    .locals 4

    .line 1
    const-string v0, "Type mismatch, expected "

    .line 2
    .line 3
    iget-object v1, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Lo/e;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v2, p1}, Lo/u0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lb7/c4;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const-class v2, Lb7/i4;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lcb/p;->k(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const-string p1, "SequencedFutureManager"

    .line 37
    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-class v0, Lb7/i4;

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, ", but was "

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p1, p2}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_0
    iget-object p1, p0, Lb7/d4;->f:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, La9/m;

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    iget-object p1, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lo/e;

    .line 76
    .line 77
    invoke-virtual {p1}, Lo/u0;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0}, Lb7/d4;->a()V

    .line 84
    .line 85
    .line 86
    :cond_2
    monitor-exit v1

    .line 87
    return-void

    .line 88
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    throw p1
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
.end method

.method public o0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public x()Landroid/media/MediaFormat;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/d4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg5/f;

    .line 4
    .line 5
    iget-object v1, v0, Lg5/f;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v0, v0, Lg5/f;->h:Landroid/media/MediaFormat;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-object v0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public x0(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public y0(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/d4;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-static {v0, p1}, Landroid/support/v4/media/c;->m(Landroid/media/MediaCodec;Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

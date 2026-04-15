.class public final Lb7/q3;
.super Landroid/os/Binder;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb7/t;


# static fields
.field public static final synthetic k:I


# instance fields
.field public final e:Ljava/lang/ref/WeakReference;

.field public final f:Lc7/l1;

.field public final g:Lb0/w1;

.field public final h:Ljava/util/Set;

.field public i:Lya/z0;

.field public j:I


# direct methods
.method public constructor <init>(Lb7/c2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.media3.session.IMediaSession"

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lb7/q3;->e:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    iget-object v0, p1, Lb7/c2;->f:Lcom/cnl/kikoeru/MainService;

    .line 17
    .line 18
    invoke-static {v0}, Lc7/l1;->a(Landroid/content/Context;)Lc7/l1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lb7/q3;->f:Lc7/l1;

    .line 23
    .line 24
    new-instance v0, Lb0/w1;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Lb0/w1;-><init>(Lb7/c2;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lb7/q3;->g:Lb0/w1;

    .line 30
    .line 31
    new-instance p1, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lb7/q3;->h:Ljava/util/Set;

    .line 41
    .line 42
    sget-object p1, Lya/z0;->i:Lya/z0;

    .line 43
    .line 44
    iput-object p1, p0, Lb7/q3;->i:Lya/z0;

    .line 45
    .line 46
    return-void
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

.method public static D0(Lb7/c2;Lb7/t1;ILb7/p3;Lp4/g;)Lcb/y;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lb7/c2;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lcb/v;->b:Lcb/v;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lb7/p3;->h(Lb7/c2;Lb7/t1;I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, Lcb/y;

    .line 16
    .line 17
    new-instance v2, Lcb/e0;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lb7/f;

    .line 23
    .line 24
    const/4 v5, 0x5

    .line 25
    move-object v1, p0

    .line 26
    move-object v3, p4

    .line 27
    invoke-direct/range {v0 .. v5}, Lb7/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lcb/r;->a:Lcb/r;

    .line 31
    .line 32
    invoke-interface {v4, v0, p0}, Lcb/y;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 33
    .line 34
    .line 35
    return-object v2
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

.method public static H0(Lb7/t1;ILb7/i4;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lb7/t1;->d:Lb7/s1;

    .line 2
    .line 3
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Lb7/s1;->h(ILb7/i4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p1

    .line 11
    new-instance p2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v0, "Failed to send result to controller "

    .line 14
    .line 15
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p2, "MediaSessionStub"

    .line 26
    .line 27
    invoke-static {p2, p0, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method public static I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/offline/g;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p0, Landroidx/media3/exoplayer/offline/g;

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    invoke-direct {p0, v1, v0}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p0
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


# virtual methods
.method public final A0(Lb7/r;Lb7/t1;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lb7/q3;->e:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v4, v0

    .line 10
    check-cast v4, Lb7/c2;

    .line 11
    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {v4}, Lb7/c2;->h()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :cond_0
    move-object v5, p1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, p0, Lb7/q3;->h:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object v0, v4, Lb7/c2;->l:Landroid/os/Handler;

    .line 28
    .line 29
    new-instance v1, Lb7/f;

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    move-object v2, p0

    .line 33
    move-object v5, p1

    .line 34
    move-object v3, p2

    .line 35
    invoke-direct/range {v1 .. v6}, Lb7/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_0
    :try_start_0
    invoke-interface {v5}, Lb7/r;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    :catch_0
    :cond_2
    return-void
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

.method public final B0(Lb7/r;ILb7/e4;ILb7/p3;)V
    .locals 11

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    :try_start_0
    iget-object v0, p0, Lb7/q3;->e:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v10, v0

    .line 12
    check-cast v10, Lb7/c2;

    .line 13
    .line 14
    if-eqz v10, :cond_2

    .line 15
    .line 16
    invoke-virtual {v10}, Lb7/c2;->h()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lb7/q3;->g:Lb0/w1;

    .line 24
    .line 25
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    .line 30
    .line 31
    .line 32
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    :try_start_1
    iget-object p1, v10, Lb7/c2;->l:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance v3, Lb7/g3;

    .line 42
    .line 43
    move-object v4, p0

    .line 44
    move v7, p2

    .line 45
    move-object v6, p3

    .line 46
    move v8, p4

    .line 47
    move-object/from16 v9, p5

    .line 48
    .line 49
    invoke-direct/range {v3 .. v10}, Lb7/g3;-><init>(Lb7/q3;Lb7/t1;Lb7/e4;IILb7/p3;Lb7/c2;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v3}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p1, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :goto_1
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 67
    .line 68
    .line 69
    throw p1
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

.method public final C0(Lb7/v3;)Lb7/v3;
    .locals 9

    .line 1
    iget-object v0, p1, Lb7/v3;->D:Lm4/q1;

    .line 2
    .line 3
    iget-object v0, v0, Lm4/q1;->a:Lya/i0;

    .line 4
    .line 5
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lya/a0;

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    invoke-direct {v2, v3}, Lah/j;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lm4/p1;

    .line 27
    .line 28
    iget-object v5, v4, Lm4/p1;->b:Lm4/j1;

    .line 29
    .line 30
    iget-object v6, p0, Lb7/q3;->i:Lya/z0;

    .line 31
    .line 32
    invoke-virtual {v6, v5}, Lya/z0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Ljava/lang/String;

    .line 37
    .line 38
    if-nez v6, :cond_0

    .line 39
    .line 40
    new-instance v6, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    iget v7, p0, Lb7/q3;->j:I

    .line 46
    .line 47
    add-int/lit8 v8, v7, 0x1

    .line 48
    .line 49
    iput v8, p0, Lb7/q3;->j:I

    .line 50
    .line 51
    sget v8, Lp4/c0;->a:I

    .line 52
    .line 53
    const/16 v8, 0x24

    .line 54
    .line 55
    invoke-static {v7, v8}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v7, "-"

    .line 63
    .line 64
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v7, v5, Lm4/j1;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    :cond_0
    invoke-virtual {v2, v5, v6}, Lya/a0;->P(Lm4/j1;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v5, Lm4/p1;

    .line 80
    .line 81
    iget-object v7, v4, Lm4/p1;->b:Lm4/j1;

    .line 82
    .line 83
    new-instance v8, Lm4/j1;

    .line 84
    .line 85
    iget-object v7, v7, Lm4/j1;->d:[Lm4/q;

    .line 86
    .line 87
    invoke-direct {v8, v6, v7}, Lm4/j1;-><init>(Ljava/lang/String;[Lm4/q;)V

    .line 88
    .line 89
    .line 90
    iget-boolean v6, v4, Lm4/p1;->c:Z

    .line 91
    .line 92
    iget-object v7, v4, Lm4/p1;->d:[I

    .line 93
    .line 94
    iget-object v4, v4, Lm4/p1;->e:[Z

    .line 95
    .line 96
    invoke-direct {v5, v8, v6, v7, v4}, Lm4/p1;-><init>(Lm4/j1;Z[I[Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v5}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {v2}, Lya/a0;->O()Lya/z0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Lb7/q3;->i:Lya/z0;

    .line 110
    .line 111
    new-instance v0, Lm4/q1;

    .line 112
    .line 113
    invoke-virtual {v1}, Lya/f0;->f()Lya/a1;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-direct {v0, v1}, Lm4/q1;-><init>(Lya/a1;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, Lb7/v3;->a(Lm4/q1;)Lb7/v3;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iget-object v0, p1, Lb7/v3;->E:Lm4/o1;

    .line 125
    .line 126
    iget-object v1, v0, Lm4/o1;->B:Lya/k0;

    .line 127
    .line 128
    invoke-virtual {v1}, Lya/k0;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_2

    .line 133
    .line 134
    return-object p1

    .line 135
    :cond_2
    invoke-virtual {v0}, Lm4/o1;->a()Lm4/n1;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Lm4/n1;->c()Lm4/n1;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v0, v0, Lm4/o1;->B:Lya/k0;

    .line 144
    .line 145
    invoke-virtual {v0}, Lya/k0;->e()Lya/d0;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, Lya/d0;->n()Lya/o1;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_4

    .line 158
    .line 159
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Lm4/k1;

    .line 164
    .line 165
    iget-object v3, v2, Lm4/k1;->a:Lm4/j1;

    .line 166
    .line 167
    iget-object v4, p0, Lb7/q3;->i:Lya/z0;

    .line 168
    .line 169
    invoke-virtual {v4, v3}, Lya/z0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    check-cast v4, Ljava/lang/String;

    .line 174
    .line 175
    if-eqz v4, :cond_3

    .line 176
    .line 177
    new-instance v5, Lm4/k1;

    .line 178
    .line 179
    new-instance v6, Lm4/j1;

    .line 180
    .line 181
    iget-object v3, v3, Lm4/j1;->d:[Lm4/q;

    .line 182
    .line 183
    invoke-direct {v6, v4, v3}, Lm4/j1;-><init>(Ljava/lang/String;[Lm4/q;)V

    .line 184
    .line 185
    .line 186
    iget-object v2, v2, Lm4/k1;->b:Lya/i0;

    .line 187
    .line 188
    invoke-direct {v5, v6, v2}, Lm4/k1;-><init>(Lm4/j1;Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v5}, Lm4/n1;->a(Lm4/k1;)V

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_3
    invoke-virtual {v1, v2}, Lm4/n1;->a(Lm4/k1;)V

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_4
    invoke-virtual {v1}, Lm4/n1;->b()Lm4/o1;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {p1, v0}, Lb7/v3;->h(Lm4/o1;)Lb7/v3;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    return-object p1
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

.method public final E0(Lb7/t1;Lb7/z3;I)I
    .locals 2

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lb7/z3;->B0(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lb7/q3;->g:Lb0/w1;

    .line 10
    .line 11
    invoke-virtual {v1, p1, v0}, Lb0/w1;->T(Lb7/t1;I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    invoke-virtual {v1, p1, v0}, Lb0/w1;->T(Lb7/t1;I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2}, Lb7/z3;->G()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    add-int/2addr p1, p3

    .line 30
    return p1

    .line 31
    :cond_0
    return p3
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
.end method

.method public final F0(Lb7/r;IILb7/p3;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/q3;->g:Lb0/w1;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3, p4}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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

.method public final G0(Lb7/t1;IILb7/p3;)V
    .locals 10

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    :try_start_0
    iget-object v0, p0, Lb7/q3;->e:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v8, v0

    .line 12
    check-cast v8, Lb7/c2;

    .line 13
    .line 14
    if-eqz v8, :cond_1

    .line 15
    .line 16
    invoke-virtual {v8}, Lb7/c2;->h()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, v8, Lb7/c2;->l:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v3, Lb7/h3;

    .line 26
    .line 27
    move-object v4, p0

    .line 28
    move-object v5, p1

    .line 29
    move v7, p2

    .line 30
    move v6, p3

    .line 31
    move-object v9, p4

    .line 32
    invoke-direct/range {v3 .. v9}, Lb7/h3;-><init>(Lb7/q3;Lb7/t1;IILb7/c2;Lb7/p3;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v3}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_1
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 50
    .line 51
    .line 52
    throw p1
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

.method public final H(Lb7/r;ILandroid/os/Bundle;)V
    .locals 10

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lb7/i;->a(Landroid/os/Bundle;)Lb7/i;

    .line 7
    .line 8
    .line 9
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget v0, p2, Lb7/i;->d:I

    .line 26
    .line 27
    :goto_0
    :try_start_1
    new-instance v4, Lc7/k1;

    .line 28
    .line 29
    iget-object v3, p2, Lb7/i;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v4, v0, p3, v3}, Lc7/k1;-><init>(IILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lb7/t1;

    .line 35
    .line 36
    iget v5, p2, Lb7/i;->a:I

    .line 37
    .line 38
    iget v6, p2, Lb7/i;->b:I

    .line 39
    .line 40
    iget-object p3, p0, Lb7/q3;->f:Lc7/l1;

    .line 41
    .line 42
    invoke-virtual {p3, v4}, Lc7/l1;->b(Lc7/k1;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    new-instance v8, Lb7/m3;

    .line 47
    .line 48
    iget p3, p2, Lb7/i;->b:I

    .line 49
    .line 50
    invoke-direct {v8, p1, p3}, Lb7/m3;-><init>(Lb7/r;I)V

    .line 51
    .line 52
    .line 53
    iget-object v9, p2, Lb7/i;->e:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-direct/range {v3 .. v9}, Lb7/t1;-><init>(Lc7/k1;IIZLb7/s1;Landroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, v3}, Lb7/q3;->A0(Lb7/r;Lb7/t1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object p1, v0

    .line 67
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :catch_0
    move-exception v0

    .line 72
    move-object p1, v0

    .line 73
    const-string p2, "MediaSessionStub"

    .line 74
    .line 75
    const-string p3, "Ignoring malformed Bundle for ConnectionRequest"

    .line 76
    .line 77
    invoke-static {p2, p3, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    :goto_1
    return-void
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
.end method

.method public final Q(Lb7/r;I)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    :try_start_0
    iget-object p2, p0, Lb7/q3;->e:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Lb7/c2;

    .line 15
    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p2}, Lb7/c2;->h()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object p2, p2, Lb7/c2;->l:Landroid/os/Handler;

    .line 26
    .line 27
    new-instance v2, Lb5/h;

    .line 28
    .line 29
    const/16 v3, 0x9

    .line 30
    .line 31
    invoke-direct {v2, v3, p0, p1}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2, v2}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :goto_1
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 48
    .line 49
    .line 50
    throw p1
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final R(Lb7/r;ILandroid/os/IBinder;Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lm4/f;->a(Landroid/os/IBinder;)Lya/i0;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Lya/f0;->f()Lya/a1;

    .line 41
    .line 42
    .line 43
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    new-instance v0, Lb7/y2;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p3, p4, v1}, Lb7/y2;-><init>(Ljava/lang/Object;ZI)V

    .line 48
    .line 49
    .line 50
    new-instance p3, Lb7/c3;

    .line 51
    .line 52
    const/16 p4, 0x8

    .line 53
    .line 54
    invoke-direct {p3, p4}, Lb7/c3;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance p4, Lb7/i0;

    .line 58
    .line 59
    const/16 v1, 0xb

    .line 60
    .line 61
    invoke-direct {p4, v1, v0, p3}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p3, Lb7/i3;

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-direct {p3, p4, v0}, Lb7/i3;-><init>(Lb7/p3;I)V

    .line 68
    .line 69
    .line 70
    const/16 p4, 0x14

    .line 71
    .line 72
    invoke-virtual {p0, p1, p2, p4, p3}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catch_0
    move-exception p1

    .line 77
    const-string p2, "MediaSessionStub"

    .line 78
    .line 79
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 80
    .line 81
    invoke-static {p2, p3, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    :goto_1
    return-void
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

.method public final V(Lb7/r;ILandroid/os/Bundle;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lb7/i4;->a(Landroid/os/Bundle;)Lb7/i4;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    :try_start_1
    iget-object v2, p0, Lb7/q3;->g:Lb0/w1;

    .line 15
    .line 16
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v3, v2, Lb0/w1;->b:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    :try_start_2
    invoke-virtual {v2, p1}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v2, v2, Lb0/w1;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lo/e;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Lo/u0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lb7/h;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object p1, v4

    .line 44
    :goto_0
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    :try_start_3
    iget-object v4, p1, Lb7/h;->b:Lb7/d4;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 48
    .line 49
    :cond_2
    if-nez v4, :cond_3

    .line 50
    .line 51
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    :try_start_4
    invoke-virtual {v4, p2, p3}, Lb7/d4;->l(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catchall_1
    move-exception p1

    .line 63
    goto :goto_2

    .line 64
    :goto_1
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 65
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 66
    :goto_2
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :catch_0
    move-exception p1

    .line 71
    const-string p2, "MediaSessionStub"

    .line 72
    .line 73
    const-string p3, "Ignoring malformed Bundle for SessionResult"

    .line 74
    .line 75
    invoke-static {p2, p3, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    :goto_3
    return-void
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
.end method

.method public final W(Lb7/r;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lb7/q3;->g:Lb0/w1;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance v0, Lb7/i0;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-direct {v0, v1, p0, p1}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {p0, p1, p2, v1, v0}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
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

.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
    .line 5
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

.method public final c0(Lb7/r;ILandroid/os/IBinder;IJ)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-eqz p3, :cond_2

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p4, v0, :cond_0

    .line 7
    .line 8
    if-gez p4, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :try_start_0
    invoke-static {p3}, Lm4/f;->a(Landroid/os/IBinder;)Lya/i0;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ge v1, v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v0}, Lya/f0;->f()Lya/a1;

    .line 46
    .line 47
    .line 48
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    new-instance v0, Lb7/v2;

    .line 50
    .line 51
    invoke-direct {v0, p5, p6, p3, p4}, Lb7/v2;-><init>(JLjava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    new-instance p3, Lb7/c3;

    .line 55
    .line 56
    const/16 p4, 0x8

    .line 57
    .line 58
    invoke-direct {p3, p4}, Lb7/c3;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance p4, Lb7/i0;

    .line 62
    .line 63
    const/16 p5, 0xb

    .line 64
    .line 65
    invoke-direct {p4, p5, v0, p3}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance p3, Lb7/i3;

    .line 69
    .line 70
    const/4 p5, 0x1

    .line 71
    invoke-direct {p3, p4, p5}, Lb7/i3;-><init>(Lb7/p3;I)V

    .line 72
    .line 73
    .line 74
    const/16 p4, 0x14

    .line 75
    .line 76
    invoke-virtual {p0, p1, p2, p4, p3}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catch_0
    move-exception p1

    .line 81
    const-string p2, "MediaSessionStub"

    .line 82
    .line 83
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 84
    .line 85
    invoke-static {p2, p3, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    :goto_1
    return-void
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

.method public final f(Lb7/r;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lb7/c3;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Lb7/c3;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, p1, p2, v1, v0}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public final l0(Lb7/r;ILandroid/os/Bundle;J)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, Lb7/g2;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p3, p4, p5, v1}, Lb7/g2;-><init>(Ljava/lang/Object;JI)V

    .line 14
    .line 15
    .line 16
    new-instance p3, Lb7/c3;

    .line 17
    .line 18
    const/16 p4, 0x8

    .line 19
    .line 20
    invoke-direct {p3, p4}, Lb7/c3;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance p4, Lb7/i0;

    .line 24
    .line 25
    const/16 p5, 0xb

    .line 26
    .line 27
    invoke-direct {p4, p5, v0, p3}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance p3, Lb7/i3;

    .line 31
    .line 32
    const/4 p5, 0x1

    .line 33
    invoke-direct {p3, p4, p5}, Lb7/i3;-><init>(Lb7/p3;I)V

    .line 34
    .line 35
    .line 36
    const/16 p4, 0x1f

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, p4, p3}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception p1

    .line 43
    const-string p2, "MediaSessionStub"

    .line 44
    .line 45
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 46
    .line 47
    invoke-static {p2, p3, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
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

.method public final n(Lb7/r;ILandroid/os/Bundle;Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, Lb7/y2;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p3, p4, v1}, Lb7/y2;-><init>(Ljava/lang/Object;ZI)V

    .line 14
    .line 15
    .line 16
    new-instance p3, Lb7/c3;

    .line 17
    .line 18
    const/16 p4, 0x8

    .line 19
    .line 20
    invoke-direct {p3, p4}, Lb7/c3;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance p4, Lb7/i0;

    .line 24
    .line 25
    const/16 v1, 0xb

    .line 26
    .line 27
    invoke-direct {p4, v1, v0, p3}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance p3, Lb7/i3;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p3, p4, v0}, Lb7/i3;-><init>(Lb7/p3;I)V

    .line 34
    .line 35
    .line 36
    const/16 p4, 0x1f

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, p4, p3}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception p1

    .line 43
    const-string p2, "MediaSessionStub"

    .line 44
    .line 45
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 46
    .line 47
    invoke-static {p2, p3, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
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

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 10

    .line 1
    const-string v2, "androidx.media3.session.IMediaSession"

    const/4 v8, 0x1

    if-lt p1, v8, :cond_0

    const v3, 0xffffff

    if-gt p1, v3, :cond_0

    .line 2
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    :cond_0
    const v3, 0x5f4e5446

    if-eq p1, v3, :cond_67

    .line 3
    const-string v2, "Ignoring malformed Bundle for Rating"

    const/4 v3, 0x0

    const-string v4, "MediaSessionStub"

    packed-switch p1, :pswitch_data_0

    const-string v2, "Ignoring malformed Bundle for LibraryParams"

    packed-switch p1, :pswitch_data_1

    .line 4
    invoke-super/range {p0 .. p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    .line 5
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v2

    .line 6
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 7
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v2, :cond_1

    goto/16 :goto_1f

    .line 8
    :cond_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    const-string v0, "unsubscribe(): Ignoring empty parentId"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    return v8

    .line 10
    :cond_2
    new-instance v0, Lb5/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lb5/a;-><init>(I)V

    .line 11
    new-instance v6, Lb7/i3;

    const/4 v1, 0x0

    invoke-direct {v6, v0, v1}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/4 v4, 0x0

    const v5, 0xc352

    move-object v1, p0

    .line 12
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    return v8

    .line 13
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 14
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 15
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 16
    sget-object v6, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v6}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-nez v0, :cond_3

    goto/16 :goto_1f

    .line 17
    :cond_3
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 18
    const-string v0, "subscribe(): Ignoring empty parentId"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    :cond_4
    if-nez v1, :cond_5

    goto :goto_0

    .line 19
    :cond_5
    :try_start_0
    invoke-static {v1}, Lb7/j1;->a(Landroid/os/Bundle;)Lb7/j1;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :goto_0
    new-instance v1, Lb7/c3;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lb7/c3;-><init>(I)V

    .line 21
    new-instance v6, Lb7/i3;

    const/4 v2, 0x0

    invoke-direct {v6, v1, v2}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/4 v4, 0x0

    const v5, 0xc351

    move-object v1, p0

    move-object v2, v0

    .line 22
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    goto/16 :goto_1f

    :catch_0
    move-exception v0

    .line 23
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1f

    .line 24
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 25
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 26
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 27
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 28
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 29
    sget-object v9, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v9}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-nez v0, :cond_6

    goto/16 :goto_1f

    .line 30
    :cond_6
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 31
    const-string v0, "getSearchResult(): Ignoring empty query"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    :cond_7
    if-gez v6, :cond_8

    .line 32
    const-string v0, "getSearchResult(): Ignoring negative page"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    :cond_8
    if-ge v7, v8, :cond_9

    .line 33
    const-string v0, "getSearchResult(): Ignoring pageSize less than 1"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    :cond_9
    if-nez v1, :cond_a

    goto :goto_1

    .line 34
    :cond_a
    :try_start_1
    invoke-static {v1}, Lb7/j1;->a(Landroid/os/Bundle;)Lb7/j1;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 35
    :goto_1
    new-instance v1, Lb7/c3;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lb7/c3;-><init>(I)V

    .line 36
    new-instance v6, Lb7/i3;

    invoke-direct {v6, v1, v2}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/4 v4, 0x0

    const v5, 0xc356

    move-object v1, p0

    move-object v2, v0

    .line 37
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    goto/16 :goto_1f

    :catch_1
    move-exception v0

    .line 38
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1f

    .line 39
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 40
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 41
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 42
    sget-object v6, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v6}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-nez v0, :cond_b

    goto/16 :goto_1f

    .line 43
    :cond_b
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 44
    const-string v0, "search(): Ignoring empty query"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    :cond_c
    if-nez v1, :cond_d

    goto :goto_2

    .line 45
    :cond_d
    :try_start_2
    invoke-static {v1}, Lb7/j1;->a(Landroid/os/Bundle;)Lb7/j1;
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 46
    :goto_2
    new-instance v1, Lb7/c3;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lb7/c3;-><init>(I)V

    .line 47
    new-instance v6, Lb7/i3;

    const/4 v2, 0x0

    invoke-direct {v6, v1, v2}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/4 v4, 0x0

    const v5, 0xc355

    move-object v1, p0

    move-object v2, v0

    .line 48
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    goto/16 :goto_1f

    :catch_2
    move-exception v0

    .line 49
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1f

    .line 50
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 51
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 52
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 54
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 55
    sget-object v9, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v9}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-nez v0, :cond_e

    goto/16 :goto_1f

    .line 56
    :cond_e
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 57
    const-string v0, "getChildren(): Ignoring empty parentId"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    :cond_f
    if-gez v6, :cond_10

    .line 58
    const-string v0, "getChildren(): Ignoring negative page"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    :cond_10
    if-ge v7, v8, :cond_11

    .line 59
    const-string v0, "getChildren(): Ignoring pageSize less than 1"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    :cond_11
    if-nez v1, :cond_12

    goto :goto_3

    .line 60
    :cond_12
    :try_start_3
    invoke-static {v1}, Lb7/j1;->a(Landroid/os/Bundle;)Lb7/j1;
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3

    .line 61
    :goto_3
    new-instance v1, Lb5/a;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 62
    new-instance v6, Lb7/i3;

    const/4 v2, 0x0

    invoke-direct {v6, v1, v2}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/4 v4, 0x0

    const v5, 0xc353

    move-object v1, p0

    move-object v2, v0

    .line 63
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    goto/16 :goto_1f

    :catch_3
    move-exception v0

    .line 64
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1f

    .line 65
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v2

    .line 66
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 67
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-nez v2, :cond_13

    goto/16 :goto_1f

    .line 68
    :cond_13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 69
    const-string v0, "getItem(): Ignoring empty mediaId"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    return v8

    .line 70
    :cond_14
    new-instance v0, Lb5/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lb5/a;-><init>(I)V

    .line 71
    new-instance v6, Lb7/i3;

    const/4 v1, 0x0

    invoke-direct {v6, v0, v1}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/4 v4, 0x0

    const v5, 0xc354

    move-object v1, p0

    .line 72
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    return v8

    .line 73
    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 74
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 75
    sget-object v5, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v5}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-nez v0, :cond_15

    goto/16 :goto_1f

    :cond_15
    if-nez v1, :cond_16

    goto :goto_4

    .line 76
    :cond_16
    :try_start_4
    invoke-static {v1}, Lb7/j1;->a(Landroid/os/Bundle;)Lb7/j1;
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    .line 77
    :goto_4
    new-instance v1, Lb7/c3;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lb7/c3;-><init>(I)V

    .line 78
    new-instance v6, Lb7/i3;

    const/4 v2, 0x0

    invoke-direct {v6, v1, v2}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/4 v4, 0x0

    const v5, 0xc350

    move-object v1, p0

    move-object v2, v0

    .line 79
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    goto/16 :goto_1f

    :catch_4
    move-exception v0

    .line 80
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1f

    .line 81
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 82
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 83
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v4}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    .line 84
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_17

    const/4 v3, 0x1

    :cond_17
    if-eqz v0, :cond_19

    if-nez v4, :cond_18

    goto :goto_5

    .line 85
    :cond_18
    :try_start_5
    invoke-static {v4}, Lm4/d;->a(Landroid/os/Bundle;)Lm4/d;

    move-result-object v1
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_5

    .line 86
    new-instance v4, Lb7/y2;

    const/4 v6, 0x1

    invoke-direct {v4, v1, v3, v6}, Lb7/y2;-><init>(Ljava/lang/Object;ZI)V

    .line 87
    invoke-static {v4}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x23

    .line 88
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_5

    :catch_5
    move-exception v0

    .line 89
    const-string v1, "MediaSessionStub"

    const-string v2, "Ignoring malformed Bundle for AudioAttributes"

    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    :goto_5
    return v8

    .line 90
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 91
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 92
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 93
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 94
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v0, :cond_1c

    if-eqz v1, :cond_1c

    if-ltz v3, :cond_1c

    if-ge v4, v3, :cond_1a

    goto :goto_7

    .line 95
    :cond_1a
    :try_start_6
    invoke-static {v1}, Lm4/f;->a(Landroid/os/IBinder;)Lya/i0;

    move-result-object v1

    .line 96
    invoke-static {}, Lya/i0;->p()Lya/f0;

    move-result-object v6

    const/4 v7, 0x0

    .line 97
    :goto_6
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    if-ge v7, v9, :cond_1b

    .line 98
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/os/Bundle;

    .line 99
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    invoke-static {v9}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    move-result-object v9

    .line 101
    invoke-virtual {v6, v9}, Lya/c0;->a(Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    .line 102
    :cond_1b
    invoke-virtual {v6}, Lya/f0;->f()Lya/a1;

    move-result-object v1
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_6

    .line 103
    new-instance v6, Landroidx/media3/exoplayer/offline/g;

    const/4 v7, 0x6

    invoke-direct {v6, v7, v1}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    new-instance v1, Lb7/r2;

    invoke-direct {v1, p0, v3, v4}, Lb7/r2;-><init>(Lb7/q3;II)V

    .line 104
    new-instance v3, Lb7/i0;

    const/16 v4, 0xc

    invoke-direct {v3, v4, v6, v1}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 105
    new-instance v1, Lb7/i3;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/16 v3, 0x14

    .line 106
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_7

    :catch_6
    move-exception v0

    .line 107
    const-string v1, "MediaSessionStub"

    const-string v2, "Ignoring malformed Bundle for MediaItem"

    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1c
    :goto_7
    return v8

    .line 108
    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 109
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 110
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 111
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v4}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v0, :cond_1e

    if-eqz v1, :cond_1e

    if-gez v3, :cond_1d

    goto :goto_8

    .line 112
    :cond_1d
    :try_start_7
    invoke-static {v1}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    move-result-object v1
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_7

    .line 113
    new-instance v4, Lb7/w2;

    const/4 v6, 0x1

    invoke-direct {v4, v1, v6}, Lb7/w2;-><init>(Lm4/i0;I)V

    new-instance v1, Lb7/s2;

    const/4 v6, 0x2

    invoke-direct {v1, p0, v3, v6}, Lb7/s2;-><init>(Lb7/q3;II)V

    .line 114
    new-instance v3, Lb7/i0;

    const/16 v6, 0xc

    invoke-direct {v3, v6, v4, v1}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 115
    new-instance v1, Lb7/i3;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/16 v3, 0x14

    .line 116
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_8

    :catch_7
    move-exception v0

    .line 117
    const-string v1, "MediaSessionStub"

    const-string v2, "Ignoring malformed Bundle for MediaItem"

    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1e
    :goto_8
    return v8

    .line 118
    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 119
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 120
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_1f

    const/4 v3, 0x1

    .line 121
    :cond_1f
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_20

    goto :goto_9

    .line 122
    :cond_20
    new-instance v4, Lb7/d3;

    invoke-direct {v4, v1, v3}, Lb7/d3;-><init>(IZ)V

    .line 123
    invoke-static {v4}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x22

    .line 124
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_9
    return v8

    .line 125
    :pswitch_b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 126
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 127
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_21

    goto :goto_a

    .line 128
    :cond_21
    new-instance v3, Lb7/x2;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lb7/x2;-><init>(II)V

    .line 129
    invoke-static {v3}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x22

    .line 130
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_a
    return v8

    .line 131
    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 132
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 133
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_22

    goto :goto_b

    .line 134
    :cond_22
    new-instance v3, Lb7/x2;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Lb7/x2;-><init>(II)V

    .line 135
    invoke-static {v3}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x22

    .line 136
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_b
    return v8

    .line 137
    :pswitch_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 138
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 139
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 140
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v0, :cond_24

    if-gez v3, :cond_23

    goto :goto_c

    .line 141
    :cond_23
    new-instance v4, Lb7/b3;

    const/4 v6, 0x0

    invoke-direct {v4, v3, v1, v6}, Lb7/b3;-><init>(III)V

    .line 142
    invoke-static {v4}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x21

    .line 143
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_24
    :goto_c
    return v8

    .line 144
    :pswitch_e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 145
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 146
    sget-object v6, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v6}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v0, :cond_47

    if-nez v1, :cond_25

    goto/16 :goto_1f

    .line 147
    :cond_25
    :try_start_8
    invoke-static {v1}, Lm4/z0;->a(Landroid/os/Bundle;)Lm4/z0;
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_8

    .line 148
    new-instance v1, Lb7/c3;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lb7/c3;-><init>(I)V

    .line 149
    new-instance v6, Lb7/i3;

    const/4 v2, 0x1

    invoke-direct {v6, v1, v2}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/4 v4, 0x0

    const v5, 0x9c4a

    move-object v1, p0

    move-object v2, v0

    .line 150
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    goto/16 :goto_1f

    :catch_8
    move-exception v0

    .line 151
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1f

    .line 152
    :pswitch_f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 153
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 154
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 155
    sget-object v6, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v6}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v0, :cond_47

    if-eqz v5, :cond_47

    if-nez v1, :cond_26

    goto/16 :goto_1f

    .line 156
    :cond_26
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_27

    .line 157
    const-string v0, "setRatingWithMediaId(): Ignoring empty mediaId"

    invoke-static {v4, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    .line 158
    :cond_27
    :try_start_9
    invoke-static {v1}, Lm4/z0;->a(Landroid/os/Bundle;)Lm4/z0;

    move-result-object v1
    :try_end_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_9

    .line 159
    new-instance v2, Lb5/a;

    const/16 v4, 0x1a

    invoke-direct {v2, v4, v5, v1}, Lb5/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 160
    new-instance v6, Lb7/i3;

    const/4 v1, 0x1

    invoke-direct {v6, v2, v1}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/4 v4, 0x0

    const v5, 0x9c4a

    move-object v1, p0

    move-object v2, v0

    .line 161
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    goto/16 :goto_1f

    :catch_9
    move-exception v0

    .line 162
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1f

    .line 163
    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 164
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 165
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v0, :cond_29

    if-nez v1, :cond_28

    goto :goto_d

    .line 166
    :cond_28
    :try_start_a
    invoke-static {v1}, Lm4/o1;->b(Landroid/os/Bundle;)Lm4/o1;

    move-result-object v1
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_a

    .line 167
    new-instance v3, Lb7/i0;

    const/16 v4, 0x9

    invoke-direct {v3, v4, p0, v1}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 168
    invoke-static {v3}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x1d

    .line 169
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_d

    :catch_a
    move-exception v0

    .line 170
    const-string v1, "MediaSessionStub"

    const-string v2, "Ignoring malformed Bundle for TrackSelectionParameters"

    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_29
    :goto_d
    return v8

    .line 171
    :pswitch_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 172
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_2a

    goto :goto_e

    .line 173
    :cond_2a
    iget-object v2, p0, Lb7/q3;->g:Lb0/w1;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    move-result-object v0

    if-eqz v0, :cond_2b

    .line 174
    new-instance v2, Lb5/a;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lb5/a;-><init>(I)V

    .line 175
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/16 v3, 0x9

    .line 176
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    :cond_2b
    :goto_e
    return v8

    .line 177
    :pswitch_12
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 178
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_2c

    goto :goto_f

    .line 179
    :cond_2c
    iget-object v2, p0, Lb7/q3;->g:Lb0/w1;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    move-result-object v0

    if-eqz v0, :cond_2d

    .line 180
    new-instance v2, Lb5/a;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lb5/a;-><init>(I)V

    .line 181
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/4 v3, 0x7

    .line 182
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    :cond_2d
    :goto_f
    return v8

    .line 183
    :pswitch_13
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 184
    invoke-virtual {p0, v0}, Lb7/q3;->w0(Lb7/r;)V

    return v8

    .line 185
    :pswitch_14
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 186
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 187
    sget-object v3, Landroid/view/Surface;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    if-nez v0, :cond_2e

    goto :goto_10

    .line 188
    :cond_2e
    new-instance v3, Landroidx/media3/exoplayer/offline/g;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v1}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 189
    invoke-static {v3}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x1b

    .line 190
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_10
    return v8

    .line 191
    :pswitch_15
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 192
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_2f

    goto :goto_11

    .line 193
    :cond_2f
    new-instance v2, Lb5/a;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lb5/a;-><init>(I)V

    .line 194
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/16 v3, 0x8

    .line 195
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_11
    return v8

    .line 196
    :pswitch_16
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 197
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_30

    goto :goto_12

    .line 198
    :cond_30
    new-instance v2, Lb5/a;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lb5/a;-><init>(I)V

    .line 199
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/4 v3, 0x6

    .line 200
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_12
    return v8

    .line 201
    :pswitch_17
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 202
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_31

    goto :goto_13

    .line 203
    :cond_31
    iget-object v2, p0, Lb7/q3;->g:Lb0/w1;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    move-result-object v0

    if-eqz v0, :cond_32

    .line 204
    new-instance v2, Lb5/a;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lb5/a;-><init>(I)V

    .line 205
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/16 v3, 0xc

    .line 206
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    :cond_32
    :goto_13
    return v8

    .line 207
    :pswitch_18
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 208
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_33

    goto :goto_14

    .line 209
    :cond_33
    iget-object v2, p0, Lb7/q3;->g:Lb0/w1;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    move-result-object v0

    if-eqz v0, :cond_34

    .line 210
    new-instance v2, Lb5/a;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lb5/a;-><init>(I)V

    .line 211
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/16 v3, 0xb

    .line 212
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    :cond_34
    :goto_14
    return v8

    .line 213
    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 214
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 215
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 216
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    if-eqz v0, :cond_36

    if-gez v3, :cond_35

    goto :goto_15

    .line 217
    :cond_35
    new-instance v1, Lb7/v2;

    invoke-direct {v1, v6, v7, p0, v3}, Lb7/v2;-><init>(JLjava/lang/Object;I)V

    .line 218
    new-instance v3, Landroidx/media3/exoplayer/offline/g;

    const/16 v4, 0x9

    invoke-direct {v3, v4, v1}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    const/16 v1, 0xa

    .line 219
    invoke-virtual {p0, v0, v2, v1, v3}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_36
    :goto_15
    return v8

    .line 220
    :pswitch_1a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 221
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 222
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    if-nez v0, :cond_37

    goto :goto_16

    .line 223
    :cond_37
    new-instance v1, Lb7/f3;

    invoke-direct {v1, v3, v4}, Lb7/f3;-><init>(J)V

    .line 224
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/4 v3, 0x5

    .line 225
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_16
    return v8

    .line 226
    :pswitch_1b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 227
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 228
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v0, :cond_39

    if-gez v1, :cond_38

    goto :goto_17

    .line 229
    :cond_38
    new-instance v3, Lb7/s2;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v1, v4}, Lb7/s2;-><init>(Lb7/q3;II)V

    .line 230
    new-instance v1, Landroidx/media3/exoplayer/offline/g;

    const/16 v4, 0x9

    invoke-direct {v1, v4, v3}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    const/16 v3, 0xa

    .line 231
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_39
    :goto_17
    return v8

    .line 232
    :pswitch_1c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 233
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 234
    invoke-virtual {p0, v0, v1}, Lb7/q3;->f(Lb7/r;I)V

    return v8

    .line 235
    :pswitch_1d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 236
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 237
    invoke-virtual {p0, v0, v1}, Lb7/q3;->Q(Lb7/r;I)V

    return v8

    .line 238
    :pswitch_1e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 239
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_3a

    goto :goto_18

    .line 240
    :cond_3a
    iget-object v2, p0, Lb7/q3;->g:Lb0/w1;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    move-result-object v0

    if-eqz v0, :cond_3b

    .line 241
    new-instance v2, Lb7/c3;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lb7/c3;-><init>(I)V

    .line 242
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/4 v3, 0x3

    .line 243
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    :cond_3b
    :goto_18
    return v8

    .line 244
    :pswitch_1f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 245
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 246
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v0, :cond_3d

    if-nez v1, :cond_3c

    goto :goto_19

    .line 247
    :cond_3c
    :try_start_b
    invoke-static {v1}, Lm4/l0;->b(Landroid/os/Bundle;)Lm4/l0;

    move-result-object v1
    :try_end_b
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_b

    .line 248
    new-instance v3, Lb7/e3;

    invoke-direct {v3, v1}, Lb7/e3;-><init>(Lm4/l0;)V

    .line 249
    invoke-static {v3}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x13

    .line 250
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_19

    :catch_b
    move-exception v0

    .line 251
    const-string v1, "MediaSessionStub"

    const-string v2, "Ignoring malformed Bundle for MediaMetadata"

    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3d
    :goto_19
    return v8

    .line 252
    :pswitch_20
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 253
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 254
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 255
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v0, :cond_40

    if-eqz v1, :cond_40

    if-gez v3, :cond_3e

    goto :goto_1b

    .line 256
    :cond_3e
    :try_start_c
    invoke-static {v1}, Lm4/f;->a(Landroid/os/IBinder;)Lya/i0;

    move-result-object v1

    .line 257
    invoke-static {}, Lya/i0;->p()Lya/f0;

    move-result-object v4

    const/4 v6, 0x0

    .line 258
    :goto_1a
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_3f

    .line 259
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/os/Bundle;

    .line 260
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    invoke-static {v7}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    move-result-object v7

    .line 262
    invoke-virtual {v4, v7}, Lya/c0;->a(Ljava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1a

    .line 263
    :cond_3f
    invoke-virtual {v4}, Lya/f0;->f()Lya/a1;

    move-result-object v1
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_c

    .line 264
    new-instance v4, Lb7/z2;

    const/4 v6, 0x0

    invoke-direct {v4, v6, v1}, Lb7/z2;-><init>(ILjava/util/List;)V

    new-instance v1, Lb7/s2;

    const/4 v6, 0x3

    invoke-direct {v1, p0, v3, v6}, Lb7/s2;-><init>(Lb7/q3;II)V

    .line 265
    new-instance v3, Lb7/i0;

    const/16 v6, 0xc

    invoke-direct {v3, v6, v4, v1}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 266
    new-instance v1, Lb7/i3;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/16 v3, 0x14

    .line 267
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_1b

    :catch_c
    move-exception v0

    .line 268
    const-string v1, "MediaSessionStub"

    const-string v2, "Ignoring malformed Bundle for MediaItem"

    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_40
    :goto_1b
    return v8

    .line 269
    :pswitch_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 270
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 271
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v0, :cond_43

    if-nez v1, :cond_41

    goto :goto_1d

    .line 272
    :cond_41
    :try_start_d
    invoke-static {v1}, Lm4/f;->a(Landroid/os/IBinder;)Lya/i0;

    move-result-object v1

    .line 273
    invoke-static {}, Lya/i0;->p()Lya/f0;

    move-result-object v3

    const/4 v4, 0x0

    .line 274
    :goto_1c
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_42

    .line 275
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/os/Bundle;

    .line 276
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    invoke-static {v6}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    move-result-object v6

    .line 278
    invoke-virtual {v3, v6}, Lya/c0;->a(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1c

    .line 279
    :cond_42
    invoke-virtual {v3}, Lya/f0;->f()Lya/a1;

    move-result-object v1
    :try_end_d
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_d

    .line 280
    new-instance v3, Lb7/z2;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v1}, Lb7/z2;-><init>(ILjava/util/List;)V

    new-instance v1, Lb5/a;

    const/16 v4, 0x1b

    invoke-direct {v1, v4}, Lb5/a;-><init>(I)V

    .line 281
    new-instance v4, Lb7/i0;

    const/16 v6, 0xc

    invoke-direct {v4, v6, v3, v1}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 282
    new-instance v1, Lb7/i3;

    const/4 v3, 0x1

    invoke-direct {v1, v4, v3}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/16 v3, 0x14

    .line 283
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_1d

    :catch_d
    move-exception v0

    .line 284
    const-string v1, "MediaSessionStub"

    const-string v2, "Ignoring malformed Bundle for MediaItem"

    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_43
    :goto_1d
    return v8

    .line 285
    :pswitch_22
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 286
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 287
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 288
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v4}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v0, :cond_45

    if-eqz v1, :cond_45

    if-gez v3, :cond_44

    goto :goto_1e

    .line 289
    :cond_44
    :try_start_e
    invoke-static {v1}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    move-result-object v1
    :try_end_e
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_e

    .line 290
    new-instance v4, Lb7/w2;

    const/4 v6, 0x0

    invoke-direct {v4, v1, v6}, Lb7/w2;-><init>(Lm4/i0;I)V

    new-instance v1, Lb7/s2;

    const/4 v6, 0x1

    invoke-direct {v1, p0, v3, v6}, Lb7/s2;-><init>(Lb7/q3;II)V

    .line 291
    new-instance v3, Lb7/i0;

    const/16 v6, 0xc

    invoke-direct {v3, v6, v4, v1}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 292
    new-instance v1, Lb7/i3;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/16 v3, 0x14

    .line 293
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_1e

    :catch_e
    move-exception v0

    .line 294
    const-string v1, "MediaSessionStub"

    const-string v2, "Ignoring malformed Bundle for MediaItem"

    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_45
    :goto_1e
    return v8

    .line 295
    :pswitch_23
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 296
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 297
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v0, :cond_47

    if-nez v1, :cond_46

    goto :goto_1f

    .line 298
    :cond_46
    :try_start_f
    invoke-static {v1}, Lm4/i0;->a(Landroid/os/Bundle;)Lm4/i0;

    move-result-object v1
    :try_end_f
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_f

    .line 299
    new-instance v3, Lb7/w2;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v4}, Lb7/w2;-><init>(Lm4/i0;I)V

    new-instance v1, Lb5/a;

    const/16 v4, 0x1d

    invoke-direct {v1, v4}, Lb5/a;-><init>(I)V

    .line 300
    new-instance v4, Lb7/i0;

    const/16 v6, 0xc

    invoke-direct {v4, v6, v3, v1}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 301
    new-instance v1, Lb7/i3;

    const/4 v3, 0x1

    invoke-direct {v1, v4, v3}, Lb7/i3;-><init>(Lb7/p3;I)V

    const/16 v3, 0x14

    .line 302
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_1f

    :catch_f
    move-exception v0

    .line 303
    const-string v1, "Ignoring malformed Bundle for MediaItem"

    invoke-static {v4, v1, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_47
    :goto_1f
    return v8

    .line 304
    :pswitch_24
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 305
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 306
    invoke-virtual {p2}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    if-eqz v0, :cond_49

    const/4 v3, 0x0

    cmpl-float v3, v1, v3

    if-gtz v3, :cond_48

    goto :goto_20

    .line 307
    :cond_48
    new-instance v3, Lb7/u2;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lb7/u2;-><init>(FI)V

    .line 308
    invoke-static {v3}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0xd

    .line 309
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_49
    :goto_20
    return v8

    .line 310
    :pswitch_25
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 311
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 312
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v0, :cond_4b

    if-nez v1, :cond_4a

    goto :goto_21

    .line 313
    :cond_4a
    :try_start_10
    sget-object v3, Lm4/s0;->e:Ljava/lang/String;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v3

    .line 314
    sget-object v6, Lm4/s0;->f:Ljava/lang/String;

    invoke-virtual {v1, v6, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v1

    .line 315
    new-instance v4, Lm4/s0;

    invoke-direct {v4, v3, v1}, Lm4/s0;-><init>(FF)V
    :try_end_10
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_10

    .line 316
    new-instance v1, Landroidx/media3/exoplayer/offline/g;

    const/4 v3, 0x7

    invoke-direct {v1, v3, v4}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 317
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0xd

    .line 318
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    goto :goto_21

    :catch_10
    move-exception v0

    .line 319
    const-string v1, "MediaSessionStub"

    const-string v2, "Ignoring malformed Bundle for PlaybackParameters"

    invoke-static {v1, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4b
    :goto_21
    return v8

    .line 320
    :pswitch_26
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 321
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 322
    invoke-virtual {p0, v0, v1}, Lb7/q3;->v(Lb7/r;I)V

    return v8

    .line 323
    :pswitch_27
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 324
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_4c

    goto :goto_22

    .line 325
    :cond_4c
    iget-object v2, p0, Lb7/q3;->g:Lb0/w1;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    move-result-object v0

    if-eqz v0, :cond_4d

    .line 326
    new-instance v2, Lb5/a;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lb5/a;-><init>(I)V

    .line 327
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/4 v3, 0x1

    .line 328
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->G0(Lb7/t1;IILb7/p3;)V

    :cond_4d
    :goto_22
    return v8

    .line 329
    :pswitch_28
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 330
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 331
    invoke-virtual {p0, v0, v1}, Lb7/q3;->W(Lb7/r;I)V

    return v8

    .line 332
    :pswitch_29
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 333
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 334
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 335
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 336
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v0, :cond_4f

    if-ltz v3, :cond_4f

    if-lt v4, v3, :cond_4f

    if-gez v1, :cond_4e

    goto :goto_23

    .line 337
    :cond_4e
    new-instance v6, Lb7/a3;

    invoke-direct {v6, v3, v4, v1}, Lb7/a3;-><init>(III)V

    .line 338
    invoke-static {v6}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x14

    .line 339
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_4f
    :goto_23
    return v8

    .line 340
    :pswitch_2a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 341
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 342
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 343
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v0, :cond_51

    if-ltz v3, :cond_51

    if-gez v1, :cond_50

    goto :goto_24

    .line 344
    :cond_50
    new-instance v4, Lb7/b3;

    const/4 v6, 0x1

    invoke-direct {v4, v3, v1, v6}, Lb7/b3;-><init>(III)V

    .line 345
    invoke-static {v4}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x14

    .line 346
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_51
    :goto_24
    return v8

    .line 347
    :pswitch_2b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 348
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_52

    goto :goto_25

    .line 349
    :cond_52
    new-instance v2, Lb7/c3;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lb7/c3;-><init>(I)V

    .line 350
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/16 v3, 0x14

    .line 351
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_25
    return v8

    .line 352
    :pswitch_2c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 353
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 354
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 355
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v0, :cond_54

    if-ltz v3, :cond_54

    if-ge v1, v3, :cond_53

    goto :goto_26

    .line 356
    :cond_53
    new-instance v4, Lb7/r2;

    invoke-direct {v4, p0, v3, v1}, Lb7/r2;-><init>(Lb7/q3;II)V

    .line 357
    new-instance v1, Landroidx/media3/exoplayer/offline/g;

    const/16 v3, 0x9

    invoke-direct {v1, v3, v4}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    const/16 v3, 0x14

    .line 358
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_54
    :goto_26
    return v8

    .line 359
    :pswitch_2d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 360
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 361
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v0, :cond_56

    if-gez v1, :cond_55

    goto :goto_27

    .line 362
    :cond_55
    new-instance v3, Lb7/s2;

    const/4 v4, 0x4

    invoke-direct {v3, p0, v1, v4}, Lb7/s2;-><init>(Lb7/q3;II)V

    .line 363
    new-instance v1, Landroidx/media3/exoplayer/offline/g;

    const/16 v4, 0x9

    invoke-direct {v1, v4, v3}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    const/16 v3, 0x14

    .line 364
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_56
    :goto_27
    return v8

    .line 365
    :pswitch_2e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 366
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 367
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_57

    const/4 v3, 0x1

    :cond_57
    if-nez v0, :cond_58

    goto :goto_28

    .line 368
    :cond_58
    new-instance v1, Lb7/t2;

    const/4 v4, 0x2

    invoke-direct {v1, v4, v3}, Lb7/t2;-><init>(IZ)V

    .line 369
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0xe

    .line 370
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_28
    return v8

    .line 371
    :pswitch_2f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 372
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 373
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_59

    goto :goto_29

    :cond_59
    const/4 v3, 0x2

    if-eq v1, v3, :cond_5a

    if-eqz v1, :cond_5a

    const/4 v3, 0x1

    if-eq v1, v3, :cond_5a

    goto :goto_29

    .line 374
    :cond_5a
    new-instance v3, Lb7/x2;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v4}, Lb7/x2;-><init>(II)V

    .line 375
    invoke-static {v3}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0xf

    .line 376
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_29
    return v8

    .line 377
    :pswitch_30
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 378
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 379
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    .line 380
    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    .line 381
    invoke-virtual {p0, v0, v2, v4, v1}, Lb7/q3;->x0(Lb7/r;ILandroid/os/Bundle;Landroid/os/Bundle;)V

    return v8

    .line 382
    :pswitch_31
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 383
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 384
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    .line 385
    invoke-virtual {p0, v0, v2, v1}, Lb7/q3;->H(Lb7/r;ILandroid/os/Bundle;)V

    return v8

    .line 386
    :pswitch_32
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 387
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 388
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    .line 389
    invoke-virtual {p0, v0, v2, v1}, Lb7/q3;->V(Lb7/r;ILandroid/os/Bundle;)V

    return v8

    .line 390
    :pswitch_33
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 391
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 392
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_5b

    const/4 v3, 0x1

    :cond_5b
    if-nez v0, :cond_5c

    goto :goto_2a

    .line 393
    :cond_5c
    new-instance v1, Lb7/t2;

    const/4 v4, 0x0

    invoke-direct {v1, v4, v3}, Lb7/t2;-><init>(IZ)V

    .line 394
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/4 v3, 0x1

    .line 395
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_2a
    return v8

    .line 396
    :pswitch_34
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v2

    .line 397
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 398
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v4

    .line 399
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 400
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    move-object v1, p0

    .line 401
    invoke-virtual/range {v1 .. v7}, Lb7/q3;->c0(Lb7/r;ILandroid/os/IBinder;IJ)V

    return v8

    .line 402
    :pswitch_35
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 403
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 404
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v4

    .line 405
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_5d

    const/4 v3, 0x1

    .line 406
    :cond_5d
    invoke-virtual {p0, v0, v2, v4, v3}, Lb7/q3;->R(Lb7/r;ILandroid/os/IBinder;Z)V

    return v8

    .line 407
    :pswitch_36
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 408
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 409
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    .line 410
    invoke-virtual {p0, v0, v2, v1, v8}, Lb7/q3;->R(Lb7/r;ILandroid/os/IBinder;Z)V

    return v8

    .line 411
    :pswitch_37
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 412
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 413
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v4}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    .line 414
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_5e

    const/4 v3, 0x1

    .line 415
    :cond_5e
    invoke-virtual {p0, v0, v2, v4, v3}, Lb7/q3;->n(Lb7/r;ILandroid/os/Bundle;Z)V

    return v8

    .line 416
    :pswitch_38
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v2

    .line 417
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 418
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v0}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/Bundle;

    .line 419
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v5

    move-object v1, p0

    .line 420
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->l0(Lb7/r;ILandroid/os/Bundle;J)V

    return v8

    .line 421
    :pswitch_39
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 422
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 423
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v3}, Lb7/s3;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    .line 424
    invoke-virtual {p0, v0, v2, v1, v8}, Lb7/q3;->n(Lb7/r;ILandroid/os/Bundle;Z)V

    return v8

    .line 425
    :pswitch_3a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 426
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 427
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_5f

    const/4 v3, 0x1

    :cond_5f
    if-nez v0, :cond_60

    goto :goto_2b

    .line 428
    :cond_60
    new-instance v1, Lb7/t2;

    const/4 v4, 0x1

    invoke-direct {v1, v4, v3}, Lb7/t2;-><init>(IZ)V

    .line 429
    invoke-static {v1}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x1a

    .line 430
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_2b
    return v8

    .line 431
    :pswitch_3b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 432
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_61

    goto :goto_2c

    .line 433
    :cond_61
    new-instance v2, Lb5/a;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lb5/a;-><init>(I)V

    .line 434
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/16 v3, 0x1a

    .line 435
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_2c
    return v8

    .line 436
    :pswitch_3c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 437
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v0, :cond_62

    goto :goto_2d

    .line 438
    :cond_62
    new-instance v2, Lb5/a;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lb5/a;-><init>(I)V

    .line 439
    invoke-static {v2}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v2

    const/16 v3, 0x1a

    .line 440
    invoke-virtual {p0, v0, v1, v3, v2}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :goto_2d
    return v8

    .line 441
    :pswitch_3d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 442
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 443
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v0, :cond_64

    if-gez v1, :cond_63

    goto :goto_2e

    .line 444
    :cond_63
    new-instance v3, Lb7/x2;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v4}, Lb7/x2;-><init>(II)V

    .line 445
    invoke-static {v3}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x19

    .line 446
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_64
    :goto_2e
    return v8

    .line 447
    :pswitch_3e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lb7/i1;->A0(Landroid/os/IBinder;)Lb7/r;

    move-result-object v0

    .line 448
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 449
    invoke-virtual {p2}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    if-eqz v0, :cond_66

    const/4 v3, 0x0

    cmpl-float v3, v1, v3

    if-ltz v3, :cond_66

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v3, v1, v3

    if-lez v3, :cond_65

    goto :goto_2f

    .line 450
    :cond_65
    new-instance v3, Lb7/u2;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Lb7/u2;-><init>(FI)V

    .line 451
    invoke-static {v3}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    move-result-object v1

    const/16 v3, 0x18

    .line 452
    invoke-virtual {p0, v0, v2, v3, v1}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    :cond_66
    :goto_2f
    return v8

    .line 453
    :cond_67
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v8

    nop

    :pswitch_data_0
    .packed-switch 0xbba
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xfa1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final v(Lb7/r;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lb7/c3;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1}, Lb7/c3;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lb7/q3;->I0(Lp4/g;)Landroidx/media3/exoplayer/offline/g;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-virtual {p0, p1, p2, v1, v0}, Lb7/q3;->F0(Lb7/r;IILb7/p3;)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public final w0(Lb7/r;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    :try_start_0
    iget-object v2, p0, Lb7/q3;->e:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lb7/c2;

    .line 15
    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    invoke-virtual {v2}, Lb7/c2;->h()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v3, p0, Lb7/q3;->g:Lb0/w1;

    .line 26
    .line 27
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v3, p1}, Lb0/w1;->M(Ljava/lang/Object;)Lb7/t1;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object v2, v2, Lb7/c2;->l:Landroid/os/Handler;

    .line 38
    .line 39
    new-instance v3, Lb5/h;

    .line 40
    .line 41
    const/16 v4, 0xa

    .line 42
    .line 43
    invoke-direct {v3, v4, p0, p1}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_0
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    :goto_1
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :goto_2
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 61
    .line 62
    .line 63
    throw p1
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

.method public final x0(Lb7/r;ILandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p3, :cond_1

    .line 4
    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p3}, Lb7/e4;->a(Landroid/os/Bundle;)Lb7/e4;

    .line 9
    .line 10
    .line 11
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    new-instance p3, Lb5/a;

    .line 13
    .line 14
    const/16 v0, 0x14

    .line 15
    .line 16
    invoke-direct {p3, v0, v4, p4}, Lb5/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v6, Lb7/i3;

    .line 20
    .line 21
    const/4 p4, 0x1

    .line 22
    invoke-direct {v6, p3, p4}, Lb7/i3;-><init>(Lb7/p3;I)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    move-object v1, p0

    .line 27
    move-object v2, p1

    .line 28
    move v3, p2

    .line 29
    invoke-virtual/range {v1 .. v6}, Lb7/q3;->B0(Lb7/r;ILb7/e4;ILb7/p3;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception v0

    .line 34
    move-object p1, v0

    .line 35
    const-string p2, "MediaSessionStub"

    .line 36
    .line 37
    const-string p3, "Ignoring malformed Bundle for SessionCommand"

    .line 38
    .line 39
    invoke-static {p2, p3, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void
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

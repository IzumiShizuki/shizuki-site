.class public final synthetic Lb5/m;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb7/p1;Lb7/d0;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput p1, p0, Lb5/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb5/m;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb5/m;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb5/m;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lb5/m;->a:I

    iput-object p1, p0, Lb5/m;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb5/m;->c:Ljava/lang/Object;

    iput-object p3, p0, Lb5/m;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lb5/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv4/q0;

    .line 9
    .line 10
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/util/Pair;

    .line 13
    .line 14
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/lang/Exception;

    .line 17
    .line 18
    iget-object v0, v0, Lv4/q0;->b:Lv4/t0;

    .line 19
    .line 20
    iget-object v0, v0, Lv4/t0;->h:Lw4/d;

    .line 21
    .line 22
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lj5/d0;

    .line 33
    .line 34
    invoke-virtual {v0, v3, v1, v2}, Lw4/d;->x(ILj5/d0;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lv4/j0;

    .line 41
    .line 42
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lya/f0;

    .line 45
    .line 46
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lj5/d0;

    .line 49
    .line 50
    iget-object v0, v0, Lv4/j0;->c:Lw4/d;

    .line 51
    .line 52
    invoke-virtual {v1}, Lya/f0;->f()Lya/a1;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v3, v0, Lw4/d;->d:Lb7/b1;

    .line 57
    .line 58
    iget-object v0, v0, Lw4/d;->g:Lm4/y0;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    iput-object v4, v3, Lb7/b1;->e:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_0

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-virtual {v1, v4}, Lya/a1;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Lj5/d0;

    .line 84
    .line 85
    iput-object v1, v3, Lb7/b1;->f:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iput-object v2, v3, Lb7/b1;->g:Ljava/lang/Object;

    .line 91
    .line 92
    :cond_0
    iget-object v1, v3, Lb7/b1;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Lj5/d0;

    .line 95
    .line 96
    if-nez v1, :cond_1

    .line 97
    .line 98
    iget-object v1, v3, Lb7/b1;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Lya/i0;

    .line 101
    .line 102
    iget-object v2, v3, Lb7/b1;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Lj5/d0;

    .line 105
    .line 106
    iget-object v4, v3, Lb7/b1;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v4, Lm4/f1;

    .line 109
    .line 110
    invoke-static {v0, v1, v2, v4}, Lb7/b1;->u(Lm4/y0;Lya/i0;Lj5/d0;Lm4/f1;)Lj5/d0;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iput-object v1, v3, Lb7/b1;->d:Ljava/lang/Object;

    .line 115
    .line 116
    :cond_1
    invoke-interface {v0}, Lm4/y0;->J()Lm4/i1;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v3, v0}, Lb7/b1;->L(Lm4/i1;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_1
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v1, v0

    .line 127
    check-cast v1, Lcb/e0;

    .line 128
    .line 129
    iget-object v0, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Lb5/h;

    .line 132
    .line 133
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, Lb7/i4;

    .line 136
    .line 137
    :try_start_0
    iget-object v3, v1, Lcb/p;->a:Ljava/lang/Object;

    .line 138
    .line 139
    instance-of v3, v3, Lcb/a;

    .line 140
    .line 141
    if-eqz v3, :cond_2

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    invoke-virtual {v0}, Lb5/h;->run()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v2}, Lcb/p;->k(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :catchall_0
    move-exception v0

    .line 152
    invoke-virtual {v1, v0}, Lcb/p;->l(Ljava/lang/Throwable;)Z

    .line 153
    .line 154
    .line 155
    :goto_0
    return-void

    .line 156
    :pswitch_2
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lcb/y;

    .line 159
    .line 160
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, Lcb/e0;

    .line 163
    .line 164
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v2, Lcb/q;

    .line 167
    .line 168
    :try_start_1
    invoke-static {v0}, Lg8/a;->B(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    .line 172
    :try_start_2
    invoke-interface {v2, v0}, Lcb/q;->apply(Ljava/lang/Object;)Lcb/y;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v1, v0}, Lcb/e0;->m(Lcb/y;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :catchall_1
    move-exception v0

    .line 181
    invoke-virtual {v1, v0}, Lcb/p;->l(Ljava/lang/Throwable;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :catch_0
    move-exception v0

    .line 186
    goto :goto_1

    .line 187
    :catch_1
    move-exception v0

    .line 188
    :goto_1
    invoke-virtual {v1, v0}, Lcb/p;->l(Ljava/lang/Throwable;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_3

    .line 192
    :catch_2
    move-exception v0

    .line 193
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    if-nez v2, :cond_3

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_3
    move-object v0, v2

    .line 201
    :goto_2
    invoke-virtual {v1, v0}, Lcb/p;->l(Ljava/lang/Throwable;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :catch_3
    const/4 v0, 0x0

    .line 206
    invoke-virtual {v1, v0}, Lcb/p;->cancel(Z)Z

    .line 207
    .line 208
    .line 209
    :goto_3
    return-void

    .line 210
    :pswitch_3
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lc4/n;

    .line 213
    .line 214
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v1, Landroid/support/v4/media/session/b;

    .line 217
    .line 218
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 221
    .line 222
    :try_start_3
    iget-object v0, v0, Lc4/n;->a:Landroid/content/Context;

    .line 223
    .line 224
    invoke-static {v0}, La2/c;->D(Landroid/content/Context;)Lc4/u;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-eqz v0, :cond_4

    .line 229
    .line 230
    iget-object v3, v0, Lc4/g;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v3, Lc4/j;

    .line 233
    .line 234
    check-cast v3, Lc4/t;

    .line 235
    .line 236
    iget-object v4, v3, Lc4/t;->d:Ljava/lang/Object;

    .line 237
    .line 238
    monitor-enter v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 239
    :try_start_4
    iput-object v2, v3, Lc4/t;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 240
    .line 241
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 242
    :try_start_5
    iget-object v0, v0, Lc4/g;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Lc4/j;

    .line 245
    .line 246
    new-instance v3, Lc4/m;

    .line 247
    .line 248
    invoke-direct {v3, v1, v2}, Lc4/m;-><init>(Landroid/support/v4/media/session/b;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v0, v3}, Lc4/j;->a(Landroid/support/v4/media/session/b;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :catchall_2
    move-exception v0

    .line 256
    goto :goto_4

    .line 257
    :catchall_3
    move-exception v0

    .line 258
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 259
    :try_start_7
    throw v0

    .line 260
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 261
    .line 262
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 263
    .line 264
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 268
    :goto_4
    invoke-virtual {v1, v0}, Landroid/support/v4/media/session/b;->N(Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 272
    .line 273
    .line 274
    :goto_5
    return-void

    .line 275
    :pswitch_4
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, Lb7/c2;

    .line 278
    .line 279
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v1, Lb7/c3;

    .line 282
    .line 283
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v2, Lb7/u1;

    .line 286
    .line 287
    invoke-virtual {v0}, Lb7/c2;->h()Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-nez v3, :cond_5

    .line 292
    .line 293
    iget-object v0, v0, Lb7/c2;->t:Lb7/z3;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v2}, Lb7/s3;->i(Lm4/y0;Lb7/u1;)V

    .line 299
    .line 300
    .line 301
    :cond_5
    return-void

    .line 302
    :pswitch_5
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, Lcom/cnl/kikoeru/MainService;

    .line 305
    .line 306
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 307
    .line 308
    move-object v3, v1

    .line 309
    check-cast v3, Lb7/p1;

    .line 310
    .line 311
    iget-object v1, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 312
    .line 313
    move-object v6, v1

    .line 314
    check-cast v6, Lb7/v1;

    .line 315
    .line 316
    iget-object v8, v3, Lb7/p1;->a:Lcom/cnl/kikoeru/MainService;

    .line 317
    .line 318
    iget-object v1, v3, Lb7/p1;->g:Ljava/util/HashMap;

    .line 319
    .line 320
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-eqz v2, :cond_6

    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_6
    new-instance v5, Lb7/o1;

    .line 328
    .line 329
    invoke-direct {v5, v8, v6}, Lb7/o1;-><init>(Lcom/cnl/kikoeru/MainService;Lb7/v1;)V

    .line 330
    .line 331
    .line 332
    new-instance v2, Landroid/os/Bundle;

    .line 333
    .line 334
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 335
    .line 336
    .line 337
    const-string v4, "androidx.media3.session.MediaNotificationManager"

    .line 338
    .line 339
    const/4 v7, 0x1

    .line 340
    invoke-virtual {v2, v4, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 341
    .line 342
    .line 343
    iget-object v4, v6, Lb7/v1;->a:Lb7/c2;

    .line 344
    .line 345
    iget-object v9, v4, Lb7/c2;->j:Lb7/k4;

    .line 346
    .line 347
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 351
    .line 352
    invoke-static {}, Lp4/c0;->v()Landroid/os/Looper;

    .line 353
    .line 354
    .line 355
    new-instance v10, Landroid/os/Bundle;

    .line 356
    .line 357
    invoke-direct {v10, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 358
    .line 359
    .line 360
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    new-instance v4, Lb7/f0;

    .line 368
    .line 369
    invoke-direct {v4, v12}, Lb7/f0;-><init>(Landroid/os/Looper;)V

    .line 370
    .line 371
    .line 372
    iget-object v2, v9, Lb7/k4;->a:Lb7/j4;

    .line 373
    .line 374
    invoke-interface {v2}, Lb7/j4;->i()Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-eqz v2, :cond_7

    .line 379
    .line 380
    new-instance v2, Landroidx/media3/exoplayer/offline/u;

    .line 381
    .line 382
    new-instance v7, Ls4/i;

    .line 383
    .line 384
    invoke-direct {v7, v8}, Ls4/i;-><init>(Landroid/content/Context;)V

    .line 385
    .line 386
    .line 387
    invoke-direct {v2, v7}, Landroidx/media3/exoplayer/offline/u;-><init>(Ls4/i;)V

    .line 388
    .line 389
    .line 390
    :goto_6
    move-object v14, v2

    .line 391
    goto :goto_7

    .line 392
    :cond_7
    const/4 v2, 0x0

    .line 393
    goto :goto_6

    .line 394
    :goto_7
    new-instance v7, Lb7/d0;

    .line 395
    .line 396
    move-object v13, v4

    .line 397
    move-object v11, v5

    .line 398
    invoke-direct/range {v7 .. v14}, Lb7/d0;-><init>(Landroid/content/Context;Lb7/k4;Landroid/os/Bundle;Lb7/b0;Landroid/os/Looper;Lb7/f0;Landroidx/media3/exoplayer/offline/u;)V

    .line 399
    .line 400
    .line 401
    new-instance v2, Landroid/os/Handler;

    .line 402
    .line 403
    invoke-direct {v2, v12}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 404
    .line 405
    .line 406
    new-instance v8, Lb7/z;

    .line 407
    .line 408
    const/4 v9, 0x0

    .line 409
    invoke-direct {v8, v4, v7, v9}, Lb7/z;-><init>(Lb7/f0;Lb7/d0;I)V

    .line 410
    .line 411
    .line 412
    invoke-static {v2, v8}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    new-instance v2, Lb7/f;

    .line 419
    .line 420
    const/4 v7, 0x1

    .line 421
    invoke-direct/range {v2 .. v7}, Lb7/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 422
    .line 423
    .line 424
    iget-object v1, v3, Lb7/p1;->e:Lb7/k1;

    .line 425
    .line 426
    invoke-virtual {v4, v2, v1}, Lcb/p;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 427
    .line 428
    .line 429
    :goto_8
    new-instance v1, Lb0/c1;

    .line 430
    .line 431
    const/4 v2, 0x2

    .line 432
    invoke-direct {v1, v2, v0}, Lb0/c1;-><init>(ILjava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    iget-object v0, v6, Lb7/v1;->a:Lb7/c2;

    .line 436
    .line 437
    iput-object v1, v0, Lb7/c2;->w:Lb0/c1;

    .line 438
    .line 439
    return-void

    .line 440
    :pswitch_6
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v0, Lb7/y1;

    .line 443
    .line 444
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v1, Lb7/t1;

    .line 447
    .line 448
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v2, Landroid/view/KeyEvent;

    .line 451
    .line 452
    iget-object v3, v0, Lb7/y1;->c:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v3, Lb7/c2;

    .line 455
    .line 456
    invoke-virtual {v3, v1}, Lb7/c2;->g(Lb7/t1;)Z

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    if-eqz v4, :cond_8

    .line 461
    .line 462
    const/4 v1, 0x0

    .line 463
    invoke-virtual {v3, v2, v1}, Lb7/c2;->a(Landroid/view/KeyEvent;Z)Z

    .line 464
    .line 465
    .line 466
    goto :goto_9

    .line 467
    :cond_8
    iget-object v2, v3, Lb7/c2;->h:Lb7/o2;

    .line 468
    .line 469
    iget-object v1, v1, Lb7/t1;->a:Lc7/k1;

    .line 470
    .line 471
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    new-instance v3, Lb7/e2;

    .line 478
    .line 479
    const/4 v4, 0x1

    .line 480
    invoke-direct {v3, v2, v4}, Lb7/e2;-><init>(Lb7/o2;I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v4, v3, v1, v4}, Lb7/o2;->H(ILb7/n2;Lc7/k1;Z)V

    .line 484
    .line 485
    .line 486
    :goto_9
    const/4 v1, 0x0

    .line 487
    iput-object v1, v0, Lb7/y1;->b:Ljava/lang/Object;

    .line 488
    .line 489
    return-void

    .line 490
    :pswitch_7
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v0, Lb7/c2;

    .line 493
    .line 494
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v1, Ljava/lang/Runnable;

    .line 497
    .line 498
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v2, Lb7/t1;

    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 506
    .line 507
    .line 508
    iget-object v0, v0, Lb7/c2;->g:Lb7/q3;

    .line 509
    .line 510
    iget-object v0, v0, Lb7/q3;->g:Lb0/w1;

    .line 511
    .line 512
    invoke-virtual {v0, v2}, Lb0/w1;->F(Lb7/t1;)V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :pswitch_8
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, Lb7/d0;

    .line 519
    .line 520
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v1, Ljava/lang/String;

    .line 523
    .line 524
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v2, Landroid/os/Bundle;

    .line 527
    .line 528
    invoke-virtual {v0}, Lb7/d0;->f()V

    .line 529
    .line 530
    .line 531
    iget-object v3, v0, Lb7/d0;->b:Lb7/c0;

    .line 532
    .line 533
    invoke-interface {v3}, Lb7/c0;->T()Z

    .line 534
    .line 535
    .line 536
    move-result v4

    .line 537
    if-nez v4, :cond_9

    .line 538
    .line 539
    sget-object v4, Lb7/f4;->b:Lb7/f4;

    .line 540
    .line 541
    goto :goto_a

    .line 542
    :cond_9
    invoke-interface {v3}, Lb7/c0;->O()Lb7/f4;

    .line 543
    .line 544
    .line 545
    move-result-object v4

    .line 546
    :goto_a
    iget-object v4, v4, Lb7/f4;->a:Lya/m0;

    .line 547
    .line 548
    invoke-virtual {v4}, Lya/d0;->n()Lya/o1;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 553
    .line 554
    .line 555
    move-result v5

    .line 556
    if-eqz v5, :cond_b

    .line 557
    .line 558
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v5

    .line 562
    check-cast v5, Lb7/e4;

    .line 563
    .line 564
    iget v6, v5, Lb7/e4;->a:I

    .line 565
    .line 566
    if-nez v6, :cond_a

    .line 567
    .line 568
    iget-object v6, v5, Lb7/e4;->b:Ljava/lang/String;

    .line 569
    .line 570
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    if-eqz v6, :cond_a

    .line 575
    .line 576
    goto :goto_b

    .line 577
    :cond_b
    const/4 v5, 0x0

    .line 578
    :goto_b
    if-eqz v5, :cond_e

    .line 579
    .line 580
    invoke-virtual {v0}, Lb7/d0;->f()V

    .line 581
    .line 582
    .line 583
    invoke-interface {v3}, Lb7/c0;->T()Z

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    if-nez v4, :cond_c

    .line 588
    .line 589
    sget-object v4, Lb7/f4;->b:Lb7/f4;

    .line 590
    .line 591
    goto :goto_c

    .line 592
    :cond_c
    invoke-interface {v3}, Lb7/c0;->O()Lb7/f4;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    :goto_c
    iget-object v4, v4, Lb7/f4;->a:Lya/m0;

    .line 597
    .line 598
    invoke-virtual {v4, v5}, Lya/d0;->contains(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v4

    .line 602
    if-eqz v4, :cond_e

    .line 603
    .line 604
    new-instance v4, Lb7/e4;

    .line 605
    .line 606
    invoke-direct {v4, v1, v2}, Lb7/e4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 607
    .line 608
    .line 609
    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 610
    .line 611
    invoke-virtual {v0}, Lb7/d0;->f()V

    .line 612
    .line 613
    .line 614
    invoke-interface {v3}, Lb7/c0;->T()Z

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    if-eqz v0, :cond_d

    .line 619
    .line 620
    invoke-interface {v3, v4}, Lb7/c0;->R(Lb7/e4;)Lcb/y;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    goto :goto_d

    .line 625
    :cond_d
    new-instance v0, Lb7/i4;

    .line 626
    .line 627
    const/16 v2, -0x64

    .line 628
    .line 629
    invoke-direct {v0, v2}, Lb7/i4;-><init>(I)V

    .line 630
    .line 631
    .line 632
    invoke-static {v0}, Lg8/a;->Q(Ljava/lang/Object;)Lcb/v;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    :goto_d
    new-instance v2, Lapp/nekogram/translator/r;

    .line 637
    .line 638
    const/4 v3, 0x1

    .line 639
    invoke-direct {v2, v3, v1}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 640
    .line 641
    .line 642
    sget-object v1, Lcb/r;->a:Lcb/r;

    .line 643
    .line 644
    new-instance v3, Lcb/t;

    .line 645
    .line 646
    const/4 v4, 0x0

    .line 647
    invoke-direct {v3, v4, v0, v2}, Lcb/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    invoke-interface {v0, v3, v1}, Lcb/y;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 651
    .line 652
    .line 653
    :cond_e
    return-void

    .line 654
    :pswitch_9
    iget-object v0, p0, Lb5/m;->b:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v0, Lb5/q;

    .line 657
    .line 658
    iget-object v1, p0, Lb5/m;->c:Ljava/lang/Object;

    .line 659
    .line 660
    iget-object v2, p0, Lb5/m;->d:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast v2, Ljava/lang/Exception;

    .line 663
    .line 664
    iget v3, v0, Lb5/q;->a:I

    .line 665
    .line 666
    iget-object v0, v0, Lb5/q;->b:Lj5/d0;

    .line 667
    .line 668
    invoke-interface {v1, v3, v0, v2}, Lb5/r;->x(ILj5/d0;Ljava/lang/Exception;)V

    .line 669
    .line 670
    .line 671
    return-void

    .line 672
    nop

    .line 673
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
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
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method

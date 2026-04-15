.class public final La9/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lug/u;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La9/h;->a:I

    iput-object p2, p0, La9/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lug/b;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La9/h;->a:I

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La9/h;->b:Ljava/lang/Object;

    return-void
.end method

.method private final c(Lah/h;)Lug/d0;
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v2, Lah/h;->e:Lb7/b1;

    .line 6
    .line 7
    iget-object v14, v2, Lah/h;->a:Lzg/n;

    .line 8
    .line 9
    sget-object v3, Lvb/r;->a:Lvb/r;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/16 v16, 0x0

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    move-object v15, v0

    .line 16
    move-object/from16 v17, v16

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    const/16 v18, 0x0

    .line 20
    .line 21
    :goto_0
    const-string v6, "request"

    .line 22
    .line 23
    invoke-static {v15, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v6, v14, Lzg/n;->j:Lb5/d0;

    .line 27
    .line 28
    if-nez v6, :cond_c

    .line 29
    .line 30
    monitor-enter v14

    .line 31
    :try_start_0
    iget-boolean v6, v14, Lzg/n;->l:Z

    .line 32
    .line 33
    if-nez v6, :cond_b

    .line 34
    .line 35
    iget-boolean v6, v14, Lzg/n;->k:Z

    .line 36
    .line 37
    if-nez v6, :cond_a

    .line 38
    .line 39
    iget-boolean v6, v14, Lzg/n;->n:Z

    .line 40
    .line 41
    if-nez v6, :cond_a

    .line 42
    .line 43
    iget-boolean v6, v14, Lzg/n;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 44
    .line 45
    if-nez v6, :cond_a

    .line 46
    .line 47
    monitor-exit v14

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    move-object v6, v3

    .line 51
    new-instance v3, Lzg/p;

    .line 52
    .line 53
    iget-object v0, v14, Lzg/n;->a:Lug/x;

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    iget-object v4, v0, Lug/x;->C:Lyg/c;

    .line 57
    .line 58
    const/4 v8, 0x1

    .line 59
    iget-object v5, v14, Lzg/n;->c:Lh9/b;

    .line 60
    .line 61
    move-object v9, v6

    .line 62
    iget v6, v0, Lug/x;->x:I

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    iget v7, v0, Lug/x;->y:I

    .line 66
    .line 67
    const/4 v11, 0x1

    .line 68
    iget v8, v2, Lah/h;->f:I

    .line 69
    .line 70
    move-object v12, v9

    .line 71
    iget v9, v2, Lah/h;->g:I

    .line 72
    .line 73
    const/4 v13, 0x0

    .line 74
    iget-boolean v10, v0, Lug/x;->e:Z

    .line 75
    .line 76
    const/16 v19, 0x1

    .line 77
    .line 78
    iget-boolean v11, v0, Lug/x;->f:Z

    .line 79
    .line 80
    iget-object v13, v15, Lb7/b1;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v13, Lug/t;

    .line 83
    .line 84
    move-object/from16 v20, v3

    .line 85
    .line 86
    const-string v3, "url"

    .line 87
    .line 88
    invoke-static {v13, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v13}, Lug/t;->f()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_1

    .line 96
    .line 97
    iget-object v3, v0, Lug/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 98
    .line 99
    if-eqz v3, :cond_0

    .line 100
    .line 101
    move-object/from16 v21, v3

    .line 102
    .line 103
    iget-object v3, v0, Lug/x;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 104
    .line 105
    move-object/from16 v22, v3

    .line 106
    .line 107
    iget-object v3, v0, Lug/x;->u:Lug/j;

    .line 108
    .line 109
    move-object/from16 v28, v3

    .line 110
    .line 111
    move-object/from16 v26, v21

    .line 112
    .line 113
    move-object/from16 v27, v22

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v2, "CLEARTEXT-only client"

    .line 119
    .line 120
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v0

    .line 124
    :cond_1
    move-object/from16 v26, v16

    .line 125
    .line 126
    move-object/from16 v27, v26

    .line 127
    .line 128
    move-object/from16 v28, v27

    .line 129
    .line 130
    :goto_1
    new-instance v21, Lug/a;

    .line 131
    .line 132
    iget-object v3, v13, Lug/t;->d:Ljava/lang/String;

    .line 133
    .line 134
    iget v13, v13, Lug/t;->e:I

    .line 135
    .line 136
    move-object/from16 v22, v3

    .line 137
    .line 138
    iget-object v3, v0, Lug/x;->l:Lug/p;

    .line 139
    .line 140
    move-object/from16 v24, v3

    .line 141
    .line 142
    iget-object v3, v0, Lug/x;->o:Ljavax/net/SocketFactory;

    .line 143
    .line 144
    move-object/from16 v25, v3

    .line 145
    .line 146
    iget-object v3, v0, Lug/x;->n:Lug/b;

    .line 147
    .line 148
    move-object/from16 v29, v3

    .line 149
    .line 150
    iget-object v3, v0, Lug/x;->s:Ljava/util/List;

    .line 151
    .line 152
    move-object/from16 v30, v3

    .line 153
    .line 154
    iget-object v3, v0, Lug/x;->r:Ljava/util/List;

    .line 155
    .line 156
    iget-object v0, v0, Lug/x;->m:Ljava/net/ProxySelector;

    .line 157
    .line 158
    move-object/from16 v32, v0

    .line 159
    .line 160
    move-object/from16 v31, v3

    .line 161
    .line 162
    move/from16 v23, v13

    .line 163
    .line 164
    invoke-direct/range {v21 .. v32}, Lug/a;-><init>(Ljava/lang/String;ILug/p;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lug/j;Lug/b;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 165
    .line 166
    .line 167
    iget-object v0, v14, Lzg/n;->a:Lug/x;

    .line 168
    .line 169
    iget-object v13, v0, Lug/x;->B:Lxa/h;

    .line 170
    .line 171
    move-object/from16 v33, v12

    .line 172
    .line 173
    move-object/from16 v3, v20

    .line 174
    .line 175
    move-object/from16 v12, v21

    .line 176
    .line 177
    invoke-direct/range {v3 .. v15}, Lzg/p;-><init>(Lyg/c;Lh9/b;IIIIZZLug/a;Lxa/h;Lzg/n;Lb7/b1;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, v14, Lzg/n;->a:Lug/x;

    .line 181
    .line 182
    iget-boolean v4, v0, Lug/x;->f:Z

    .line 183
    .line 184
    if-eqz v4, :cond_2

    .line 185
    .line 186
    new-instance v4, Ly4/i;

    .line 187
    .line 188
    iget-object v0, v0, Lug/x;->C:Lyg/c;

    .line 189
    .line 190
    invoke-direct {v4, v3, v0}, Ly4/i;-><init>(Lzg/p;Lyg/c;)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_2
    new-instance v4, Lxa/h;

    .line 195
    .line 196
    invoke-direct {v4, v3}, Lxa/h;-><init>(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :goto_2
    iput-object v4, v14, Lzg/n;->g:Lzg/h;

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_3
    move-object/from16 v33, v3

    .line 203
    .line 204
    :goto_3
    :try_start_1
    iget-boolean v0, v14, Lzg/n;->p:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    .line 206
    if-nez v0, :cond_9

    .line 207
    .line 208
    :try_start_2
    invoke-virtual {v2, v15}, Lah/h;->b(Lb7/b1;)Lug/d0;

    .line 209
    .line 210
    .line 211
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 212
    :try_start_3
    invoke-virtual {v0}, Lug/d0;->g()Lug/c0;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iput-object v15, v0, Lug/c0;->a:Lb7/b1;

    .line 217
    .line 218
    if-eqz v17, :cond_4

    .line 219
    .line 220
    invoke-static/range {v17 .. v17}, Lud/s;->y(Lug/d0;)Lug/d0;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    goto :goto_4

    .line 225
    :catchall_0
    move-exception v0

    .line 226
    const/4 v8, 0x1

    .line 227
    goto/16 :goto_7

    .line 228
    .line 229
    :cond_4
    move-object/from16 v3, v16

    .line 230
    .line 231
    :goto_4
    iput-object v3, v0, Lug/c0;->k:Lug/d0;

    .line 232
    .line 233
    invoke-virtual {v0}, Lug/c0;->a()Lug/d0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    iget-object v3, v14, Lzg/n;->j:Lb5/d0;

    .line 238
    .line 239
    invoke-virtual {v1, v0, v3}, La9/h;->b(Lug/d0;Lb5/d0;)Lb7/b1;

    .line 240
    .line 241
    .line 242
    move-result-object v15
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 243
    if-nez v15, :cond_5

    .line 244
    .line 245
    const/4 v7, 0x0

    .line 246
    invoke-virtual {v14, v7}, Lzg/n;->g(Z)V

    .line 247
    .line 248
    .line 249
    return-object v0

    .line 250
    :cond_5
    const/4 v7, 0x0

    .line 251
    :try_start_4
    iget-object v3, v0, Lug/d0;->g:Lug/f0;

    .line 252
    .line 253
    invoke-static {v3}, Lwg/e;->b(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 254
    .line 255
    .line 256
    add-int/lit8 v3, v18, 0x1

    .line 257
    .line 258
    const/16 v4, 0x14

    .line 259
    .line 260
    if-gt v3, v4, :cond_6

    .line 261
    .line 262
    const/4 v8, 0x1

    .line 263
    invoke-virtual {v14, v8}, Lzg/n;->g(Z)V

    .line 264
    .line 265
    .line 266
    move-object/from16 v17, v0

    .line 267
    .line 268
    move/from16 v18, v3

    .line 269
    .line 270
    move-object/from16 v3, v33

    .line 271
    .line 272
    const/4 v0, 0x1

    .line 273
    :goto_5
    const/4 v4, 0x0

    .line 274
    const/4 v5, 0x1

    .line 275
    goto/16 :goto_0

    .line 276
    .line 277
    :cond_6
    const/4 v8, 0x1

    .line 278
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    .line 279
    .line 280
    new-instance v2, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 283
    .line 284
    .line 285
    const-string v4, "Too many follow-up requests: "

    .line 286
    .line 287
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v0

    .line 301
    :catchall_1
    move-exception v0

    .line 302
    goto :goto_7

    .line 303
    :catch_0
    move-exception v0

    .line 304
    const/4 v7, 0x0

    .line 305
    const/4 v8, 0x1

    .line 306
    invoke-virtual {v1, v0, v14, v15}, La9/h;->d(Ljava/io/IOException;Lzg/n;Lb7/b1;)Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-nez v3, :cond_8

    .line 311
    .line 312
    sget-object v2, Lwg/e;->a:[B

    .line 313
    .line 314
    const-string v2, "suppressed"

    .line 315
    .line 316
    move-object/from16 v6, v33

    .line 317
    .line 318
    invoke-static {v6, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-eqz v3, :cond_7

    .line 330
    .line 331
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    check-cast v3, Ljava/lang/Exception;

    .line 336
    .line 337
    invoke-static {v0, v3}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_7
    throw v0

    .line 342
    :cond_8
    move-object/from16 v6, v33

    .line 343
    .line 344
    move-object v3, v6

    .line 345
    check-cast v3, Ljava/util/Collection;

    .line 346
    .line 347
    invoke-static {v3, v0}, Lvb/m;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 348
    .line 349
    .line 350
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 351
    invoke-virtual {v14, v8}, Lzg/n;->g(Z)V

    .line 352
    .line 353
    .line 354
    const/4 v0, 0x0

    .line 355
    goto :goto_5

    .line 356
    :cond_9
    const/4 v8, 0x1

    .line 357
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    .line 358
    .line 359
    const-string v2, "Canceled"

    .line 360
    .line 361
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 365
    :goto_7
    invoke-virtual {v14, v8}, Lzg/n;->g(Z)V

    .line 366
    .line 367
    .line 368
    throw v0

    .line 369
    :catchall_2
    move-exception v0

    .line 370
    goto :goto_8

    .line 371
    :cond_a
    :try_start_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 372
    .line 373
    const-string v2, "Check failed."

    .line 374
    .line 375
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    throw v0

    .line 379
    :cond_b
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 380
    .line 381
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 382
    .line 383
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 387
    :goto_8
    monitor-exit v14

    .line 388
    throw v0

    .line 389
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 390
    .line 391
    const-string v2, "Check failed."

    .line 392
    .line 393
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v0
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
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
.end method

.method public static e(Lug/d0;I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lug/d0;->f:Lug/r;

    .line 2
    .line 3
    const-string v0, "Retry-After"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :cond_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    return p1

    .line 15
    :cond_1
    const-string p1, "\\d+"

    .line 16
    .line 17
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "compile(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string p1, "valueOf(...)"

    .line 41
    .line 42
    invoke-static {p0, p1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_2
    const p0, 0x7fffffff

    .line 51
    .line 52
    .line 53
    return p0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public final a(Lah/h;)Lug/d0;
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, La9/h;->a:I

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, La9/h;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lug/f;

    .line 14
    .line 15
    const/16 v8, 0xa

    .line 16
    .line 17
    if-eqz v0, :cond_6

    .line 18
    .line 19
    iget-object v9, v2, Lah/h;->e:Lb7/b1;

    .line 20
    .line 21
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v10, v9, Lb7/b1;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v10, Lug/t;

    .line 27
    .line 28
    invoke-static {v10}, Lud/s;->r(Lug/t;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    :try_start_0
    iget-object v0, v0, Lug/f;->a:Lxg/g;

    .line 33
    .line 34
    invoke-virtual {v0, v11}, Lxg/g;->k(Ljava/lang/String;)Lxg/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    :goto_0
    const/4 v0, 0x0

    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_0
    :try_start_1
    new-instance v11, Lug/d;

    .line 44
    .line 45
    iget-object v12, v0, Lxg/d;->c:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    check-cast v12, Llh/h0;

    .line 52
    .line 53
    invoke-direct {v11, v12}, Lug/d;-><init>(Llh/h0;)V

    .line 54
    .line 55
    .line 56
    iget-object v12, v11, Lug/d;->c:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v13, v11, Lug/d;->b:Lug/r;

    .line 59
    .line 60
    iget-object v14, v11, Lug/d;->a:Lug/t;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    .line 62
    iget-object v15, v11, Lug/d;->g:Lug/r;

    .line 63
    .line 64
    const-string v7, "Content-Type"

    .line 65
    .line 66
    invoke-virtual {v15, v7}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    const-string v3, "Content-Length"

    .line 71
    .line 72
    invoke-virtual {v15, v3}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-instance v4, Lb7/b1;

    .line 77
    .line 78
    const-string v6, "\u0000"

    .line 79
    .line 80
    const-string v5, "url"

    .line 81
    .line 82
    invoke-static {v14, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v5, "headers"

    .line 86
    .line 87
    invoke-static {v13, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v5, "method"

    .line 91
    .line 92
    invoke-static {v12, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v5, Lch/l;

    .line 96
    .line 97
    invoke-direct {v5, v8}, Lch/l;-><init>(I)V

    .line 98
    .line 99
    .line 100
    iput-object v14, v5, Lch/l;->b:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v13}, Lug/r;->j()Lhd/q0;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    iput-object v8, v5, Lch/l;->c:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-virtual {v12, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-nez v6, :cond_1

    .line 113
    .line 114
    move-object v6, v12

    .line 115
    :goto_1
    const/4 v8, 0x0

    .line 116
    goto :goto_2

    .line 117
    :cond_1
    const-string v6, "GET"

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :goto_2
    invoke-virtual {v5, v6, v8}, Lch/l;->y(Ljava/lang/String;Lug/b0;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v4, v5}, Lb7/b1;-><init>(Lch/l;)V

    .line 124
    .line 125
    .line 126
    new-instance v5, Lug/c0;

    .line 127
    .line 128
    invoke-direct {v5}, Lug/c0;-><init>()V

    .line 129
    .line 130
    .line 131
    iput-object v4, v5, Lug/c0;->a:Lb7/b1;

    .line 132
    .line 133
    iget-object v4, v11, Lug/d;->d:Lug/y;

    .line 134
    .line 135
    const-string v6, "protocol"

    .line 136
    .line 137
    invoke-static {v4, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iput-object v4, v5, Lug/c0;->b:Lug/y;

    .line 141
    .line 142
    iget v4, v11, Lug/d;->e:I

    .line 143
    .line 144
    iput v4, v5, Lug/c0;->c:I

    .line 145
    .line 146
    iget-object v4, v11, Lug/d;->f:Ljava/lang/String;

    .line 147
    .line 148
    const-string v6, "message"

    .line 149
    .line 150
    invoke-static {v4, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iput-object v4, v5, Lug/c0;->d:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v5, v15}, Lug/c0;->c(Lug/r;)V

    .line 156
    .line 157
    .line 158
    new-instance v4, Lug/c;

    .line 159
    .line 160
    invoke-direct {v4, v0, v7, v3}, Lug/c;-><init>(Lxg/d;Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iput-object v4, v5, Lug/c0;->g:Lug/f0;

    .line 164
    .line 165
    iget-object v0, v11, Lug/d;->h:Lug/q;

    .line 166
    .line 167
    iput-object v0, v5, Lug/c0;->e:Lug/q;

    .line 168
    .line 169
    iget-wide v3, v11, Lug/d;->i:J

    .line 170
    .line 171
    iput-wide v3, v5, Lug/c0;->l:J

    .line 172
    .line 173
    iget-wide v3, v11, Lug/d;->j:J

    .line 174
    .line 175
    iput-wide v3, v5, Lug/c0;->m:J

    .line 176
    .line 177
    invoke-virtual {v5}, Lug/c0;->a()Lug/d0;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v14, v10}, Lug/t;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_4

    .line 186
    .line 187
    iget-object v3, v9, Lb7/b1;->c:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v3, Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v12, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_4

    .line 196
    .line 197
    iget-object v3, v0, Lug/d0;->f:Lug/r;

    .line 198
    .line 199
    invoke-static {v3}, Lud/s;->D(Lug/r;)Ljava/util/Set;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    check-cast v3, Ljava/lang/Iterable;

    .line 204
    .line 205
    instance-of v4, v3, Ljava/util/Collection;

    .line 206
    .line 207
    if-eqz v4, :cond_2

    .line 208
    .line 209
    move-object v4, v3

    .line 210
    check-cast v4, Ljava/util/Collection;

    .line 211
    .line 212
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_2

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-eqz v4, :cond_5

    .line 228
    .line 229
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    check-cast v4, Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v13, v4}, Lug/r;->l(Ljava/lang/String;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    iget-object v6, v9, Lb7/b1;->d:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v6, Lug/r;

    .line 242
    .line 243
    invoke-virtual {v6, v4}, Lug/r;->l(Ljava/lang/String;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-nez v4, :cond_3

    .line 252
    .line 253
    :cond_4
    iget-object v0, v0, Lug/d0;->g:Lug/f0;

    .line 254
    .line 255
    invoke-static {v0}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :catch_0
    invoke-static {v0}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :catch_1
    nop

    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :cond_5
    :goto_3
    move-object v8, v0

    .line 269
    goto :goto_4

    .line 270
    :cond_6
    const/4 v8, 0x0

    .line 271
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 272
    .line 273
    .line 274
    move-result-wide v3

    .line 275
    iget-object v0, v2, Lah/h;->e:Lb7/b1;

    .line 276
    .line 277
    const-string v5, "request"

    .line 278
    .line 279
    invoke-static {v0, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    if-eqz v8, :cond_d

    .line 283
    .line 284
    iget-wide v9, v8, Lug/d0;->l:J

    .line 285
    .line 286
    iget-wide v11, v8, Lug/d0;->m:J

    .line 287
    .line 288
    iget-object v13, v8, Lug/d0;->f:Lug/r;

    .line 289
    .line 290
    invoke-virtual {v13}, Lug/r;->size()I

    .line 291
    .line 292
    .line 293
    move-result v14

    .line 294
    const/4 v15, 0x0

    .line 295
    const/16 v21, 0x0

    .line 296
    .line 297
    const/16 v22, 0x0

    .line 298
    .line 299
    const/16 v23, 0x0

    .line 300
    .line 301
    const/16 v24, 0x0

    .line 302
    .line 303
    const/16 v25, 0x0

    .line 304
    .line 305
    const/16 v26, 0x0

    .line 306
    .line 307
    const/16 v27, -0x1

    .line 308
    .line 309
    :goto_5
    if-ge v15, v14, :cond_c

    .line 310
    .line 311
    invoke-virtual {v13, v15}, Lug/r;->i(I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    invoke-virtual {v13, v15}, Lug/r;->k(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    const-string v5, "Date"

    .line 320
    .line 321
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-eqz v5, :cond_7

    .line 326
    .line 327
    invoke-static {v7}, Lah/d;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    move-object/from16 v23, v5

    .line 332
    .line 333
    move-object/from16 v26, v7

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_7
    const-string v5, "Expires"

    .line 337
    .line 338
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    if-eqz v5, :cond_8

    .line 343
    .line 344
    invoke-static {v7}, Lah/d;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    move-object/from16 v21, v5

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_8
    const-string v5, "Last-Modified"

    .line 352
    .line 353
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    if-eqz v5, :cond_9

    .line 358
    .line 359
    invoke-static {v7}, Lah/d;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    move-object/from16 v22, v5

    .line 364
    .line 365
    move-object/from16 v25, v7

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_9
    const-string v5, "ETag"

    .line 369
    .line 370
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    if-eqz v5, :cond_a

    .line 375
    .line 376
    move-object/from16 v24, v7

    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_a
    const-string v5, "Age"

    .line 380
    .line 381
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    if-eqz v5, :cond_b

    .line 386
    .line 387
    const/4 v5, -0x1

    .line 388
    invoke-static {v5, v7}, Lwg/e;->o(ILjava/lang/String;)I

    .line 389
    .line 390
    .line 391
    move-result v27

    .line 392
    :cond_b
    :goto_6
    add-int/lit8 v15, v15, 0x1

    .line 393
    .line 394
    goto :goto_5

    .line 395
    :cond_c
    move/from16 v5, v27

    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_d
    const/4 v5, -0x1

    .line 399
    const-wide/16 v9, 0x0

    .line 400
    .line 401
    const-wide/16 v11, 0x0

    .line 402
    .line 403
    const/16 v21, 0x0

    .line 404
    .line 405
    const/16 v22, 0x0

    .line 406
    .line 407
    const/16 v23, 0x0

    .line 408
    .line 409
    const/16 v24, 0x0

    .line 410
    .line 411
    const/16 v25, 0x0

    .line 412
    .line 413
    const/16 v26, 0x0

    .line 414
    .line 415
    :goto_7
    const-string v6, "If-None-Match"

    .line 416
    .line 417
    const-string v7, "If-Modified-Since"

    .line 418
    .line 419
    const/16 v13, 0xc

    .line 420
    .line 421
    if-nez v8, :cond_e

    .line 422
    .line 423
    new-instance v3, Lv2/e;

    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    invoke-direct {v3, v13, v0, v14}, Lv2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    :goto_8
    const/16 v5, 0xc

    .line 430
    .line 431
    goto/16 :goto_15

    .line 432
    .line 433
    :cond_e
    const/4 v14, 0x0

    .line 434
    iget-object v15, v0, Lb7/b1;->b:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v15, Lug/t;

    .line 437
    .line 438
    invoke-virtual {v15}, Lug/t;->f()Z

    .line 439
    .line 440
    .line 441
    move-result v15

    .line 442
    if-eqz v15, :cond_f

    .line 443
    .line 444
    iget-object v15, v8, Lug/d0;->e:Lug/q;

    .line 445
    .line 446
    if-nez v15, :cond_f

    .line 447
    .line 448
    new-instance v3, Lv2/e;

    .line 449
    .line 450
    invoke-direct {v3, v13, v0, v14}, Lv2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_f
    invoke-static {v8, v0}, Lvb/w;->s(Lug/d0;Lb7/b1;)Z

    .line 455
    .line 456
    .line 457
    move-result v15

    .line 458
    if-nez v15, :cond_10

    .line 459
    .line 460
    new-instance v3, Lv2/e;

    .line 461
    .line 462
    invoke-direct {v3, v13, v0, v14}, Lv2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_10
    invoke-virtual {v0}, Lb7/b1;->p()Lug/g;

    .line 467
    .line 468
    .line 469
    move-result-object v14

    .line 470
    iget-boolean v15, v14, Lug/g;->a:Z

    .line 471
    .line 472
    if-nez v15, :cond_25

    .line 473
    .line 474
    iget-object v15, v0, Lb7/b1;->d:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v15, Lug/r;

    .line 477
    .line 478
    invoke-virtual {v15, v7}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v15

    .line 482
    if-nez v15, :cond_25

    .line 483
    .line 484
    iget-object v15, v0, Lb7/b1;->d:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v15, Lug/r;

    .line 487
    .line 488
    invoke-virtual {v15, v6}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v15

    .line 492
    if-eqz v15, :cond_11

    .line 493
    .line 494
    goto/16 :goto_14

    .line 495
    .line 496
    :cond_11
    invoke-virtual {v8}, Lug/d0;->b()Lug/g;

    .line 497
    .line 498
    .line 499
    move-result-object v15

    .line 500
    if-eqz v23, :cond_12

    .line 501
    .line 502
    invoke-virtual/range {v23 .. v23}, Ljava/util/Date;->getTime()J

    .line 503
    .line 504
    .line 505
    move-result-wide v31

    .line 506
    move-object/from16 v33, v14

    .line 507
    .line 508
    sub-long v13, v11, v31

    .line 509
    .line 510
    move-wide/from16 v31, v3

    .line 511
    .line 512
    const-wide/16 v3, 0x0

    .line 513
    .line 514
    invoke-static {v3, v4, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 515
    .line 516
    .line 517
    move-result-wide v28

    .line 518
    move-wide/from16 v13, v28

    .line 519
    .line 520
    :goto_9
    const/4 v3, -0x1

    .line 521
    goto :goto_a

    .line 522
    :cond_12
    move-wide/from16 v31, v3

    .line 523
    .line 524
    move-object/from16 v33, v14

    .line 525
    .line 526
    const-wide/16 v3, 0x0

    .line 527
    .line 528
    move-wide v13, v3

    .line 529
    goto :goto_9

    .line 530
    :goto_a
    if-eq v5, v3, :cond_13

    .line 531
    .line 532
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 533
    .line 534
    int-to-long v4, v5

    .line 535
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 536
    .line 537
    .line 538
    move-result-wide v3

    .line 539
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 540
    .line 541
    .line 542
    move-result-wide v13

    .line 543
    :cond_13
    sub-long v3, v11, v9

    .line 544
    .line 545
    move-object/from16 v34, v6

    .line 546
    .line 547
    const-wide/16 v5, 0x0

    .line 548
    .line 549
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 550
    .line 551
    .line 552
    move-result-wide v3

    .line 553
    move-wide/from16 v35, v3

    .line 554
    .line 555
    sub-long v3, v31, v11

    .line 556
    .line 557
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 558
    .line 559
    .line 560
    move-result-wide v3

    .line 561
    add-long v13, v13, v35

    .line 562
    .line 563
    add-long/2addr v13, v3

    .line 564
    invoke-virtual {v8}, Lug/d0;->b()Lug/g;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    iget v3, v3, Lug/g;->c:I

    .line 569
    .line 570
    const/4 v5, -0x1

    .line 571
    if-eq v3, v5, :cond_14

    .line 572
    .line 573
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 574
    .line 575
    int-to-long v5, v3

    .line 576
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 577
    .line 578
    .line 579
    move-result-wide v3

    .line 580
    :goto_b
    move-object/from16 v5, v33

    .line 581
    .line 582
    :goto_c
    const-wide/16 v28, 0x0

    .line 583
    .line 584
    goto :goto_10

    .line 585
    :cond_14
    if-eqz v21, :cond_17

    .line 586
    .line 587
    if-eqz v23, :cond_15

    .line 588
    .line 589
    invoke-virtual/range {v23 .. v23}, Ljava/util/Date;->getTime()J

    .line 590
    .line 591
    .line 592
    move-result-wide v11

    .line 593
    :cond_15
    invoke-virtual/range {v21 .. v21}, Ljava/util/Date;->getTime()J

    .line 594
    .line 595
    .line 596
    move-result-wide v3

    .line 597
    sub-long/2addr v3, v11

    .line 598
    const-wide/16 v28, 0x0

    .line 599
    .line 600
    cmp-long v5, v3, v28

    .line 601
    .line 602
    if-lez v5, :cond_16

    .line 603
    .line 604
    goto :goto_b

    .line 605
    :cond_16
    move-object/from16 v5, v33

    .line 606
    .line 607
    const-wide/16 v3, 0x0

    .line 608
    .line 609
    goto :goto_c

    .line 610
    :cond_17
    if-eqz v22, :cond_1b

    .line 611
    .line 612
    iget-object v3, v8, Lug/d0;->a:Lb7/b1;

    .line 613
    .line 614
    iget-object v3, v3, Lb7/b1;->b:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v3, Lug/t;

    .line 617
    .line 618
    iget-object v3, v3, Lug/t;->f:Ljava/util/List;

    .line 619
    .line 620
    if-nez v3, :cond_18

    .line 621
    .line 622
    const/4 v3, 0x0

    .line 623
    goto :goto_d

    .line 624
    :cond_18
    new-instance v4, Ljava/lang/StringBuilder;

    .line 625
    .line 626
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 627
    .line 628
    .line 629
    invoke-static {v4, v3}, Lug/b;->c(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    :goto_d
    if-nez v3, :cond_1b

    .line 637
    .line 638
    if-eqz v23, :cond_19

    .line 639
    .line 640
    invoke-virtual/range {v23 .. v23}, Ljava/util/Date;->getTime()J

    .line 641
    .line 642
    .line 643
    move-result-wide v9

    .line 644
    :cond_19
    invoke-virtual/range {v22 .. v22}, Ljava/util/Date;->getTime()J

    .line 645
    .line 646
    .line 647
    move-result-wide v3

    .line 648
    sub-long/2addr v9, v3

    .line 649
    const-wide/16 v28, 0x0

    .line 650
    .line 651
    cmp-long v3, v9, v28

    .line 652
    .line 653
    if-lez v3, :cond_1a

    .line 654
    .line 655
    const/16 v3, 0xa

    .line 656
    .line 657
    int-to-long v3, v3

    .line 658
    div-long v3, v9, v3

    .line 659
    .line 660
    :goto_e
    move-object/from16 v5, v33

    .line 661
    .line 662
    goto :goto_10

    .line 663
    :cond_1a
    :goto_f
    move-wide/from16 v3, v28

    .line 664
    .line 665
    goto :goto_e

    .line 666
    :cond_1b
    const-wide/16 v28, 0x0

    .line 667
    .line 668
    goto :goto_f

    .line 669
    :goto_10
    iget v6, v5, Lug/g;->c:I

    .line 670
    .line 671
    const/4 v9, -0x1

    .line 672
    if-eq v6, v9, :cond_1c

    .line 673
    .line 674
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 675
    .line 676
    int-to-long v11, v6

    .line 677
    invoke-virtual {v10, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 678
    .line 679
    .line 680
    move-result-wide v10

    .line 681
    invoke-static {v3, v4, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 682
    .line 683
    .line 684
    move-result-wide v3

    .line 685
    :cond_1c
    iget v6, v5, Lug/g;->i:I

    .line 686
    .line 687
    if-eq v6, v9, :cond_1d

    .line 688
    .line 689
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 690
    .line 691
    int-to-long v11, v6

    .line 692
    invoke-virtual {v10, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 693
    .line 694
    .line 695
    move-result-wide v10

    .line 696
    goto :goto_11

    .line 697
    :cond_1d
    move-wide/from16 v10, v28

    .line 698
    .line 699
    :goto_11
    iget-boolean v6, v15, Lug/g;->g:Z

    .line 700
    .line 701
    if-nez v6, :cond_1e

    .line 702
    .line 703
    iget v5, v5, Lug/g;->h:I

    .line 704
    .line 705
    if-eq v5, v9, :cond_1e

    .line 706
    .line 707
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 708
    .line 709
    move-wide/from16 v31, v3

    .line 710
    .line 711
    int-to-long v3, v5

    .line 712
    invoke-virtual {v6, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 713
    .line 714
    .line 715
    move-result-wide v3

    .line 716
    goto :goto_12

    .line 717
    :cond_1e
    move-wide/from16 v31, v3

    .line 718
    .line 719
    move-wide/from16 v3, v28

    .line 720
    .line 721
    :goto_12
    iget-boolean v5, v15, Lug/g;->a:Z

    .line 722
    .line 723
    if-nez v5, :cond_21

    .line 724
    .line 725
    add-long/2addr v10, v13

    .line 726
    add-long v3, v31, v3

    .line 727
    .line 728
    cmp-long v5, v10, v3

    .line 729
    .line 730
    if-gez v5, :cond_21

    .line 731
    .line 732
    invoke-virtual {v8}, Lug/d0;->g()Lug/c0;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    cmp-long v4, v10, v31

    .line 737
    .line 738
    if-ltz v4, :cond_1f

    .line 739
    .line 740
    const-string v4, "110 HttpURLConnection \"Response is stale\""

    .line 741
    .line 742
    const-string v5, "Warning"

    .line 743
    .line 744
    iget-object v6, v3, Lug/c0;->f:Lhd/q0;

    .line 745
    .line 746
    invoke-virtual {v6, v5, v4}, Lhd/q0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    :cond_1f
    const-wide/32 v4, 0x5265c00

    .line 750
    .line 751
    .line 752
    cmp-long v6, v13, v4

    .line 753
    .line 754
    if-lez v6, :cond_20

    .line 755
    .line 756
    invoke-virtual {v8}, Lug/d0;->b()Lug/g;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    iget v4, v4, Lug/g;->c:I

    .line 761
    .line 762
    const/4 v5, -0x1

    .line 763
    if-ne v4, v5, :cond_20

    .line 764
    .line 765
    if-nez v21, :cond_20

    .line 766
    .line 767
    const-string v4, "113 HttpURLConnection \"Heuristic expiration\""

    .line 768
    .line 769
    const-string v5, "Warning"

    .line 770
    .line 771
    iget-object v6, v3, Lug/c0;->f:Lhd/q0;

    .line 772
    .line 773
    invoke-virtual {v6, v5, v4}, Lhd/q0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    :cond_20
    new-instance v4, Lv2/e;

    .line 777
    .line 778
    invoke-virtual {v3}, Lug/c0;->a()Lug/d0;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    const/16 v5, 0xc

    .line 783
    .line 784
    const/4 v14, 0x0

    .line 785
    invoke-direct {v4, v5, v14, v3}, Lv2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    move-object v3, v4

    .line 789
    goto :goto_15

    .line 790
    :cond_21
    if-eqz v24, :cond_22

    .line 791
    .line 792
    move-object/from16 v3, v24

    .line 793
    .line 794
    move-object/from16 v6, v34

    .line 795
    .line 796
    goto :goto_13

    .line 797
    :cond_22
    if-eqz v22, :cond_23

    .line 798
    .line 799
    move-object v6, v7

    .line 800
    move-object/from16 v3, v25

    .line 801
    .line 802
    goto :goto_13

    .line 803
    :cond_23
    if-eqz v23, :cond_24

    .line 804
    .line 805
    move-object v6, v7

    .line 806
    move-object/from16 v3, v26

    .line 807
    .line 808
    :goto_13
    iget-object v4, v0, Lb7/b1;->d:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v4, Lug/r;

    .line 811
    .line 812
    invoke-virtual {v4}, Lug/r;->j()Lhd/q0;

    .line 813
    .line 814
    .line 815
    move-result-object v4

    .line 816
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    invoke-static {v4, v6, v3}, Lua/j;->h(Lhd/q0;Ljava/lang/String;Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0}, Lb7/b1;->I()Lch/l;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    invoke-virtual {v4}, Lhd/q0;->k()Lug/r;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    invoke-virtual {v4}, Lug/r;->j()Lhd/q0;

    .line 831
    .line 832
    .line 833
    move-result-object v4

    .line 834
    iput-object v4, v3, Lch/l;->c:Ljava/lang/Object;

    .line 835
    .line 836
    new-instance v4, Lb7/b1;

    .line 837
    .line 838
    invoke-direct {v4, v3}, Lb7/b1;-><init>(Lch/l;)V

    .line 839
    .line 840
    .line 841
    new-instance v3, Lv2/e;

    .line 842
    .line 843
    const/16 v5, 0xc

    .line 844
    .line 845
    invoke-direct {v3, v5, v4, v8}, Lv2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    const/4 v14, 0x0

    .line 849
    goto :goto_15

    .line 850
    :cond_24
    const/16 v5, 0xc

    .line 851
    .line 852
    new-instance v3, Lv2/e;

    .line 853
    .line 854
    const/4 v14, 0x0

    .line 855
    invoke-direct {v3, v5, v0, v14}, Lv2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    goto :goto_15

    .line 859
    :cond_25
    :goto_14
    const/16 v5, 0xc

    .line 860
    .line 861
    const/4 v14, 0x0

    .line 862
    new-instance v3, Lv2/e;

    .line 863
    .line 864
    invoke-direct {v3, v5, v0, v14}, Lv2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    :goto_15
    iget-object v4, v3, Lv2/e;->b:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast v4, Lb7/b1;

    .line 870
    .line 871
    if-eqz v4, :cond_26

    .line 872
    .line 873
    invoke-virtual {v0}, Lb7/b1;->p()Lug/g;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    iget-boolean v0, v0, Lug/g;->j:Z

    .line 878
    .line 879
    if-eqz v0, :cond_26

    .line 880
    .line 881
    new-instance v3, Lv2/e;

    .line 882
    .line 883
    invoke-direct {v3, v5, v14, v14}, Lv2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    :cond_26
    iget-object v0, v3, Lv2/e;->b:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast v0, Lb7/b1;

    .line 889
    .line 890
    iget-object v3, v3, Lv2/e;->c:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v3, Lug/d0;

    .line 893
    .line 894
    iget-object v4, v1, La9/h;->b:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v4, Lug/f;

    .line 897
    .line 898
    if-eqz v4, :cond_27

    .line 899
    .line 900
    monitor-enter v4

    .line 901
    monitor-exit v4

    .line 902
    :cond_27
    if-eqz v8, :cond_28

    .line 903
    .line 904
    if-nez v3, :cond_28

    .line 905
    .line 906
    iget-object v4, v8, Lug/d0;->g:Lug/f0;

    .line 907
    .line 908
    invoke-static {v4}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 909
    .line 910
    .line 911
    :cond_28
    if-nez v0, :cond_29

    .line 912
    .line 913
    if-nez v3, :cond_29

    .line 914
    .line 915
    sget-object v26, Lug/f0;->a:Lug/e0;

    .line 916
    .line 917
    sget-object v36, Lug/i0;->b:Lug/b;

    .line 918
    .line 919
    new-instance v0, Ljava/util/ArrayList;

    .line 920
    .line 921
    const/16 v3, 0x14

    .line 922
    .line 923
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 924
    .line 925
    .line 926
    iget-object v2, v2, Lah/h;->e:Lb7/b1;

    .line 927
    .line 928
    const-string v3, "request"

    .line 929
    .line 930
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    sget-object v21, Lug/y;->d:Lug/y;

    .line 934
    .line 935
    const-string v22, "Unsatisfiable Request (only-if-cached)"

    .line 936
    .line 937
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 938
    .line 939
    .line 940
    move-result-wide v33

    .line 941
    new-instance v3, Lug/r;

    .line 942
    .line 943
    const/4 v4, 0x0

    .line 944
    new-array v4, v4, [Ljava/lang/String;

    .line 945
    .line 946
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    check-cast v0, [Ljava/lang/String;

    .line 951
    .line 952
    invoke-direct {v3, v0}, Lug/r;-><init>([Ljava/lang/String;)V

    .line 953
    .line 954
    .line 955
    new-instance v19, Lug/d0;

    .line 956
    .line 957
    const/16 v23, 0x1f8

    .line 958
    .line 959
    const/16 v24, 0x0

    .line 960
    .line 961
    const/16 v27, 0x0

    .line 962
    .line 963
    const/16 v28, 0x0

    .line 964
    .line 965
    const/16 v29, 0x0

    .line 966
    .line 967
    const/16 v30, 0x0

    .line 968
    .line 969
    const-wide/16 v31, -0x1

    .line 970
    .line 971
    const/16 v35, 0x0

    .line 972
    .line 973
    move-object/from16 v20, v2

    .line 974
    .line 975
    move-object/from16 v25, v3

    .line 976
    .line 977
    invoke-direct/range {v19 .. v36}, Lug/d0;-><init>(Lb7/b1;Lug/y;Ljava/lang/String;ILug/q;Lug/r;Lug/f0;Llh/g0;Lug/d0;Lug/d0;Lug/d0;JJLb5/d0;Lug/i0;)V

    .line 978
    .line 979
    .line 980
    goto/16 :goto_24

    .line 981
    .line 982
    :cond_29
    if-nez v0, :cond_2a

    .line 983
    .line 984
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v3}, Lug/d0;->g()Lug/c0;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    invoke-static {v3}, Lud/s;->y(Lug/d0;)Lug/d0;

    .line 992
    .line 993
    .line 994
    move-result-object v2

    .line 995
    const-string v3, "cacheResponse"

    .line 996
    .line 997
    invoke-static {v3, v2}, Lug/c0;->b(Ljava/lang/String;Lug/d0;)V

    .line 998
    .line 999
    .line 1000
    iput-object v2, v0, Lug/c0;->j:Lug/d0;

    .line 1001
    .line 1002
    invoke-virtual {v0}, Lug/c0;->a()Lug/d0;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v19

    .line 1006
    goto/16 :goto_24

    .line 1007
    .line 1008
    :cond_2a
    :try_start_2
    invoke-virtual {v2, v0}, Lah/h;->b(Lb7/b1;)Lug/d0;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1012
    if-eqz v3, :cond_36

    .line 1013
    .line 1014
    iget v4, v2, Lug/d0;->d:I

    .line 1015
    .line 1016
    const/16 v5, 0x130

    .line 1017
    .line 1018
    if-ne v4, v5, :cond_35

    .line 1019
    .line 1020
    invoke-virtual {v3}, Lug/d0;->g()Lug/c0;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    iget-object v4, v3, Lug/d0;->f:Lug/r;

    .line 1025
    .line 1026
    iget-object v5, v2, Lug/d0;->f:Lug/r;

    .line 1027
    .line 1028
    new-instance v6, Lhd/q0;

    .line 1029
    .line 1030
    const/4 v7, 0x5

    .line 1031
    const/4 v8, 0x0

    .line 1032
    invoke-direct {v6, v8, v7}, Lhd/q0;-><init>(BI)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v4}, Lug/r;->size()I

    .line 1036
    .line 1037
    .line 1038
    move-result v7

    .line 1039
    const/4 v9, 0x0

    .line 1040
    :goto_16
    if-ge v9, v7, :cond_2f

    .line 1041
    .line 1042
    invoke-virtual {v4, v9}, Lug/r;->i(I)Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v10

    .line 1046
    invoke-virtual {v4, v9}, Lug/r;->k(I)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v11

    .line 1050
    const-string v12, "Warning"

    .line 1051
    .line 1052
    invoke-virtual {v12, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v12

    .line 1056
    if-eqz v12, :cond_2b

    .line 1057
    .line 1058
    const-string v12, "1"

    .line 1059
    .line 1060
    invoke-static {v11, v12, v8}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1061
    .line 1062
    .line 1063
    move-result v12

    .line 1064
    if-eqz v12, :cond_2b

    .line 1065
    .line 1066
    goto :goto_18

    .line 1067
    :cond_2b
    const-string v8, "Content-Length"

    .line 1068
    .line 1069
    invoke-virtual {v8, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v8

    .line 1073
    if-nez v8, :cond_2d

    .line 1074
    .line 1075
    const-string v8, "Content-Encoding"

    .line 1076
    .line 1077
    invoke-virtual {v8, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v8

    .line 1081
    if-nez v8, :cond_2d

    .line 1082
    .line 1083
    const-string v8, "Content-Type"

    .line 1084
    .line 1085
    invoke-virtual {v8, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v8

    .line 1089
    if-eqz v8, :cond_2c

    .line 1090
    .line 1091
    goto :goto_17

    .line 1092
    :cond_2c
    invoke-static {v10}, Lud/b;->t(Ljava/lang/String;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v8

    .line 1096
    if-eqz v8, :cond_2d

    .line 1097
    .line 1098
    invoke-virtual {v5, v10}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v8

    .line 1102
    if-nez v8, :cond_2e

    .line 1103
    .line 1104
    :cond_2d
    :goto_17
    invoke-static {v6, v10, v11}, Lua/j;->h(Lhd/q0;Ljava/lang/String;Ljava/lang/String;)V

    .line 1105
    .line 1106
    .line 1107
    :cond_2e
    :goto_18
    add-int/lit8 v9, v9, 0x1

    .line 1108
    .line 1109
    const/4 v8, 0x0

    .line 1110
    goto :goto_16

    .line 1111
    :cond_2f
    invoke-virtual {v5}, Lug/r;->size()I

    .line 1112
    .line 1113
    .line 1114
    move-result v4

    .line 1115
    const/4 v7, 0x0

    .line 1116
    :goto_19
    if-ge v7, v4, :cond_32

    .line 1117
    .line 1118
    invoke-virtual {v5, v7}, Lug/r;->i(I)Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v8

    .line 1122
    const-string v9, "Content-Length"

    .line 1123
    .line 1124
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v9

    .line 1128
    if-nez v9, :cond_31

    .line 1129
    .line 1130
    const-string v9, "Content-Encoding"

    .line 1131
    .line 1132
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v9

    .line 1136
    if-nez v9, :cond_31

    .line 1137
    .line 1138
    const-string v9, "Content-Type"

    .line 1139
    .line 1140
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v9

    .line 1144
    if-eqz v9, :cond_30

    .line 1145
    .line 1146
    goto :goto_1a

    .line 1147
    :cond_30
    invoke-static {v8}, Lud/b;->t(Ljava/lang/String;)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v9

    .line 1151
    if-eqz v9, :cond_31

    .line 1152
    .line 1153
    invoke-virtual {v5, v7}, Lug/r;->k(I)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v9

    .line 1157
    invoke-static {v6, v8, v9}, Lua/j;->h(Lhd/q0;Ljava/lang/String;Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    :cond_31
    :goto_1a
    add-int/lit8 v7, v7, 0x1

    .line 1161
    .line 1162
    goto :goto_19

    .line 1163
    :cond_32
    invoke-virtual {v6}, Lhd/q0;->k()Lug/r;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v4

    .line 1167
    invoke-virtual {v0, v4}, Lug/c0;->c(Lug/r;)V

    .line 1168
    .line 1169
    .line 1170
    iget-wide v4, v2, Lug/d0;->l:J

    .line 1171
    .line 1172
    iput-wide v4, v0, Lug/c0;->l:J

    .line 1173
    .line 1174
    iget-wide v4, v2, Lug/d0;->m:J

    .line 1175
    .line 1176
    iput-wide v4, v0, Lug/c0;->m:J

    .line 1177
    .line 1178
    invoke-static {v3}, Lud/s;->y(Lug/d0;)Lug/d0;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v4

    .line 1182
    const-string v5, "cacheResponse"

    .line 1183
    .line 1184
    invoke-static {v5, v4}, Lug/c0;->b(Ljava/lang/String;Lug/d0;)V

    .line 1185
    .line 1186
    .line 1187
    iput-object v4, v0, Lug/c0;->j:Lug/d0;

    .line 1188
    .line 1189
    invoke-static {v2}, Lud/s;->y(Lug/d0;)Lug/d0;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v4

    .line 1193
    const-string v5, "networkResponse"

    .line 1194
    .line 1195
    invoke-static {v5, v4}, Lug/c0;->b(Ljava/lang/String;Lug/d0;)V

    .line 1196
    .line 1197
    .line 1198
    iput-object v4, v0, Lug/c0;->i:Lug/d0;

    .line 1199
    .line 1200
    invoke-virtual {v0}, Lug/c0;->a()Lug/d0;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    iget-object v2, v2, Lug/d0;->g:Lug/f0;

    .line 1205
    .line 1206
    invoke-virtual {v2}, Lug/f0;->close()V

    .line 1207
    .line 1208
    .line 1209
    iget-object v2, v1, La9/h;->b:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v2, Lug/f;

    .line 1212
    .line 1213
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v2}, Lug/f;->g()V

    .line 1217
    .line 1218
    .line 1219
    iget-object v2, v1, La9/h;->b:Ljava/lang/Object;

    .line 1220
    .line 1221
    check-cast v2, Lug/f;

    .line 1222
    .line 1223
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1224
    .line 1225
    .line 1226
    new-instance v2, Lug/d;

    .line 1227
    .line 1228
    invoke-direct {v2, v0}, Lug/d;-><init>(Lug/d0;)V

    .line 1229
    .line 1230
    .line 1231
    iget-object v3, v3, Lug/d0;->g:Lug/f0;

    .line 1232
    .line 1233
    const-string v4, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"

    .line 1234
    .line 1235
    invoke-static {v3, v4}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    check-cast v3, Lug/c;

    .line 1239
    .line 1240
    iget-object v3, v3, Lug/c;->b:Lxg/d;

    .line 1241
    .line 1242
    :try_start_3
    iget-object v4, v3, Lxg/d;->d:Lxg/g;

    .line 1243
    .line 1244
    iget-object v5, v3, Lxg/d;->a:Ljava/lang/String;

    .line 1245
    .line 1246
    iget-wide v6, v3, Lxg/d;->b:J

    .line 1247
    .line 1248
    invoke-virtual {v4, v6, v7, v5}, Lxg/g;->i(JLjava/lang/String;)Lb5/d0;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1252
    if-nez v5, :cond_33

    .line 1253
    .line 1254
    goto :goto_1c

    .line 1255
    :cond_33
    :try_start_4
    invoke-virtual {v2, v5}, Lug/d;->c(Lb5/d0;)V

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v5}, Lb5/d0;->e()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 1259
    .line 1260
    .line 1261
    goto :goto_1c

    .line 1262
    :catch_2
    nop

    .line 1263
    goto :goto_1b

    .line 1264
    :catch_3
    nop

    .line 1265
    move-object v5, v14

    .line 1266
    :goto_1b
    if-eqz v5, :cond_34

    .line 1267
    .line 1268
    :try_start_5
    invoke-virtual {v5}, Lb5/d0;->b()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 1269
    .line 1270
    .line 1271
    :catch_4
    :cond_34
    :goto_1c
    move-object/from16 v19, v0

    .line 1272
    .line 1273
    goto/16 :goto_24

    .line 1274
    .line 1275
    :cond_35
    iget-object v4, v3, Lug/d0;->g:Lug/f0;

    .line 1276
    .line 1277
    invoke-static {v4}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 1278
    .line 1279
    .line 1280
    :cond_36
    invoke-virtual {v2}, Lug/d0;->g()Lug/c0;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v4

    .line 1284
    if-eqz v3, :cond_37

    .line 1285
    .line 1286
    invoke-static {v3}, Lud/s;->y(Lug/d0;)Lug/d0;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v8

    .line 1290
    goto :goto_1d

    .line 1291
    :cond_37
    move-object v8, v14

    .line 1292
    :goto_1d
    const-string v3, "cacheResponse"

    .line 1293
    .line 1294
    invoke-static {v3, v8}, Lug/c0;->b(Ljava/lang/String;Lug/d0;)V

    .line 1295
    .line 1296
    .line 1297
    iput-object v8, v4, Lug/c0;->j:Lug/d0;

    .line 1298
    .line 1299
    invoke-static {v2}, Lud/s;->y(Lug/d0;)Lug/d0;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v2

    .line 1303
    const-string v3, "networkResponse"

    .line 1304
    .line 1305
    invoke-static {v3, v2}, Lug/c0;->b(Ljava/lang/String;Lug/d0;)V

    .line 1306
    .line 1307
    .line 1308
    iput-object v2, v4, Lug/c0;->i:Lug/d0;

    .line 1309
    .line 1310
    invoke-virtual {v4}, Lug/c0;->a()Lug/d0;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v2

    .line 1314
    iget-object v3, v1, La9/h;->b:Ljava/lang/Object;

    .line 1315
    .line 1316
    check-cast v3, Lug/f;

    .line 1317
    .line 1318
    if-eqz v3, :cond_40

    .line 1319
    .line 1320
    invoke-static {v2}, Lah/g;->a(Lug/d0;)Z

    .line 1321
    .line 1322
    .line 1323
    move-result v3

    .line 1324
    if-eqz v3, :cond_3f

    .line 1325
    .line 1326
    invoke-static {v2, v0}, Lvb/w;->s(Lug/d0;Lb7/b1;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v3

    .line 1330
    if-eqz v3, :cond_3f

    .line 1331
    .line 1332
    iget-object v3, v1, La9/h;->b:Ljava/lang/Object;

    .line 1333
    .line 1334
    check-cast v3, Lug/f;

    .line 1335
    .line 1336
    invoke-virtual {v2}, Lug/d0;->g()Lug/c0;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v4

    .line 1340
    iput-object v0, v4, Lug/c0;->a:Lb7/b1;

    .line 1341
    .line 1342
    invoke-virtual {v4}, Lug/c0;->a()Lug/d0;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1347
    .line 1348
    .line 1349
    iget-object v4, v0, Lug/d0;->a:Lb7/b1;

    .line 1350
    .line 1351
    iget-object v5, v4, Lb7/b1;->c:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast v5, Ljava/lang/String;

    .line 1354
    .line 1355
    invoke-static {v5}, Lgh/g;->D(Ljava/lang/String;)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v6

    .line 1359
    if-eqz v6, :cond_39

    .line 1360
    .line 1361
    :try_start_6
    invoke-virtual {v3, v4}, Lug/f;->b(Lb7/b1;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 1362
    .line 1363
    .line 1364
    goto :goto_1e

    .line 1365
    :catch_5
    nop

    .line 1366
    :cond_38
    :goto_1e
    move-object v8, v14

    .line 1367
    goto :goto_21

    .line 1368
    :cond_39
    const-string v6, "GET"

    .line 1369
    .line 1370
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v5

    .line 1374
    if-nez v5, :cond_3a

    .line 1375
    .line 1376
    goto :goto_1e

    .line 1377
    :cond_3a
    iget-object v5, v0, Lug/d0;->f:Lug/r;

    .line 1378
    .line 1379
    invoke-static {v5}, Lud/s;->D(Lug/r;)Ljava/util/Set;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v5

    .line 1383
    const-string v6, "*"

    .line 1384
    .line 1385
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1386
    .line 1387
    .line 1388
    move-result v5

    .line 1389
    if-eqz v5, :cond_3b

    .line 1390
    .line 1391
    goto :goto_1e

    .line 1392
    :cond_3b
    new-instance v5, Lug/d;

    .line 1393
    .line 1394
    invoke-direct {v5, v0}, Lug/d;-><init>(Lug/d0;)V

    .line 1395
    .line 1396
    .line 1397
    :try_start_7
    iget-object v0, v3, Lug/f;->a:Lxg/g;

    .line 1398
    .line 1399
    iget-object v4, v4, Lb7/b1;->b:Ljava/lang/Object;

    .line 1400
    .line 1401
    check-cast v4, Lug/t;

    .line 1402
    .line 1403
    invoke-static {v4}, Lud/s;->r(Lug/t;)Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v4

    .line 1407
    sget-object v6, Lxg/g;->t:Lef/l;

    .line 1408
    .line 1409
    const-wide/16 v6, -0x1

    .line 1410
    .line 1411
    invoke-virtual {v0, v6, v7, v4}, Lxg/g;->i(JLjava/lang/String;)Lb5/d0;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v8
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1415
    if-nez v8, :cond_3c

    .line 1416
    .line 1417
    goto :goto_1e

    .line 1418
    :cond_3c
    :try_start_8
    invoke-virtual {v5, v8}, Lug/d;->c(Lb5/d0;)V

    .line 1419
    .line 1420
    .line 1421
    new-instance v0, La0/v;

    .line 1422
    .line 1423
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1424
    .line 1425
    .line 1426
    iput-object v3, v0, La0/v;->e:Ljava/lang/Object;

    .line 1427
    .line 1428
    iput-object v8, v0, La0/v;->b:Ljava/lang/Object;

    .line 1429
    .line 1430
    const/4 v4, 0x1

    .line 1431
    invoke-virtual {v8, v4}, Lb5/d0;->o(I)Llh/f0;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v4

    .line 1435
    iput-object v4, v0, La0/v;->c:Ljava/lang/Object;

    .line 1436
    .line 1437
    new-instance v5, Lug/e;

    .line 1438
    .line 1439
    invoke-direct {v5, v3, v0, v4}, Lug/e;-><init>(Lug/f;La0/v;Llh/f0;)V

    .line 1440
    .line 1441
    .line 1442
    iput-object v5, v0, La0/v;->d:Ljava/lang/Object;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 1443
    .line 1444
    move-object v8, v0

    .line 1445
    goto :goto_21

    .line 1446
    :catch_6
    nop

    .line 1447
    goto :goto_20

    .line 1448
    :goto_1f
    move-object v8, v14

    .line 1449
    goto :goto_20

    .line 1450
    :catch_7
    nop

    .line 1451
    goto :goto_1f

    .line 1452
    :goto_20
    if-eqz v8, :cond_38

    .line 1453
    .line 1454
    :try_start_9
    invoke-virtual {v8}, Lb5/d0;->b()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    .line 1455
    .line 1456
    .line 1457
    goto :goto_1e

    .line 1458
    :goto_21
    if-nez v8, :cond_3d

    .line 1459
    .line 1460
    goto :goto_23

    .line 1461
    :cond_3d
    iget-object v0, v8, La0/v;->d:Ljava/lang/Object;

    .line 1462
    .line 1463
    check-cast v0, Lug/e;

    .line 1464
    .line 1465
    iget-object v3, v2, Lug/d0;->g:Lug/f0;

    .line 1466
    .line 1467
    invoke-virtual {v3}, Lug/f0;->k()Llh/h;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v3

    .line 1471
    invoke-static {v0}, Lg8/a;->k(Llh/f0;)Llh/a0;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v0

    .line 1475
    new-instance v4, Lxg/a;

    .line 1476
    .line 1477
    invoke-direct {v4, v3, v8, v0}, Lxg/a;-><init>(Llh/h;La0/v;Llh/a0;)V

    .line 1478
    .line 1479
    .line 1480
    const-string v0, "Content-Type"

    .line 1481
    .line 1482
    iget-object v3, v2, Lug/d0;->f:Lug/r;

    .line 1483
    .line 1484
    invoke-virtual {v3, v0}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v0

    .line 1488
    if-nez v0, :cond_3e

    .line 1489
    .line 1490
    move-object v5, v14

    .line 1491
    goto :goto_22

    .line 1492
    :cond_3e
    move-object v5, v0

    .line 1493
    :goto_22
    iget-object v0, v2, Lug/d0;->g:Lug/f0;

    .line 1494
    .line 1495
    invoke-virtual {v0}, Lug/f0;->g()J

    .line 1496
    .line 1497
    .line 1498
    move-result-wide v6

    .line 1499
    invoke-virtual {v2}, Lug/d0;->g()Lug/c0;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v0

    .line 1503
    new-instance v2, Lah/i;

    .line 1504
    .line 1505
    invoke-static {v4}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v3

    .line 1509
    invoke-direct {v2, v5, v6, v7, v3}, Lah/i;-><init>(Ljava/lang/String;JLlh/b0;)V

    .line 1510
    .line 1511
    .line 1512
    iput-object v2, v0, Lug/c0;->g:Lug/f0;

    .line 1513
    .line 1514
    invoke-virtual {v0}, Lug/c0;->a()Lug/d0;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v0

    .line 1518
    goto/16 :goto_1c

    .line 1519
    .line 1520
    :cond_3f
    iget-object v3, v0, Lb7/b1;->c:Ljava/lang/Object;

    .line 1521
    .line 1522
    check-cast v3, Ljava/lang/String;

    .line 1523
    .line 1524
    invoke-static {v3}, Lgh/g;->D(Ljava/lang/String;)Z

    .line 1525
    .line 1526
    .line 1527
    move-result v3

    .line 1528
    if-eqz v3, :cond_40

    .line 1529
    .line 1530
    :try_start_a
    iget-object v3, v1, La9/h;->b:Ljava/lang/Object;

    .line 1531
    .line 1532
    check-cast v3, Lug/f;

    .line 1533
    .line 1534
    invoke-virtual {v3, v0}, Lug/f;->b(Lb7/b1;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 1535
    .line 1536
    .line 1537
    :catch_8
    :cond_40
    :goto_23
    move-object/from16 v19, v2

    .line 1538
    .line 1539
    :goto_24
    return-object v19

    .line 1540
    :catchall_0
    move-exception v0

    .line 1541
    if-eqz v8, :cond_41

    .line 1542
    .line 1543
    iget-object v2, v8, Lug/d0;->g:Lug/f0;

    .line 1544
    .line 1545
    invoke-static {v2}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 1546
    .line 1547
    .line 1548
    :cond_41
    throw v0

    .line 1549
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La9/h;->c(Lah/h;)Lug/d0;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v0

    .line 1553
    return-object v0

    .line 1554
    :pswitch_1
    const/4 v4, 0x1

    .line 1555
    const/4 v14, 0x0

    .line 1556
    const-string v0, "Content-Encoding"

    .line 1557
    .line 1558
    const-string v3, "User-Agent"

    .line 1559
    .line 1560
    iget-object v5, v1, La9/h;->b:Ljava/lang/Object;

    .line 1561
    .line 1562
    check-cast v5, Lug/b;

    .line 1563
    .line 1564
    const-string v6, "gzip"

    .line 1565
    .line 1566
    const-string v7, "Accept-Encoding"

    .line 1567
    .line 1568
    const-string v8, "Connection"

    .line 1569
    .line 1570
    const-string v9, "Host"

    .line 1571
    .line 1572
    const-string v10, "Transfer-Encoding"

    .line 1573
    .line 1574
    const-string v11, "Content-Type"

    .line 1575
    .line 1576
    const-string v12, "Content-Length"

    .line 1577
    .line 1578
    iget-object v13, v2, Lah/h;->e:Lb7/b1;

    .line 1579
    .line 1580
    invoke-virtual {v13}, Lb7/b1;->I()Lch/l;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v15

    .line 1584
    iget-object v4, v13, Lb7/b1;->d:Ljava/lang/Object;

    .line 1585
    .line 1586
    check-cast v4, Lug/r;

    .line 1587
    .line 1588
    iget-object v14, v13, Lb7/b1;->b:Ljava/lang/Object;

    .line 1589
    .line 1590
    check-cast v14, Lug/t;

    .line 1591
    .line 1592
    iget-object v13, v13, Lb7/b1;->e:Ljava/lang/Object;

    .line 1593
    .line 1594
    check-cast v13, Lug/b0;

    .line 1595
    .line 1596
    if-eqz v13, :cond_44

    .line 1597
    .line 1598
    move-object/from16 v20, v13

    .line 1599
    .line 1600
    invoke-virtual/range {v20 .. v20}, Lug/b0;->b()Lug/v;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v13

    .line 1604
    if-eqz v13, :cond_42

    .line 1605
    .line 1606
    iget-object v13, v13, Lug/v;->a:Ljava/lang/String;

    .line 1607
    .line 1608
    invoke-virtual {v15, v11, v13}, Lch/l;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1609
    .line 1610
    .line 1611
    :cond_42
    invoke-virtual/range {v20 .. v20}, Lug/b0;->a()J

    .line 1612
    .line 1613
    .line 1614
    move-result-wide v20

    .line 1615
    const-wide/16 v17, -0x1

    .line 1616
    .line 1617
    cmp-long v13, v20, v17

    .line 1618
    .line 1619
    if-eqz v13, :cond_43

    .line 1620
    .line 1621
    invoke-static/range {v20 .. v21}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v13

    .line 1625
    invoke-virtual {v15, v12, v13}, Lch/l;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1626
    .line 1627
    .line 1628
    iget-object v13, v15, Lch/l;->c:Ljava/lang/Object;

    .line 1629
    .line 1630
    check-cast v13, Lhd/q0;

    .line 1631
    .line 1632
    invoke-virtual {v13, v10}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 1633
    .line 1634
    .line 1635
    goto :goto_25

    .line 1636
    :cond_43
    const-string v13, "chunked"

    .line 1637
    .line 1638
    invoke-virtual {v15, v10, v13}, Lch/l;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1639
    .line 1640
    .line 1641
    iget-object v10, v15, Lch/l;->c:Ljava/lang/Object;

    .line 1642
    .line 1643
    check-cast v10, Lhd/q0;

    .line 1644
    .line 1645
    invoke-virtual {v10, v12}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 1646
    .line 1647
    .line 1648
    :cond_44
    :goto_25
    invoke-virtual {v4, v9}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v10

    .line 1652
    if-nez v10, :cond_45

    .line 1653
    .line 1654
    const/4 v10, 0x0

    .line 1655
    invoke-static {v14, v10}, Lwg/g;->h(Lug/t;Z)Ljava/lang/String;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v13

    .line 1659
    invoke-virtual {v15, v9, v13}, Lch/l;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1660
    .line 1661
    .line 1662
    goto :goto_26

    .line 1663
    :cond_45
    const/4 v10, 0x0

    .line 1664
    :goto_26
    invoke-virtual {v4, v8}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v9

    .line 1668
    if-nez v9, :cond_46

    .line 1669
    .line 1670
    const-string v9, "Keep-Alive"

    .line 1671
    .line 1672
    invoke-virtual {v15, v8, v9}, Lch/l;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1673
    .line 1674
    .line 1675
    :cond_46
    invoke-virtual {v4, v7}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v8

    .line 1679
    if-nez v8, :cond_47

    .line 1680
    .line 1681
    const-string v8, "Range"

    .line 1682
    .line 1683
    invoke-virtual {v4, v8}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v8

    .line 1687
    if-nez v8, :cond_47

    .line 1688
    .line 1689
    invoke-virtual {v15, v7, v6}, Lch/l;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1690
    .line 1691
    .line 1692
    const/16 v16, 0x1

    .line 1693
    .line 1694
    goto :goto_27

    .line 1695
    :cond_47
    const/16 v16, 0x0

    .line 1696
    .line 1697
    :goto_27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1698
    .line 1699
    .line 1700
    const-string v7, "url"

    .line 1701
    .line 1702
    invoke-static {v14, v7}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1703
    .line 1704
    .line 1705
    invoke-virtual {v4, v3}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v4

    .line 1709
    if-nez v4, :cond_48

    .line 1710
    .line 1711
    const-string v4, "okhttp/5.3.0"

    .line 1712
    .line 1713
    invoke-virtual {v15, v3, v4}, Lch/l;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1714
    .line 1715
    .line 1716
    :cond_48
    new-instance v3, Lb7/b1;

    .line 1717
    .line 1718
    invoke-direct {v3, v15}, Lb7/b1;-><init>(Lch/l;)V

    .line 1719
    .line 1720
    .line 1721
    invoke-virtual {v2, v3}, Lah/h;->b(Lb7/b1;)Lug/d0;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v2

    .line 1725
    iget-object v4, v2, Lug/d0;->f:Lug/r;

    .line 1726
    .line 1727
    iget-object v7, v3, Lb7/b1;->b:Ljava/lang/Object;

    .line 1728
    .line 1729
    check-cast v7, Lug/t;

    .line 1730
    .line 1731
    invoke-static {v5, v7, v4}, Lah/g;->b(Lug/b;Lug/t;Lug/r;)V

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v2}, Lug/d0;->g()Lug/c0;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v5

    .line 1738
    iput-object v3, v5, Lug/c0;->a:Lb7/b1;

    .line 1739
    .line 1740
    if-eqz v16, :cond_4b

    .line 1741
    .line 1742
    invoke-virtual {v4, v0}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v8

    .line 1746
    if-nez v8, :cond_49

    .line 1747
    .line 1748
    const/4 v8, 0x0

    .line 1749
    :cond_49
    invoke-virtual {v6, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1750
    .line 1751
    .line 1752
    move-result v3

    .line 1753
    if-eqz v3, :cond_4b

    .line 1754
    .line 1755
    invoke-static {v2}, Lah/g;->a(Lug/d0;)Z

    .line 1756
    .line 1757
    .line 1758
    move-result v3

    .line 1759
    if-eqz v3, :cond_4b

    .line 1760
    .line 1761
    iget-object v2, v2, Lug/d0;->g:Lug/f0;

    .line 1762
    .line 1763
    if-eqz v2, :cond_4b

    .line 1764
    .line 1765
    new-instance v3, Llh/q;

    .line 1766
    .line 1767
    invoke-virtual {v2}, Lug/f0;->k()Llh/h;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v2

    .line 1771
    invoke-direct {v3, v2}, Llh/q;-><init>(Llh/h;)V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v4}, Lug/r;->j()Lhd/q0;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v2

    .line 1778
    invoke-virtual {v2, v0}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v2, v12}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 1782
    .line 1783
    .line 1784
    invoke-virtual {v2}, Lhd/q0;->k()Lug/r;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v0

    .line 1788
    invoke-virtual {v5, v0}, Lug/c0;->c(Lug/r;)V

    .line 1789
    .line 1790
    .line 1791
    invoke-virtual {v4, v11}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v0

    .line 1795
    if-nez v0, :cond_4a

    .line 1796
    .line 1797
    const/4 v0, 0x0

    .line 1798
    :cond_4a
    new-instance v2, Lah/i;

    .line 1799
    .line 1800
    invoke-static {v3}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v3

    .line 1804
    const-wide/16 v6, -0x1

    .line 1805
    .line 1806
    invoke-direct {v2, v0, v6, v7, v3}, Lah/i;-><init>(Ljava/lang/String;JLlh/b0;)V

    .line 1807
    .line 1808
    .line 1809
    iput-object v2, v5, Lug/c0;->g:Lug/f0;

    .line 1810
    .line 1811
    :cond_4b
    invoke-virtual {v5}, Lug/c0;->a()Lug/d0;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v0

    .line 1815
    return-object v0

    .line 1816
    :pswitch_2
    iget-object v0, v2, Lah/h;->e:Lb7/b1;

    .line 1817
    .line 1818
    invoke-virtual {v2, v0}, Lah/h;->b(Lb7/b1;)Lug/d0;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v0

    .line 1822
    invoke-virtual {v0}, Lug/d0;->g()Lug/c0;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v0

    .line 1826
    const-string v2, "expires"

    .line 1827
    .line 1828
    iget-object v3, v0, Lug/c0;->f:Lhd/q0;

    .line 1829
    .line 1830
    invoke-virtual {v3, v2}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 1831
    .line 1832
    .line 1833
    const-string v2, "Cache-Control"

    .line 1834
    .line 1835
    iget-object v3, v0, Lug/c0;->f:Lhd/q0;

    .line 1836
    .line 1837
    invoke-virtual {v3, v2}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 1838
    .line 1839
    .line 1840
    const-string v3, "access-control-max-age"

    .line 1841
    .line 1842
    iget-object v4, v0, Lug/c0;->f:Lhd/q0;

    .line 1843
    .line 1844
    invoke-virtual {v4, v3}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 1845
    .line 1846
    .line 1847
    iget-object v4, v1, La9/h;->b:Ljava/lang/Object;

    .line 1848
    .line 1849
    check-cast v4, Ljava/lang/String;

    .line 1850
    .line 1851
    const-string v5, "value"

    .line 1852
    .line 1853
    invoke-static {v4, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1854
    .line 1855
    .line 1856
    iget-object v6, v0, Lug/c0;->f:Lhd/q0;

    .line 1857
    .line 1858
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1859
    .line 1860
    .line 1861
    invoke-static {v3}, Lua/j;->n(Ljava/lang/String;)V

    .line 1862
    .line 1863
    .line 1864
    invoke-static {v4, v3}, Lua/j;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 1865
    .line 1866
    .line 1867
    invoke-virtual {v6, v3}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 1868
    .line 1869
    .line 1870
    invoke-static {v6, v3, v4}, Lua/j;->h(Lhd/q0;Ljava/lang/String;Ljava/lang/String;)V

    .line 1871
    .line 1872
    .line 1873
    const-string v3, "max-age="

    .line 1874
    .line 1875
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v3

    .line 1879
    invoke-static {v3, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1880
    .line 1881
    .line 1882
    iget-object v4, v0, Lug/c0;->f:Lhd/q0;

    .line 1883
    .line 1884
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1885
    .line 1886
    .line 1887
    invoke-static {v2}, Lua/j;->n(Ljava/lang/String;)V

    .line 1888
    .line 1889
    .line 1890
    invoke-static {v3, v2}, Lua/j;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 1891
    .line 1892
    .line 1893
    invoke-virtual {v4, v2}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 1894
    .line 1895
    .line 1896
    invoke-static {v4, v2, v3}, Lua/j;->h(Lhd/q0;Ljava/lang/String;Ljava/lang/String;)V

    .line 1897
    .line 1898
    .line 1899
    invoke-virtual {v0}, Lug/c0;->a()Lug/d0;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v0

    .line 1903
    return-object v0

    .line 1904
    :pswitch_3
    iget-object v3, v2, Lah/h;->e:Lb7/b1;

    .line 1905
    .line 1906
    iget-object v0, v1, La9/h;->b:Ljava/lang/Object;

    .line 1907
    .line 1908
    check-cast v0, Lef/l;

    .line 1909
    .line 1910
    iget-object v4, v3, Lb7/b1;->b:Ljava/lang/Object;

    .line 1911
    .line 1912
    check-cast v4, Lug/t;

    .line 1913
    .line 1914
    iget-object v4, v4, Lug/t;->h:Ljava/lang/String;

    .line 1915
    .line 1916
    invoke-static {v0, v4}, Lna/w;->i(Lef/l;Ljava/lang/String;)Ljava/lang/String;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v0

    .line 1920
    if-eqz v0, :cond_4e

    .line 1921
    .line 1922
    :try_start_b
    sget-object v4, Lb9/d;->a:Lub/p;

    .line 1923
    .line 1924
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1925
    .line 1926
    .line 1927
    move-result-wide v4

    .line 1928
    invoke-static {v4, v5, v3}, Lb9/d;->b(JLb7/b1;)Lug/d0;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 1932
    goto :goto_28

    .line 1933
    :catchall_1
    move-exception v0

    .line 1934
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v0

    .line 1938
    :goto_28
    invoke-static {v0}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v4

    .line 1942
    if-eqz v4, :cond_4c

    .line 1943
    .line 1944
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1945
    .line 1946
    .line 1947
    :cond_4c
    instance-of v4, v0, Lub/m;

    .line 1948
    .line 1949
    if-eqz v4, :cond_4d

    .line 1950
    .line 1951
    const/4 v5, 0x0

    .line 1952
    goto :goto_29

    .line 1953
    :cond_4d
    move-object v5, v0

    .line 1954
    :goto_29
    check-cast v5, Lug/d0;

    .line 1955
    .line 1956
    goto :goto_2a

    .line 1957
    :cond_4e
    const/4 v5, 0x0

    .line 1958
    :goto_2a
    if-nez v5, :cond_4f

    .line 1959
    .line 1960
    invoke-virtual {v2, v3}, Lah/h;->b(Lb7/b1;)Lug/d0;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v5

    .line 1964
    :cond_4f
    return-object v5

    .line 1965
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
.end method

.method public b(Lug/d0;Lb5/d0;)Lb7/b1;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2}, Lb5/d0;->l()Lzg/o;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v1, v1, Lzg/o;->c:Lug/g0;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    iget v2, p1, Lug/d0;->d:I

    .line 13
    .line 14
    iget-object v3, p1, Lug/d0;->a:Lb7/b1;

    .line 15
    .line 16
    iget-object v3, v3, Lb7/b1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    const/16 v6, 0x134

    .line 23
    .line 24
    const/16 v7, 0x133

    .line 25
    .line 26
    if-eq v2, v7, :cond_c

    .line 27
    .line 28
    if-eq v2, v6, :cond_c

    .line 29
    .line 30
    const/16 v8, 0x191

    .line 31
    .line 32
    if-eq v2, v8, :cond_b

    .line 33
    .line 34
    const/16 v8, 0x1a5

    .line 35
    .line 36
    if-eq v2, v8, :cond_9

    .line 37
    .line 38
    const/16 p2, 0x1f7

    .line 39
    .line 40
    if-eq v2, p2, :cond_7

    .line 41
    .line 42
    const/16 p2, 0x197

    .line 43
    .line 44
    if-eq v2, p2, :cond_5

    .line 45
    .line 46
    const/16 p2, 0x198

    .line 47
    .line 48
    if-eq v2, p2, :cond_1

    .line 49
    .line 50
    packed-switch v2, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    iget-object v1, p0, La9/h;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lug/x;

    .line 58
    .line 59
    iget-boolean v1, v1, Lug/x;->e:Z

    .line 60
    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_2
    iget-object v1, p1, Lug/d0;->k:Lug/d0;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    iget v1, v1, Lug/d0;->d:I

    .line 70
    .line 71
    if-ne v1, p2, :cond_3

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    invoke-static {p1, v4}, La9/h;->e(Lug/d0;I)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-lez p2, :cond_4

    .line 80
    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_4
    iget-object p1, p1, Lug/d0;->a:Lb7/b1;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_5
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, v1, Lug/g0;->b:Ljava/net/Proxy;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 96
    .line 97
    if-ne p1, p2, :cond_6

    .line 98
    .line 99
    iget-object p1, p0, La9/h;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Lug/x;

    .line 102
    .line 103
    iget-object p1, p1, Lug/x;->n:Lug/b;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    .line 110
    .line 111
    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 112
    .line 113
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :cond_7
    iget-object v1, p1, Lug/d0;->k:Lug/d0;

    .line 118
    .line 119
    if-eqz v1, :cond_8

    .line 120
    .line 121
    iget v1, v1, Lug/d0;->d:I

    .line 122
    .line 123
    if-ne v1, p2, :cond_8

    .line 124
    .line 125
    goto/16 :goto_3

    .line 126
    .line 127
    :cond_8
    const p2, 0x7fffffff

    .line 128
    .line 129
    .line 130
    invoke-static {p1, p2}, La9/h;->e(Lug/d0;I)I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-nez p2, :cond_12

    .line 135
    .line 136
    iget-object p1, p1, Lug/d0;->a:Lb7/b1;

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_9
    if-eqz p2, :cond_12

    .line 140
    .line 141
    iget-object v1, p2, Lb5/d0;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lzg/h;

    .line 144
    .line 145
    invoke-interface {v1}, Lzg/h;->f()Lzg/p;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v1, v1, Lzg/p;->i:Lug/a;

    .line 150
    .line 151
    iget-object v1, v1, Lug/a;->h:Lug/t;

    .line 152
    .line 153
    iget-object v1, v1, Lug/t;->d:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v2, p2, Lb5/d0;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, Lah/f;

    .line 158
    .line 159
    invoke-interface {v2}, Lah/f;->i()Lah/e;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-interface {v2}, Lah/e;->h()Lug/g0;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    iget-object v2, v2, Lug/g0;->a:Lug/a;

    .line 168
    .line 169
    iget-object v2, v2, Lug/a;->h:Lug/t;

    .line 170
    .line 171
    iget-object v2, v2, Lug/t;->d:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v1, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_a

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_a
    invoke-virtual {p2}, Lb5/d0;->l()Lzg/o;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    monitor-enter p2

    .line 185
    :try_start_0
    iput-boolean v5, p2, Lzg/o;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    .line 187
    monitor-exit p2

    .line 188
    iget-object p1, p1, Lug/d0;->a:Lb7/b1;

    .line 189
    .line 190
    return-object p1

    .line 191
    :catchall_0
    move-exception p1

    .line 192
    monitor-exit p2

    .line 193
    throw p1

    .line 194
    :cond_b
    iget-object p1, p0, La9/h;->b:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p1, Lug/x;

    .line 197
    .line 198
    iget-object p1, p1, Lug/x;->g:Lug/b;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    return-object v0

    .line 204
    :cond_c
    :pswitch_0
    const-string p2, "PROPFIND"

    .line 205
    .line 206
    iget-object v1, p0, La9/h;->b:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, Lug/x;

    .line 209
    .line 210
    iget-boolean v2, v1, Lug/x;->h:Z

    .line 211
    .line 212
    if-nez v2, :cond_d

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_d
    const-string v2, "Location"

    .line 216
    .line 217
    iget-object v8, p1, Lug/d0;->f:Lug/r;

    .line 218
    .line 219
    invoke-virtual {v8, v2}, Lug/r;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    if-nez v2, :cond_e

    .line 224
    .line 225
    move-object v2, v0

    .line 226
    :cond_e
    iget-object v8, p1, Lug/d0;->a:Lb7/b1;

    .line 227
    .line 228
    if-nez v2, :cond_f

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_f
    iget-object v9, v8, Lb7/b1;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v9, Lug/t;

    .line 234
    .line 235
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    :try_start_1
    new-instance v10, Lug/s;

    .line 239
    .line 240
    invoke-direct {v10}, Lug/s;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v10, v9, v2}, Lug/s;->d(Lug/t;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :catch_0
    nop

    .line 248
    move-object v10, v0

    .line 249
    :goto_1
    if-eqz v10, :cond_10

    .line 250
    .line 251
    invoke-virtual {v10}, Lug/s;->b()Lug/t;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    goto :goto_2

    .line 256
    :cond_10
    move-object v2, v0

    .line 257
    :goto_2
    if-nez v2, :cond_11

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_11
    iget-object v9, v2, Lug/t;->a:Ljava/lang/String;

    .line 261
    .line 262
    iget-object v10, v8, Lb7/b1;->b:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v10, Lug/t;

    .line 265
    .line 266
    iget-object v10, v10, Lug/t;->a:Ljava/lang/String;

    .line 267
    .line 268
    invoke-static {v9, v10}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-nez v9, :cond_13

    .line 273
    .line 274
    iget-boolean v1, v1, Lug/x;->i:Z

    .line 275
    .line 276
    if-nez v1, :cond_13

    .line 277
    .line 278
    :cond_12
    :goto_3
    return-object v0

    .line 279
    :cond_13
    invoke-virtual {v8}, Lb7/b1;->I()Lch/l;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-static {v3}, Lgh/g;->K(Ljava/lang/String;)Z

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    if-eqz v9, :cond_18

    .line 288
    .line 289
    iget p1, p1, Lug/d0;->d:I

    .line 290
    .line 291
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-nez v9, :cond_14

    .line 296
    .line 297
    if-eq p1, v6, :cond_14

    .line 298
    .line 299
    if-ne p1, v7, :cond_15

    .line 300
    .line 301
    :cond_14
    const/4 v4, 0x1

    .line 302
    :cond_15
    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    if-nez p2, :cond_16

    .line 307
    .line 308
    if-eq p1, v6, :cond_16

    .line 309
    .line 310
    if-eq p1, v7, :cond_16

    .line 311
    .line 312
    const-string p1, "GET"

    .line 313
    .line 314
    invoke-virtual {v1, p1, v0}, Lch/l;->y(Ljava/lang/String;Lug/b0;)V

    .line 315
    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_16
    if-eqz v4, :cond_17

    .line 319
    .line 320
    iget-object p1, v8, Lb7/b1;->e:Ljava/lang/Object;

    .line 321
    .line 322
    move-object v0, p1

    .line 323
    check-cast v0, Lug/b0;

    .line 324
    .line 325
    :cond_17
    invoke-virtual {v1, v3, v0}, Lch/l;->y(Ljava/lang/String;Lug/b0;)V

    .line 326
    .line 327
    .line 328
    :goto_4
    if-nez v4, :cond_18

    .line 329
    .line 330
    const-string p1, "Transfer-Encoding"

    .line 331
    .line 332
    iget-object p2, v1, Lch/l;->c:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast p2, Lhd/q0;

    .line 335
    .line 336
    invoke-virtual {p2, p1}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    const-string p1, "Content-Length"

    .line 340
    .line 341
    iget-object p2, v1, Lch/l;->c:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p2, Lhd/q0;

    .line 344
    .line 345
    invoke-virtual {p2, p1}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    const-string p1, "Content-Type"

    .line 349
    .line 350
    iget-object p2, v1, Lch/l;->c:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast p2, Lhd/q0;

    .line 353
    .line 354
    invoke-virtual {p2, p1}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    :cond_18
    iget-object p1, v8, Lb7/b1;->b:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast p1, Lug/t;

    .line 360
    .line 361
    invoke-static {p1, v2}, Lwg/g;->a(Lug/t;Lug/t;)Z

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    if-nez p1, :cond_19

    .line 366
    .line 367
    const-string p1, "Authorization"

    .line 368
    .line 369
    iget-object p2, v1, Lch/l;->c:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast p2, Lhd/q0;

    .line 372
    .line 373
    invoke-virtual {p2, p1}, Lhd/q0;->x(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    :cond_19
    iput-object v2, v1, Lch/l;->b:Ljava/lang/Object;

    .line 377
    .line 378
    new-instance p1, Lb7/b1;

    .line 379
    .line 380
    invoke-direct {p1, v1}, Lb7/b1;-><init>(Lch/l;)V

    .line 381
    .line 382
    .line 383
    return-object p1

    .line 384
    nop

    .line 385
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
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
.end method

.method public d(Ljava/io/IOException;Lzg/n;Lb7/b1;)Z
    .locals 1

    .line 1
    instance-of p3, p1, Lch/a;

    .line 2
    .line 3
    iget-object v0, p0, La9/h;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lug/x;

    .line 6
    .line 7
    iget-boolean v0, v0, Lug/x;->e:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    if-nez p3, :cond_1

    .line 13
    .line 14
    instance-of v0, p1, Ljava/io/FileNotFoundException;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    instance-of v0, p1, Ljava/net/ProtocolException;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_2
    instance-of v0, p1, Ljava/io/InterruptedIOException;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 29
    .line 30
    if-eqz p1, :cond_7

    .line 31
    .line 32
    if-eqz p3, :cond_7

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 36
    .line 37
    if-eqz p3, :cond_4

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    instance-of p3, p3, Ljava/security/cert/CertificateException;

    .line 44
    .line 45
    if-eqz p3, :cond_4

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 49
    .line 50
    if-eqz p1, :cond_5

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_5
    :goto_0
    iget-object p1, p2, Lzg/n;->q:Lb5/d0;

    .line 54
    .line 55
    if-eqz p1, :cond_7

    .line 56
    .line 57
    iget-boolean p1, p1, Lb5/d0;->a:Z

    .line 58
    .line 59
    const/4 p3, 0x1

    .line 60
    if-ne p1, p3, :cond_7

    .line 61
    .line 62
    iget-object p1, p2, Lzg/n;->g:Lzg/h;

    .line 63
    .line 64
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Lzg/h;->f()Lzg/p;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p2, p2, Lzg/n;->q:Lb5/d0;

    .line 72
    .line 73
    if-eqz p2, :cond_6

    .line 74
    .line 75
    invoke-virtual {p2}, Lb5/d0;->l()Lzg/o;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    goto :goto_1

    .line 80
    :cond_6
    const/4 p2, 0x0

    .line 81
    :goto_1
    invoke-virtual {p1, p2}, Lzg/p;->a(Lzg/o;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_7

    .line 86
    .line 87
    return p3

    .line 88
    :cond_7
    :goto_2
    const/4 p1, 0x0

    .line 89
    return p1
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

.class public Lb7/c2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public A:Z

.field public final B:Lya/i0;

.field public final C:Lya/i0;

.field public final D:Landroid/os/Bundle;

.field public final a:Ljava/lang/Object;

.field public final b:Landroid/net/Uri;

.field public final c:Lb7/z1;

.field public final d:Lb7/y1;

.field public final e:Lpe/d;

.field public final f:Lcom/cnl/kikoeru/MainService;

.field public final g:Lb7/q3;

.field public final h:Lb7/o2;

.field public final i:Ljava/lang/String;

.field public final j:Lb7/k4;

.field public final k:Lb7/v1;

.field public final l:Landroid/os/Handler;

.field public final m:Lc7/e1;

.field public final n:Lb7/w1;

.field public final o:Landroid/os/Handler;

.field public final p:Z

.field public final q:Z

.field public final r:Lya/i0;

.field public s:Lb7/v3;

.field public t:Lb7/z3;

.field public final u:Landroid/app/PendingIntent;

.field public v:Lb7/a2;

.field public w:Lb0/c1;

.field public x:Lb7/q2;

.field public y:Z

.field public final z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb7/i4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lb7/i4;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public constructor <init>(Lb7/v1;Lcom/cnl/kikoeru/MainService;Landroidx/media3/exoplayer/ExoPlayer;Landroid/app/PendingIntent;Lya/i0;Lya/i0;Lya/i0;Lpe/d;Landroid/os/Bundle;Landroid/os/Bundle;Lc7/e1;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    move-object/from16 v4, p10

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v5, v0, Lb7/c2;->a:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v5, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v6, "Init "

    .line 24
    .line 25
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v6, " [AndroidXMedia3/1.6.0-alpha01] ["

    .line 40
    .line 41
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    sget-object v6, Lp4/c0;->e:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v6, "]"

    .line 50
    .line 51
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const-string v6, "MediaSessionImpl"

    .line 59
    .line 60
    invoke-static {v6, v5}, Lp4/c;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object/from16 v5, p1

    .line 64
    .line 65
    iput-object v5, v0, Lb7/c2;->k:Lb7/v1;

    .line 66
    .line 67
    move-object/from16 v5, p2

    .line 68
    .line 69
    iput-object v5, v0, Lb7/c2;->f:Lcom/cnl/kikoeru/MainService;

    .line 70
    .line 71
    const-string v6, ""

    .line 72
    .line 73
    iput-object v6, v0, Lb7/c2;->i:Ljava/lang/String;

    .line 74
    .line 75
    move-object/from16 v7, p4

    .line 76
    .line 77
    iput-object v7, v0, Lb7/c2;->u:Landroid/app/PendingIntent;

    .line 78
    .line 79
    iput-object v2, v0, Lb7/c2;->B:Lya/i0;

    .line 80
    .line 81
    iput-object v3, v0, Lb7/c2;->C:Lya/i0;

    .line 82
    .line 83
    move-object/from16 v7, p7

    .line 84
    .line 85
    iput-object v7, v0, Lb7/c2;->r:Lya/i0;

    .line 86
    .line 87
    move-object/from16 v7, p8

    .line 88
    .line 89
    iput-object v7, v0, Lb7/c2;->e:Lpe/d;

    .line 90
    .line 91
    iput-object v4, v0, Lb7/c2;->D:Landroid/os/Bundle;

    .line 92
    .line 93
    move-object/from16 v7, p11

    .line 94
    .line 95
    iput-object v7, v0, Lb7/c2;->m:Lc7/e1;

    .line 96
    .line 97
    const/4 v7, 0x1

    .line 98
    iput-boolean v7, v0, Lb7/c2;->p:Z

    .line 99
    .line 100
    iput-boolean v7, v0, Lb7/c2;->q:Z

    .line 101
    .line 102
    new-instance v13, Lb7/q3;

    .line 103
    .line 104
    invoke-direct {v13, v0}, Lb7/q3;-><init>(Lb7/c2;)V

    .line 105
    .line 106
    .line 107
    iput-object v13, v0, Lb7/c2;->g:Lb7/q3;

    .line 108
    .line 109
    new-instance v7, Landroid/os/Handler;

    .line 110
    .line 111
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-direct {v7, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 116
    .line 117
    .line 118
    iput-object v7, v0, Lb7/c2;->o:Landroid/os/Handler;

    .line 119
    .line 120
    move-object v7, v1

    .line 121
    check-cast v7, Lv4/v;

    .line 122
    .line 123
    iget-object v7, v7, Lv4/v;->t:Landroid/os/Looper;

    .line 124
    .line 125
    new-instance v8, Landroid/os/Handler;

    .line 126
    .line 127
    invoke-direct {v8, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 128
    .line 129
    .line 130
    iput-object v8, v0, Lb7/c2;->l:Landroid/os/Handler;

    .line 131
    .line 132
    sget-object v9, Lb7/v3;->F:Lb7/v3;

    .line 133
    .line 134
    iput-object v9, v0, Lb7/c2;->s:Lb7/v3;

    .line 135
    .line 136
    new-instance v9, Lb7/z1;

    .line 137
    .line 138
    invoke-direct {v9, v0, v7}, Lb7/z1;-><init>(Lb7/c2;Landroid/os/Looper;)V

    .line 139
    .line 140
    .line 141
    iput-object v9, v0, Lb7/c2;->c:Lb7/z1;

    .line 142
    .line 143
    new-instance v9, Lb7/y1;

    .line 144
    .line 145
    invoke-direct {v9, v0, v7}, Lb7/y1;-><init>(Lb7/c2;Landroid/os/Looper;)V

    .line 146
    .line 147
    .line 148
    iput-object v9, v0, Lb7/c2;->d:Lb7/y1;

    .line 149
    .line 150
    new-instance v7, Landroid/net/Uri$Builder;

    .line 151
    .line 152
    invoke-direct {v7}, Landroid/net/Uri$Builder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-class v9, Lb7/c2;

    .line 156
    .line 157
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    invoke-virtual {v7, v9}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-virtual {v7, v6}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 170
    .line 171
    .line 172
    move-result-wide v9

    .line 173
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v6, v7}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v6}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    iput-object v6, v0, Lb7/c2;->b:Landroid/net/Uri;

    .line 186
    .line 187
    new-instance v7, Lb7/o2;

    .line 188
    .line 189
    move-object/from16 v14, p9

    .line 190
    .line 191
    invoke-direct {v7, v0, v6, v8, v14}, Lb7/o2;-><init>(Lb7/c2;Landroid/net/Uri;Landroid/os/Handler;Landroid/os/Bundle;)V

    .line 192
    .line 193
    .line 194
    iput-object v7, v0, Lb7/c2;->h:Lb7/o2;

    .line 195
    .line 196
    iget-object v6, v7, Lb7/o2;->k:Lc7/e1;

    .line 197
    .line 198
    iget-object v6, v6, Lc7/e1;->b:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v6, Lc7/w0;

    .line 201
    .line 202
    iget-object v6, v6, Lc7/w0;->c:Lc7/d1;

    .line 203
    .line 204
    iget-object v6, v6, Lc7/d1;->b:Ljava/lang/Object;

    .line 205
    .line 206
    move-object v15, v6

    .line 207
    check-cast v15, Landroid/media/session/MediaSession$Token;

    .line 208
    .line 209
    move-object v6, v8

    .line 210
    new-instance v8, Lb7/k4;

    .line 211
    .line 212
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    const/4 v11, 0x4

    .line 217
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    const v10, 0x3bf65781

    .line 222
    .line 223
    .line 224
    invoke-direct/range {v8 .. v15}, Lb7/k4;-><init>(IIILjava/lang/String;Lb7/t;Landroid/os/Bundle;Landroid/media/session/MediaSession$Token;)V

    .line 225
    .line 226
    .line 227
    iput-object v8, v0, Lb7/c2;->j:Lb7/k4;

    .line 228
    .line 229
    sget-object v5, Lb7/r1;->f:Lm4/u0;

    .line 230
    .line 231
    sget-object v7, Lb7/r1;->e:Lb7/f4;

    .line 232
    .line 233
    new-instance v8, Lb7/r1;

    .line 234
    .line 235
    new-instance v8, Lb7/z3;

    .line 236
    .line 237
    invoke-direct {v8, v1}, Lb7/z3;-><init>(Landroidx/media3/exoplayer/ExoPlayer;)V

    .line 238
    .line 239
    .line 240
    iput-object v2, v8, Lb7/z3;->c:Lya/i0;

    .line 241
    .line 242
    iput-object v3, v8, Lb7/z3;->d:Lya/i0;

    .line 243
    .line 244
    iput-object v7, v8, Lb7/z3;->e:Lb7/f4;

    .line 245
    .line 246
    iput-object v5, v8, Lb7/z3;->f:Lm4/u0;

    .line 247
    .line 248
    new-instance v1, Landroid/os/Bundle;

    .line 249
    .line 250
    invoke-direct {v1, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 251
    .line 252
    .line 253
    iput-object v1, v8, Lb7/z3;->b:Landroid/os/Bundle;

    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_0

    .line 260
    .line 261
    invoke-virtual {v8}, Lb7/z3;->q0()V

    .line 262
    .line 263
    .line 264
    :cond_0
    iput-object v8, v0, Lb7/c2;->t:Lb7/z3;

    .line 265
    .line 266
    new-instance v1, Lb5/h;

    .line 267
    .line 268
    const/4 v2, 0x5

    .line 269
    invoke-direct {v1, v2, v0, v8}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v6, v1}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 273
    .line 274
    .line 275
    const-wide/16 v1, 0xbb8

    .line 276
    .line 277
    iput-wide v1, v0, Lb7/c2;->z:J

    .line 278
    .line 279
    new-instance v1, Lb7/w1;

    .line 280
    .line 281
    const/4 v2, 0x2

    .line 282
    invoke-direct {v1, v0, v2}, Lb7/w1;-><init>(Lb7/c2;I)V

    .line 283
    .line 284
    .line 285
    iput-object v1, v0, Lb7/c2;->n:Lb7/w1;

    .line 286
    .line 287
    new-instance v1, Lb7/w1;

    .line 288
    .line 289
    const/4 v2, 0x3

    .line 290
    invoke-direct {v1, v0, v2}, Lb7/w1;-><init>(Lb7/c2;I)V

    .line 291
    .line 292
    .line 293
    invoke-static {v6, v1}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 294
    .line 295
    .line 296
    return-void
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
.end method

.method public static i(Lb7/t1;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lb7/t1;->b:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lb7/t1;->a:Lc7/k1;

    .line 8
    .line 9
    iget-object p0, p0, Lc7/k1;->a:Lc7/j1;

    .line 10
    .line 11
    iget-object p0, p0, Lc7/j1;->a:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "com.android.systemui"

    .line 14
    .line 15
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
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
.method public final a(Landroid/view/KeyEvent;Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/c2;->k:Lb7/v1;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v1;->a:Lb7/c2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb7/c2;->d()Lb7/t1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/16 v1, 0x55

    .line 17
    .line 18
    if-eq p1, v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x4f

    .line 21
    .line 22
    if-ne p1, v1, :cond_1

    .line 23
    .line 24
    :cond_0
    if-eqz p2, :cond_1

    .line 25
    .line 26
    const/16 p1, 0x57

    .line 27
    .line 28
    :cond_1
    const/16 p2, 0x7e

    .line 29
    .line 30
    if-eq p1, p2, :cond_6

    .line 31
    .line 32
    const/16 p2, 0x7f

    .line 33
    .line 34
    if-eq p1, p2, :cond_5

    .line 35
    .line 36
    const/16 p2, 0x110

    .line 37
    .line 38
    if-eq p1, p2, :cond_4

    .line 39
    .line 40
    const/16 p2, 0x111

    .line 41
    .line 42
    if-eq p1, p2, :cond_3

    .line 43
    .line 44
    packed-switch p1, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    return p1

    .line 49
    :pswitch_0
    new-instance p1, Lb7/c;

    .line 50
    .line 51
    const/4 p2, 0x1

    .line 52
    invoke-direct {p1, p0, v0, p2}, Lb7/c;-><init>(Lb7/c2;Lb7/t1;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    new-instance p1, Lb7/c;

    .line 57
    .line 58
    const/4 p2, 0x2

    .line 59
    invoke-direct {p1, p0, v0, p2}, Lb7/c;-><init>(Lb7/c2;Lb7/t1;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_2
    new-instance p1, Lb7/c;

    .line 64
    .line 65
    const/4 p2, 0x3

    .line 66
    invoke-direct {p1, p0, v0, p2}, Lb7/c;-><init>(Lb7/c2;Lb7/t1;I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_3
    iget-object p1, p0, Lb7/c2;->t:Lb7/z3;

    .line 71
    .line 72
    invoke-virtual {p1}, Lb7/z3;->r()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    new-instance p1, Lb7/c;

    .line 79
    .line 80
    const/4 p2, 0x4

    .line 81
    invoke-direct {p1, p0, v0, p2}, Lb7/c;-><init>(Lb7/c2;Lb7/t1;I)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    new-instance p1, Lb7/c;

    .line 86
    .line 87
    const/4 p2, 0x5

    .line 88
    invoke-direct {p1, p0, v0, p2}, Lb7/c;-><init>(Lb7/c2;Lb7/t1;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    :pswitch_4
    new-instance p1, Lb7/c;

    .line 93
    .line 94
    const/16 p2, 0x9

    .line 95
    .line 96
    invoke-direct {p1, p0, v0, p2}, Lb7/c;-><init>(Lb7/c2;Lb7/t1;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    :pswitch_5
    new-instance p1, Lb7/c;

    .line 101
    .line 102
    const/16 p2, 0x8

    .line 103
    .line 104
    invoke-direct {p1, p0, v0, p2}, Lb7/c;-><init>(Lb7/c2;Lb7/t1;I)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    new-instance p1, Lb7/c;

    .line 109
    .line 110
    const/4 p2, 0x7

    .line 111
    invoke-direct {p1, p0, v0, p2}, Lb7/c;-><init>(Lb7/c2;Lb7/t1;I)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    new-instance p1, Lb7/c;

    .line 116
    .line 117
    const/4 p2, 0x6

    .line 118
    invoke-direct {p1, p0, v0, p2}, Lb7/c;-><init>(Lb7/c2;Lb7/t1;I)V

    .line 119
    .line 120
    .line 121
    :goto_0
    new-instance p2, Lb5/m;

    .line 122
    .line 123
    const/4 v1, 0x2

    .line 124
    invoke-direct {p2, p0, p1, v0, v1}, Lb5/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lb7/c2;->l:Landroid/os/Handler;

    .line 128
    .line 129
    invoke-static {p1, p2}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 130
    .line 131
    .line 132
    const/4 p1, 0x1

    .line 133
    return p1

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_4
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final b(Lb7/t1;Lb7/b2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/c2;->g:Lb7/q3;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lb7/q3;->g:Lb0/w1;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lb0/w1;->O(Lb7/t1;)Lb7/d4;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lb7/d4;->j()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_2

    .line 16
    :catch_0
    move-exception p2

    .line 17
    goto :goto_3

    .line 18
    :cond_0
    iget-object v1, v0, Lb7/q3;->g:Lb0/w1;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Lb0/w1;->S(Lb7/t1;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lb7/c2;->h:Lb7/o2;

    .line 28
    .line 29
    iget-object v1, v1, Lb7/o2;->f:Lb0/w1;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lb0/w1;->S(Lb7/t1;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 41
    :goto_1
    if-nez v1, :cond_3

    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_3
    const/4 v1, 0x0

    .line 45
    :goto_2
    iget-object v2, p1, Lb7/t1;->d:Lb7/s1;

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    invoke-interface {p2, v2, v1}, Lb7/b2;->b(Lb7/s1;I)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, "Exception in "

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lb7/t1;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v0, "MediaSessionImpl"

    .line 72
    .line 73
    invoke-static {v0, p1, p2}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    goto :goto_4

    .line 77
    :catch_1
    iget-object p2, v0, Lb7/q3;->g:Lb0/w1;

    .line 78
    .line 79
    invoke-virtual {p2, p1}, Lb0/w1;->a0(Lb7/t1;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_4
    return-void
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
.end method

.method public final c(Lb7/b2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb7/c2;->g:Lb7/q3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/q3;->g:Lb0/w1;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb0/w1;->L()Lya/i0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-ge v2, v3, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lb7/t1;

    .line 22
    .line 23
    invoke-virtual {p0, v3, p1}, Lb7/c2;->b(Lb7/t1;Lb7/b2;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    iget-object v0, p0, Lb7/c2;->h:Lb7/o2;

    .line 30
    .line 31
    iget-object v0, v0, Lb7/o2;->i:Lb7/l2;

    .line 32
    .line 33
    invoke-interface {p1, v0, v1}, Lb7/b2;->b(Lb7/s1;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    move-exception p1

    .line 38
    const-string v0, "MediaSessionImpl"

    .line 39
    .line 40
    const-string v1, "Exception in using media1 API"

    .line 41
    .line 42
    invoke-static {v0, v1, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
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

.method public final d()Lb7/t1;
    .locals 4

    .line 1
    iget-object v0, p0, Lb7/c2;->g:Lb7/q3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/q3;->g:Lb0/w1;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb0/w1;->L()Lya/i0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lb7/t1;

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lb7/c2;->g(Lb7/t1;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    return-object v0
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
.end method

.method public final e(Lm4/u0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/c2;->c:Lb7/z1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Lb7/z1;->a(ZZ)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lb7/f1;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lb7/f1;-><init>(Lm4/u0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lb7/c2;->c(Lb7/b2;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object p1, p0, Lb7/c2;->h:Lb7/o2;

    .line 16
    .line 17
    iget-object p1, p1, Lb7/o2;->i:Lb7/l2;

    .line 18
    .line 19
    iget-object v0, p0, Lb7/c2;->s:Lb7/v3;

    .line 20
    .line 21
    iget-object v0, v0, Lb7/v3;->q:Lm4/k;

    .line 22
    .line 23
    invoke-virtual {p1}, Lb7/l2;->k()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    move-exception p1

    .line 28
    const-string v0, "MediaSessionImpl"

    .line 29
    .line 30
    const-string v1, "Exception in using media1 API"

    .line 31
    .line 32
    invoke-static {v0, v1, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
.end method

.method public final f(Lb7/t1;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lb7/c2;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lb7/c2;->t:Lb7/z3;

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lb7/z3;->B0(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lb7/c2;->t:Lb7/z3;

    .line 22
    .line 23
    invoke-virtual {v0}, Lb7/z3;->s()Lm4/i0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    :goto_0
    iget-object v3, p0, Lb7/c2;->t:Lb7/z3;

    .line 33
    .line 34
    const/16 v4, 0x1f

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Lb7/z3;->B0(I)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_3

    .line 41
    .line 42
    iget-object v3, p0, Lb7/c2;->t:Lb7/z3;

    .line 43
    .line 44
    const/16 v4, 0x14

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Lb7/z3;->B0(I)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    const/4 v3, 0x0

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    :goto_1
    const/4 v3, 0x1

    .line 56
    :goto_2
    invoke-virtual {p0, p1}, Lb7/c2;->r(Lb7/t1;)Lb7/t1;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 61
    .line 62
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 63
    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    xor-int/2addr v5, v2

    .line 67
    invoke-static {v5}, Lp4/c;->i(Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v2, v2}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 71
    .line 72
    .line 73
    new-instance v5, Lm4/u0;

    .line 74
    .line 75
    xor-int/2addr v1, v2

    .line 76
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Lm4/o;

    .line 80
    .line 81
    invoke-direct {v1, v4}, Lm4/o;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v5, v1}, Lm4/u0;-><init>(Lm4/o;)V

    .line 85
    .line 86
    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    if-nez v3, :cond_4

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    iget-object v0, p0, Lb7/c2;->e:Lpe/d;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v1, Lcb/u;

    .line 103
    .line 104
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v0}, Lcb/p;->l(Ljava/lang/Throwable;)Z

    .line 108
    .line 109
    .line 110
    new-instance v0, Lb7/n;

    .line 111
    .line 112
    invoke-direct {v0, p0, p1, p2, v5}, Lb7/n;-><init>(Lb7/c2;Lb7/t1;ZLm4/u0;)V

    .line 113
    .line 114
    .line 115
    new-instance p1, Lb7/e0;

    .line 116
    .line 117
    const/4 p2, 0x1

    .line 118
    invoke-direct {p1, p2, p0}, Lb7/e0;-><init>(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    new-instance p2, Lcb/t;

    .line 122
    .line 123
    const/4 v2, 0x0

    .line 124
    invoke-direct {p2, v2, v1, v0}, Lcb/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, p2, p1}, Lcb/p;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_5
    :goto_3
    if-nez v0, :cond_6

    .line 132
    .line 133
    const-string v0, "MediaSessionImpl"

    .line 134
    .line 135
    const-string v1, "Play requested without current MediaItem, but playback resumption prevented by missing available commands"

    .line 136
    .line 137
    invoke-static {v0, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    iget-object v0, p0, Lb7/c2;->t:Lb7/z3;

    .line 141
    .line 142
    invoke-static {v0}, Lp4/c0;->F(Lm4/y0;)Z

    .line 143
    .line 144
    .line 145
    if-eqz p2, :cond_7

    .line 146
    .line 147
    invoke-virtual {p0, p1}, Lb7/c2;->o(Lb7/t1;)V

    .line 148
    .line 149
    .line 150
    :cond_7
    :goto_4
    return-void
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

.method public final g(Lb7/t1;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lb7/t1;->a:Lc7/k1;

    .line 2
    .line 3
    iget-object v0, v0, Lc7/k1;->a:Lc7/j1;

    .line 4
    .line 5
    iget-object v0, v0, Lc7/j1;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Lb7/c2;->f:Lcom/cnl/kikoeru/MainService;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget v0, p1, Lb7/t1;->b:I

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Landroid/os/Bundle;

    .line 25
    .line 26
    iget-object p1, p1, Lb7/t1;->e:Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "androidx.media3.session.MediaNotificationManager"

    .line 32
    .line 33
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    return v1
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
.end method

.method public final h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lb7/c2;->y:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
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

.method public final j(Lb7/t1;Ljava/util/List;)Lcb/y;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lb7/c2;->r(Lb7/t1;)Lb7/t1;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lb7/c2;->e:Lpe/d;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Lpe/d;->G(Ljava/util/List;)Lcb/y;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public final k(Lb7/t1;)Lb7/r1;
    .locals 11

    .line 1
    iget-boolean v0, p0, Lb7/c2;->A:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-static {p1}, Lb7/c2;->i(Lb7/t1;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    sget-object p1, Lb7/r1;->e:Lb7/f4;

    .line 13
    .line 14
    iget-object p1, p0, Lb7/c2;->t:Lb7/z3;

    .line 15
    .line 16
    iget-object p1, p1, Lb7/z3;->e:Lb7/f4;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lb7/c2;->t:Lb7/z3;

    .line 22
    .line 23
    iget-object v0, v0, Lb7/z3;->f:Lm4/u0;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lb7/c2;->t:Lb7/z3;

    .line 29
    .line 30
    iget-object v2, v2, Lb7/z3;->c:Lya/i0;

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    move-object v2, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v2}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :goto_0
    iget-object v3, p0, Lb7/c2;->t:Lb7/z3;

    .line 41
    .line 42
    iget-object v3, v3, Lb7/z3;->d:Lya/i0;

    .line 43
    .line 44
    if-nez v3, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {v3}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    new-instance v3, Lb7/r1;

    .line 52
    .line 53
    invoke-direct {v3, p1, v0, v2, v1}, Lb7/r1;-><init>(Lb7/f4;Lm4/u0;Lya/i0;Lya/i0;)V

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_2
    iget-object v0, p0, Lb7/c2;->e:Lpe/d;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v0, Lb7/r1;->f:Lm4/u0;

    .line 63
    .line 64
    sget-object v2, Lb7/r1;->e:Lb7/f4;

    .line 65
    .line 66
    new-instance v3, Lb7/r1;

    .line 67
    .line 68
    invoke-direct {v3, v2, v0, v1, v1}, Lb7/r1;-><init>(Lb7/f4;Lm4/u0;Lya/i0;Lya/i0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, Lb7/c2;->g(Lb7/t1;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_b

    .line 76
    .line 77
    const/4 p1, 0x1

    .line 78
    iput-boolean p1, p0, Lb7/c2;->A:Z

    .line 79
    .line 80
    iget-object v1, p0, Lb7/c2;->k:Lb7/v1;

    .line 81
    .line 82
    iget-object v4, v1, Lb7/v1;->a:Lb7/c2;

    .line 83
    .line 84
    iget-object v4, v4, Lb7/c2;->C:Lya/i0;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    iget-object v6, p0, Lb7/c2;->h:Lb7/o2;

    .line 91
    .line 92
    const-string v7, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    const-string v9, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 96
    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    iget-object v4, p0, Lb7/c2;->t:Lb7/z3;

    .line 100
    .line 101
    iget-object v1, v1, Lb7/v1;->a:Lb7/c2;

    .line 102
    .line 103
    iget-object v1, v1, Lb7/c2;->B:Lya/i0;

    .line 104
    .line 105
    iput-object v1, v4, Lb7/z3;->c:Lya/i0;

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    iget-object v1, p0, Lb7/c2;->t:Lb7/z3;

    .line 109
    .line 110
    iput-object v4, v1, Lb7/z3;->d:Lya/i0;

    .line 111
    .line 112
    iget-object v4, v1, Lb7/z3;->b:Landroid/os/Bundle;

    .line 113
    .line 114
    invoke-virtual {v4, v9, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-virtual {v4, v7, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    invoke-virtual {v1}, Lb7/z3;->q0()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v9, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-ne v1, v5, :cond_4

    .line 130
    .line 131
    invoke-virtual {v4, v7, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eq v1, v10, :cond_5

    .line 136
    .line 137
    :cond_4
    iget-object v1, v6, Lb7/o2;->k:Lc7/e1;

    .line 138
    .line 139
    iget-object v4, p0, Lb7/c2;->t:Lb7/z3;

    .line 140
    .line 141
    iget-object v4, v4, Lb7/z3;->b:Landroid/os/Bundle;

    .line 142
    .line 143
    iget-object v1, v1, Lc7/e1;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Lc7/w0;

    .line 146
    .line 147
    iget-object v1, v1, Lc7/w0;->a:Landroid/media/session/MediaSession;

    .line 148
    .line 149
    invoke-virtual {v1, v4}, Landroid/media/session/MediaSession;->setExtras(Landroid/os/Bundle;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    :goto_2
    iget-object v1, p0, Lb7/c2;->t:Lb7/z3;

    .line 153
    .line 154
    iget-object v1, v1, Lb7/z3;->f:Lm4/u0;

    .line 155
    .line 156
    const/16 v4, 0x11

    .line 157
    .line 158
    invoke-virtual {v1, v4}, Lm4/u0;->a(I)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-virtual {v0, v4}, Lm4/u0;->a(I)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eq v1, v4, :cond_6

    .line 167
    .line 168
    const/4 v1, 0x1

    .line 169
    goto :goto_3

    .line 170
    :cond_6
    const/4 v1, 0x0

    .line 171
    :goto_3
    iget-object v4, p0, Lb7/c2;->t:Lb7/z3;

    .line 172
    .line 173
    iget-object v5, v4, Lb7/z3;->b:Landroid/os/Bundle;

    .line 174
    .line 175
    iput-object v2, v4, Lb7/z3;->e:Lb7/f4;

    .line 176
    .line 177
    iput-object v0, v4, Lb7/z3;->f:Lm4/u0;

    .line 178
    .line 179
    iget-object v0, v4, Lb7/z3;->d:Lya/i0;

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_7

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_7
    invoke-virtual {v5, v9, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    invoke-virtual {v5, v7, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-virtual {v4}, Lb7/z3;->q0()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v9, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-ne v4, v0, :cond_8

    .line 204
    .line 205
    invoke-virtual {v5, v7, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eq v0, v2, :cond_9

    .line 210
    .line 211
    :cond_8
    iget-object v0, v6, Lb7/o2;->k:Lc7/e1;

    .line 212
    .line 213
    iget-object v2, p0, Lb7/c2;->t:Lb7/z3;

    .line 214
    .line 215
    iget-object v2, v2, Lb7/z3;->b:Landroid/os/Bundle;

    .line 216
    .line 217
    iget-object v0, v0, Lc7/e1;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Lc7/w0;

    .line 220
    .line 221
    iget-object v0, v0, Lc7/w0;->a:Landroid/media/session/MediaSession;

    .line 222
    .line 223
    invoke-virtual {v0, v2}, Landroid/media/session/MediaSession;->setExtras(Landroid/os/Bundle;)V

    .line 224
    .line 225
    .line 226
    :cond_9
    :goto_4
    if-eqz v1, :cond_a

    .line 227
    .line 228
    iget-object v0, p0, Lb7/c2;->t:Lb7/z3;

    .line 229
    .line 230
    iget-object v1, v6, Lb7/o2;->g:Lb7/c2;

    .line 231
    .line 232
    iget-object v1, v1, Lb7/c2;->l:Landroid/os/Handler;

    .line 233
    .line 234
    new-instance v2, Lb7/h2;

    .line 235
    .line 236
    invoke-direct {v2, v6, v0, p1}, Lb7/h2;-><init>(Lb7/o2;Lb7/z3;I)V

    .line 237
    .line 238
    .line 239
    invoke-static {v1, v2}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 240
    .line 241
    .line 242
    return-object v3

    .line 243
    :cond_a
    iget-object p1, p0, Lb7/c2;->t:Lb7/z3;

    .line 244
    .line 245
    invoke-virtual {v6, p1}, Lb7/o2;->M(Lb7/z3;)V

    .line 246
    .line 247
    .line 248
    :cond_b
    return-object v3
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

.method public final l(Lb7/t1;)Lcb/v;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lb7/c2;->r(Lb7/t1;)Lb7/t1;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lb7/c2;->e:Lpe/d;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p1, Lb7/i4;

    .line 10
    .line 11
    const/4 v0, -0x6

    .line 12
    invoke-direct {p1, v0}, Lb7/i4;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lg8/a;->Q(Ljava/lang/Object;)Lcb/v;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
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

.method public final m(Lb7/t1;Landroid/content/Intent;)Z
    .locals 9

    .line 1
    iget v0, p1, Lb7/t1;->b:I

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v3, "android.intent.extra.KEY_EVENT"

    .line 11
    .line 12
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/KeyEvent;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v2

    .line 26
    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-string v4, "android.intent.action.MEDIA_BUTTON"

    .line 35
    .line 36
    invoke-static {p2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    const/4 v4, 0x0

    .line 41
    if-eqz p2, :cond_e

    .line 42
    .line 43
    iget-object p2, p0, Lb7/c2;->f:Lcom/cnl/kikoeru/MainService;

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v3, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_e

    .line 60
    .line 61
    :cond_1
    if-eqz v1, :cond_e

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getAction()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_2
    invoke-virtual {p0}, Lb7/c2;->t()V

    .line 72
    .line 73
    .line 74
    iget-object v3, p0, Lb7/c2;->e:Lpe/d;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    const-string v5, "android.software.leanback"

    .line 88
    .line 89
    invoke-virtual {p2, v5}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    const/16 v5, 0x55

    .line 94
    .line 95
    const/16 v6, 0x4f

    .line 96
    .line 97
    iget-object v7, p0, Lb7/c2;->d:Lb7/y1;

    .line 98
    .line 99
    const/4 v8, 0x1

    .line 100
    if-eq v3, v6, :cond_4

    .line 101
    .line 102
    if-eq v3, v5, :cond_4

    .line 103
    .line 104
    iget-object p1, v7, Lb7/y1;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, Lb5/m;

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-virtual {v7, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, v7, Lb7/y1;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, Lb5/m;

    .line 116
    .line 117
    iput-object v2, v7, Lb7/y1;->b:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v2, p1

    .line 120
    :cond_3
    if-eqz v2, :cond_a

    .line 121
    .line 122
    invoke-static {v7, v2}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    if-nez p2, :cond_8

    .line 127
    .line 128
    if-nez v0, :cond_8

    .line 129
    .line 130
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_5

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    iget-object p2, v7, Lb7/y1;->b:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p2, Lb5/m;

    .line 140
    .line 141
    if-eqz p2, :cond_7

    .line 142
    .line 143
    if-eqz p2, :cond_6

    .line 144
    .line 145
    invoke-virtual {v7, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 146
    .line 147
    .line 148
    iput-object v2, v7, Lb7/y1;->b:Ljava/lang/Object;

    .line 149
    .line 150
    :cond_6
    const/4 p1, 0x1

    .line 151
    goto :goto_3

    .line 152
    :cond_7
    new-instance p2, Lb5/m;

    .line 153
    .line 154
    const/4 v0, 0x3

    .line 155
    invoke-direct {p2, v7, p1, v1, v0}, Lb5/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 156
    .line 157
    .line 158
    iput-object p2, v7, Lb7/y1;->b:Ljava/lang/Object;

    .line 159
    .line 160
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    int-to-long v0, p1

    .line 165
    invoke-virtual {v7, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 166
    .line 167
    .line 168
    return v8

    .line 169
    :cond_8
    :goto_1
    iget-object p1, v7, Lb7/y1;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p1, Lb5/m;

    .line 172
    .line 173
    if-eqz p1, :cond_9

    .line 174
    .line 175
    invoke-virtual {v7, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 176
    .line 177
    .line 178
    iget-object p1, v7, Lb7/y1;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p1, Lb5/m;

    .line 181
    .line 182
    iput-object v2, v7, Lb7/y1;->b:Ljava/lang/Object;

    .line 183
    .line 184
    move-object v2, p1

    .line 185
    :cond_9
    if-eqz v2, :cond_a

    .line 186
    .line 187
    invoke-static {v7, v2}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    :goto_2
    const/4 p1, 0x0

    .line 191
    :goto_3
    iget-boolean p2, p0, Lb7/c2;->A:Z

    .line 192
    .line 193
    if-nez p2, :cond_d

    .line 194
    .line 195
    iget-object p2, p0, Lb7/c2;->h:Lb7/o2;

    .line 196
    .line 197
    if-eq v3, v5, :cond_b

    .line 198
    .line 199
    if-ne v3, v6, :cond_c

    .line 200
    .line 201
    :cond_b
    if-eqz p1, :cond_c

    .line 202
    .line 203
    invoke-virtual {p2}, Lb7/o2;->y()V

    .line 204
    .line 205
    .line 206
    return v8

    .line 207
    :cond_c
    if-eqz v0, :cond_e

    .line 208
    .line 209
    iget-object p1, p2, Lb7/o2;->k:Lc7/e1;

    .line 210
    .line 211
    iget-object p1, p1, Lc7/e1;->c:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p1, Landroidx/media3/exoplayer/offline/u;

    .line 214
    .line 215
    iget-object p1, p1, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p1, Lc7/j0;

    .line 218
    .line 219
    iget-object p1, p1, Lc7/j0;->a:Landroid/media/session/MediaController;

    .line 220
    .line 221
    invoke-virtual {p1, v1}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 222
    .line 223
    .line 224
    return v8

    .line 225
    :cond_d
    invoke-virtual {p0, v1, p1}, Lb7/c2;->a(Landroid/view/KeyEvent;Z)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    return p1

    .line 230
    :cond_e
    :goto_4
    return v4
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

.method public final n()Z
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcb/e0;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lb5/h;

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    invoke-direct {v1, v2, p0, v0}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lb7/c2;->o:Landroid/os/Handler;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v0}, Lcb/p;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    return v0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :catch_1
    move-exception v0

    .line 41
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :cond_0
    iget-object v0, p0, Lb7/c2;->w:Lb0/c1;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v0, v0, Lb0/c1;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lcom/cnl/kikoeru/MainService;

    .line 55
    .line 56
    sget v2, Lp4/c0;->a:I

    .line 57
    .line 58
    const/16 v3, 0x1f

    .line 59
    .line 60
    if-lt v2, v3, :cond_2

    .line 61
    .line 62
    const/16 v3, 0x21

    .line 63
    .line 64
    if-lt v2, v3, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v0}, Lcom/cnl/kikoeru/MainService;->c()Lb7/p1;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-boolean v2, v2, Lb7/p1;->j:Z

    .line 72
    .line 73
    if-nez v2, :cond_2

    .line 74
    .line 75
    iget-object v2, p0, Lb7/c2;->k:Lb7/v1;

    .line 76
    .line 77
    invoke-virtual {v0, v2, v1}, Lcom/cnl/kikoeru/MainService;->i(Lb7/v1;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    return v0

    .line 82
    :cond_2
    :goto_1
    return v1
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

.method public final o(Lb7/t1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lb7/c2;->r(Lb7/t1;)Lb7/t1;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lb7/c2;->e:Lpe/d;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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

.method public final p(Lb7/t1;Ljava/util/List;IJ)Lcb/e0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lb7/c2;->r(Lb7/t1;)Lb7/t1;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lb7/c2;->e:Lpe/d;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Lpe/d;->G(Ljava/util/List;)Lcb/y;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance p2, Lb7/q1;

    .line 14
    .line 15
    invoke-direct {p2, p3, p4, p5}, Lb7/q1;-><init>(IJ)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, Lp4/c0;->b0(Lcb/y;Lcb/q;)Lcb/e0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
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

.method public final q()V
    .locals 9

    .line 1
    const-string v0, "MediaSessionImpl"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Release "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, " [AndroidXMedia3/1.6.0-alpha01] ["

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget-object v2, Lp4/c0;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "] ["

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lm4/j0;->b()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, "]"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v0, v1}, Lp4/c;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lb7/c2;->a:Ljava/lang/Object;

    .line 56
    .line 57
    monitor-enter v0

    .line 58
    :try_start_0
    iget-boolean v1, p0, Lb7/c2;->y:Z

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_0
    const/4 v1, 0x1

    .line 68
    iput-boolean v1, p0, Lb7/c2;->y:Z

    .line 69
    .line 70
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    iget-object v0, p0, Lb7/c2;->d:Lb7/y1;

    .line 72
    .line 73
    iget-object v2, v0, Lb7/y1;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lb5/m;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 81
    .line 82
    .line 83
    iput-object v3, v0, Lb7/y1;->b:Ljava/lang/Object;

    .line 84
    .line 85
    :cond_1
    iget-object v0, p0, Lb7/c2;->l:Landroid/os/Handler;

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :try_start_1
    iget-object v0, p0, Lb7/c2;->l:Landroid/os/Handler;

    .line 91
    .line 92
    new-instance v2, Lb7/w1;

    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    invoke-direct {v2, p0, v4}, Lb7/w1;-><init>(Lb7/c2;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v2}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catch_0
    move-exception v0

    .line 103
    const-string v2, "MediaSessionImpl"

    .line 104
    .line 105
    const-string v4, "Exception thrown while closing"

    .line 106
    .line 107
    invoke-static {v2, v4, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    :goto_0
    iget-object v0, p0, Lb7/c2;->h:Lb7/o2;

    .line 111
    .line 112
    iget-object v2, v0, Lb7/o2;->m:Landroid/content/ComponentName;

    .line 113
    .line 114
    iget-object v4, v0, Lb7/o2;->g:Lb7/c2;

    .line 115
    .line 116
    iget-object v5, v0, Lb7/o2;->k:Lc7/e1;

    .line 117
    .line 118
    sget v6, Lp4/c0;->a:I

    .line 119
    .line 120
    const/16 v7, 0x1f

    .line 121
    .line 122
    if-ge v6, v7, :cond_3

    .line 123
    .line 124
    if-nez v2, :cond_2

    .line 125
    .line 126
    iget-object v2, v5, Lc7/e1;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v2, Lc7/w0;

    .line 129
    .line 130
    iget-object v2, v2, Lc7/w0;->a:Landroid/media/session/MediaSession;

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    new-instance v6, Landroid/content/Intent;

    .line 137
    .line 138
    const-string v7, "android.intent.action.MEDIA_BUTTON"

    .line 139
    .line 140
    iget-object v8, v4, Lb7/c2;->b:Landroid/net/Uri;

    .line 141
    .line 142
    invoke-direct {v6, v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 146
    .line 147
    .line 148
    iget-object v2, v4, Lb7/c2;->f:Lcom/cnl/kikoeru/MainService;

    .line 149
    .line 150
    sget v7, Lb7/o2;->r:I

    .line 151
    .line 152
    const/4 v8, 0x0

    .line 153
    invoke-static {v2, v8, v6, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iget-object v6, v5, Lc7/e1;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v6, Lc7/w0;

    .line 160
    .line 161
    iget-object v6, v6, Lc7/w0;->a:Landroid/media/session/MediaSession;

    .line 162
    .line 163
    invoke-virtual {v6, v2}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    .line 164
    .line 165
    .line 166
    :cond_3
    :goto_1
    iget-object v0, v0, Lb7/o2;->l:Lb7/m2;

    .line 167
    .line 168
    if-eqz v0, :cond_4

    .line 169
    .line 170
    iget-object v2, v4, Lb7/c2;->f:Lcom/cnl/kikoeru/MainService;

    .line 171
    .line 172
    invoke-virtual {v2, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 173
    .line 174
    .line 175
    :cond_4
    iget-object v0, v5, Lc7/e1;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lc7/w0;

    .line 178
    .line 179
    iget-object v2, v0, Lc7/w0;->a:Landroid/media/session/MediaSession;

    .line 180
    .line 181
    iget-object v4, v0, Lc7/w0;->f:Landroid/os/RemoteCallbackList;

    .line 182
    .line 183
    invoke-virtual {v4}, Landroid/os/RemoteCallbackList;->kill()V

    .line 184
    .line 185
    .line 186
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 187
    .line 188
    const/16 v5, 0x1b

    .line 189
    .line 190
    if-ne v4, v5, :cond_5

    .line 191
    .line 192
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    const-string v5, "mCallback"

    .line 197
    .line 198
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    check-cast v1, Landroid/os/Handler;

    .line 210
    .line 211
    if-eqz v1, :cond_5

    .line 212
    .line 213
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :catch_1
    move-exception v1

    .line 218
    const-string v4, "MediaSessionCompat"

    .line 219
    .line 220
    const-string v5, "Exception happened while accessing MediaSession.mCallback."

    .line 221
    .line 222
    invoke-static {v4, v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 223
    .line 224
    .line 225
    :cond_5
    :goto_2
    invoke-virtual {v2, v3}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, v0, Lc7/w0;->b:Lc7/v0;

    .line 229
    .line 230
    iget-object v0, v0, Lc7/v0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 231
    .line 232
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Landroid/media/session/MediaSession;->release()V

    .line 236
    .line 237
    .line 238
    iget-object v0, p0, Lb7/c2;->g:Lb7/q3;

    .line 239
    .line 240
    iget-object v1, v0, Lb7/q3;->g:Lb0/w1;

    .line 241
    .line 242
    invoke-virtual {v1}, Lb0/w1;->L()Lya/i0;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_7

    .line 255
    .line 256
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    check-cast v2, Lb7/t1;

    .line 261
    .line 262
    iget-object v2, v2, Lb7/t1;->d:Lb7/s1;

    .line 263
    .line 264
    if-eqz v2, :cond_6

    .line 265
    .line 266
    :try_start_3
    invoke-interface {v2}, Lb7/s1;->a()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :catch_2
    nop

    .line 271
    goto :goto_3

    .line 272
    :cond_7
    iget-object v0, v0, Lb7/q3;->h:Ljava/util/Set;

    .line 273
    .line 274
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_9

    .line 283
    .line 284
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Lb7/t1;

    .line 289
    .line 290
    iget-object v1, v1, Lb7/t1;->d:Lb7/s1;

    .line 291
    .line 292
    if-eqz v1, :cond_8

    .line 293
    .line 294
    :try_start_4
    invoke-interface {v1}, Lb7/s1;->a()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_3

    .line 295
    .line 296
    .line 297
    goto :goto_4

    .line 298
    :catch_3
    nop

    .line 299
    goto :goto_4

    .line 300
    :cond_9
    return-void

    .line 301
    :goto_5
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 302
    throw v1
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

.method public final r(Lb7/t1;)Lb7/t1;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb7/c2;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lb7/c2;->i(Lb7/t1;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lb7/c2;->d()Lb7/t1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object p1
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

.method public final s()V
    .locals 7

    .line 1
    iget-object v0, p0, Lb7/c2;->l:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lb7/c2;->n:Lb7/w1;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v2, p0, Lb7/c2;->q:Z

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    iget-wide v4, p0, Lb7/c2;->z:J

    .line 15
    .line 16
    cmp-long v6, v4, v2

    .line 17
    .line 18
    if-lez v6, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Lb7/c2;->t:Lb7/z3;

    .line 21
    .line 22
    invoke-virtual {v2}, Lb7/z3;->W()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lb7/c2;->t:Lb7/z3;

    .line 29
    .line 30
    invoke-virtual {v2}, Lb7/z3;->V()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
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
.end method

.method public final t()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lb7/c2;->l:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "Player callback method is called from a wrong thread. See javadoc of MediaSession for details."

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

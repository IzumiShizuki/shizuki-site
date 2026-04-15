.class public final Lbh/d;
.super Lbh/b;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public e:J

.field public f:Z

.field public final synthetic g:Lbh/h;


# direct methods
.method public constructor <init>(Lbh/h;Lug/t;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lbh/d;->g:Lbh/h;

    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lbh/b;-><init>(Lbh/h;Lug/t;)V

    .line 9
    .line 10
    .line 11
    const-wide/16 p1, -0x1

    .line 12
    .line 13
    iput-wide p1, p0, Lbh/d;->e:J

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lbh/d;->f:Z

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


# virtual methods
.method public final W(Llh/f;J)J
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    iget-object v4, v1, Lbh/d;->g:Lbh/h;

    .line 8
    .line 9
    iget-object v5, v4, Lbh/h;->c:Ltc/b0;

    .line 10
    .line 11
    const-string v6, "sink"

    .line 12
    .line 13
    invoke-static {v0, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    cmp-long v8, v2, v6

    .line 19
    .line 20
    if-ltz v8, :cond_10

    .line 21
    .line 22
    iget-boolean v8, v1, Lbh/b;->c:Z

    .line 23
    .line 24
    if-nez v8, :cond_f

    .line 25
    .line 26
    iget-boolean v8, v1, Lbh/d;->f:Z

    .line 27
    .line 28
    const-wide/16 v9, -0x1

    .line 29
    .line 30
    if-nez v8, :cond_0

    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_0
    iget-wide v11, v1, Lbh/d;->e:J

    .line 35
    .line 36
    cmp-long v8, v11, v6

    .line 37
    .line 38
    if-eqz v8, :cond_1

    .line 39
    .line 40
    cmp-long v8, v11, v9

    .line 41
    .line 42
    if-nez v8, :cond_c

    .line 43
    .line 44
    :cond_1
    cmp-long v8, v11, v9

    .line 45
    .line 46
    if-eqz v8, :cond_2

    .line 47
    .line 48
    iget-object v8, v5, Ltc/b0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Llh/b0;

    .line 51
    .line 52
    const-wide v11, 0x7fffffffffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-virtual {v8, v11, v12}, Llh/b0;->x(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    :cond_2
    :try_start_0
    iget-object v8, v5, Ltc/b0;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v8, Llh/b0;

    .line 63
    .line 64
    iget-object v11, v8, Llh/b0;->b:Llh/f;

    .line 65
    .line 66
    const-wide/16 v12, 0x1

    .line 67
    .line 68
    invoke-virtual {v8, v12, v13}, Llh/b0;->a0(J)V

    .line 69
    .line 70
    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v13, 0x0

    .line 73
    :goto_0
    add-int/lit8 v14, v13, 0x1

    .line 74
    .line 75
    move-wide v15, v6

    .line 76
    int-to-long v6, v14

    .line 77
    invoke-virtual {v8, v6, v7}, Llh/b0;->P(J)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_8

    .line 82
    .line 83
    int-to-long v6, v13

    .line 84
    invoke-virtual {v11, v6, v7}, Llh/f;->k(J)B

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    const/16 v7, 0x30

    .line 89
    .line 90
    if-lt v6, v7, :cond_3

    .line 91
    .line 92
    const/16 v7, 0x39

    .line 93
    .line 94
    if-le v6, v7, :cond_5

    .line 95
    .line 96
    :cond_3
    const/16 v7, 0x61

    .line 97
    .line 98
    if-lt v6, v7, :cond_4

    .line 99
    .line 100
    const/16 v7, 0x66

    .line 101
    .line 102
    if-le v6, v7, :cond_5

    .line 103
    .line 104
    :cond_4
    const/16 v7, 0x41

    .line 105
    .line 106
    if-lt v6, v7, :cond_6

    .line 107
    .line 108
    const/16 v7, 0x46

    .line 109
    .line 110
    if-le v6, v7, :cond_5

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    move v13, v14

    .line 114
    move-wide v6, v15

    .line 115
    goto :goto_0

    .line 116
    :cond_6
    :goto_1
    if-eqz v13, :cond_7

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 120
    .line 121
    const/16 v2, 0x10

    .line 122
    .line 123
    invoke-static {v2}, Lgh/g;->j(I)V

    .line 124
    .line 125
    .line 126
    invoke-static {v6, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-string v3, "toString(...)"

    .line 131
    .line 132
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v3, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 136
    .line 137
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v0, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_8
    :goto_2
    invoke-virtual {v11}, Llh/f;->B()J

    .line 146
    .line 147
    .line 148
    move-result-wide v6

    .line 149
    iput-wide v6, v1, Lbh/d;->e:J

    .line 150
    .line 151
    iget-object v5, v5, Ltc/b0;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v5, Llh/b0;

    .line 154
    .line 155
    const-wide v6, 0x7fffffffffffffffL

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    invoke-virtual {v5, v6, v7}, Llh/b0;->x(J)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v5}, Lef/n;->X0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    iget-wide v6, v1, Lbh/d;->e:J

    .line 173
    .line 174
    cmp-long v8, v6, v15

    .line 175
    .line 176
    if-ltz v8, :cond_e

    .line 177
    .line 178
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-lez v6, :cond_9

    .line 183
    .line 184
    const-string v6, ";"

    .line 185
    .line 186
    invoke-static {v5, v6, v12}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 187
    .line 188
    .line 189
    move-result v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    if-eqz v6, :cond_e

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :catch_0
    move-exception v0

    .line 194
    goto/16 :goto_7

    .line 195
    .line 196
    :cond_9
    :goto_3
    iget-wide v5, v1, Lbh/d;->e:J

    .line 197
    .line 198
    cmp-long v7, v5, v15

    .line 199
    .line 200
    if-nez v7, :cond_b

    .line 201
    .line 202
    iput-boolean v12, v1, Lbh/d;->f:Z

    .line 203
    .line 204
    iget-object v5, v4, Lbh/h;->e:Lbh/a;

    .line 205
    .line 206
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    new-instance v6, Lhd/q0;

    .line 210
    .line 211
    const/4 v7, 0x5

    .line 212
    const/4 v8, 0x0

    .line 213
    invoke-direct {v6, v8, v7}, Lhd/q0;-><init>(BI)V

    .line 214
    .line 215
    .line 216
    :goto_4
    iget-object v7, v5, Lbh/a;->c:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v7, Llh/h;

    .line 219
    .line 220
    iget-wide v11, v5, Lbh/a;->b:J

    .line 221
    .line 222
    invoke-interface {v7, v11, v12}, Llh/h;->x(J)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    iget-wide v11, v5, Lbh/a;->b:J

    .line 227
    .line 228
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    int-to-long v13, v8

    .line 233
    sub-long/2addr v11, v13

    .line 234
    iput-wide v11, v5, Lbh/a;->b:J

    .line 235
    .line 236
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-nez v8, :cond_a

    .line 241
    .line 242
    invoke-virtual {v6}, Lhd/q0;->k()Lug/r;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v1, v5}, Lbh/b;->b(Lug/r;)V

    .line 247
    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_a
    invoke-virtual {v6, v7}, Lhd/q0;->h(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_b
    :goto_5
    iget-boolean v5, v1, Lbh/d;->f:Z

    .line 255
    .line 256
    if-nez v5, :cond_c

    .line 257
    .line 258
    :goto_6
    return-wide v9

    .line 259
    :cond_c
    iget-wide v5, v1, Lbh/d;->e:J

    .line 260
    .line 261
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 262
    .line 263
    .line 264
    move-result-wide v2

    .line 265
    invoke-super {v1, v0, v2, v3}, Lbh/b;->W(Llh/f;J)J

    .line 266
    .line 267
    .line 268
    move-result-wide v2

    .line 269
    cmp-long v0, v2, v9

    .line 270
    .line 271
    if-eqz v0, :cond_d

    .line 272
    .line 273
    iget-wide v4, v1, Lbh/d;->e:J

    .line 274
    .line 275
    sub-long/2addr v4, v2

    .line 276
    iput-wide v4, v1, Lbh/d;->e:J

    .line 277
    .line 278
    return-wide v2

    .line 279
    :cond_d
    iget-object v0, v4, Lbh/h;->b:Lah/e;

    .line 280
    .line 281
    invoke-interface {v0}, Lah/e;->f()V

    .line 282
    .line 283
    .line 284
    new-instance v0, Ljava/net/ProtocolException;

    .line 285
    .line 286
    const-string v2, "unexpected end of stream"

    .line 287
    .line 288
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    sget-object v2, Lbh/h;->f:Lug/r;

    .line 292
    .line 293
    invoke-virtual {v1, v2}, Lbh/b;->b(Lug/r;)V

    .line 294
    .line 295
    .line 296
    throw v0

    .line 297
    :cond_e
    :try_start_1
    new-instance v0, Ljava/net/ProtocolException;

    .line 298
    .line 299
    new-instance v2, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 302
    .line 303
    .line 304
    const-string v3, "expected chunk size and optional extensions but was \""

    .line 305
    .line 306
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    iget-wide v3, v1, Lbh/d;->e:J

    .line 310
    .line 311
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const/16 v3, 0x22

    .line 318
    .line 319
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 330
    :goto_7
    new-instance v2, Ljava/net/ProtocolException;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-direct {v2, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v2

    .line 340
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 341
    .line 342
    const-string v2, "closed"

    .line 343
    .line 344
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v0

    .line 348
    :cond_10
    const-string v0, "byteCount < 0: "

    .line 349
    .line 350
    invoke-static {v2, v3, v0}, Lj2/h0;->i(JLjava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw v2
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

.method public final close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lbh/b;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lbh/d;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    sget-object v1, Lwg/g;->a:Ljava/util/TimeZone;

    .line 13
    .line 14
    const-string v1, "timeUnit"

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x64

    .line 20
    .line 21
    :try_start_0
    invoke-static {p0, v0}, Lwg/g;->f(Llh/h0;I)Z

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lbh/d;->g:Lbh/h;

    .line 30
    .line 31
    iget-object v0, v0, Lbh/h;->b:Lah/e;

    .line 32
    .line 33
    invoke-interface {v0}, Lah/e;->f()V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lbh/h;->f:Lug/r;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lbh/b;->b(Lug/r;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lbh/b;->c:Z

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
.end method

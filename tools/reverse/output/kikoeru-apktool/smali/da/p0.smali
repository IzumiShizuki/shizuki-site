.class public final synthetic Lda/p0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lna/u;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lda/p0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/p0;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lda/p0;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lda/p0;->a:I

    iput-boolean p1, p0, Lda/p0;->b:Z

    iput-object p2, p0, Lda/p0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lda/p0;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lda/p0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lna/u;

    .line 11
    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    check-cast v2, Lka/g;

    .line 15
    .line 16
    move-object/from16 v12, p2

    .line 17
    .line 18
    check-cast v12, Lx0/o;

    .line 19
    .line 20
    move-object/from16 v3, p3

    .line 21
    .line 22
    check-cast v3, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const-string v4, "it"

    .line 29
    .line 30
    invoke-static {v2, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    and-int/lit8 v4, v3, 0x6

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v12, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    const/4 v4, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v4, 0x2

    .line 46
    :goto_0
    or-int/2addr v3, v4

    .line 47
    :cond_1
    and-int/lit8 v4, v3, 0x13

    .line 48
    .line 49
    const/16 v5, 0x12

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    if-eq v4, v5, :cond_2

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/4 v4, 0x0

    .line 57
    :goto_1
    and-int/2addr v3, v6

    .line 58
    invoke-virtual {v12, v3, v4}, Lx0/o;->N(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    new-instance v3, Lm0/z2;

    .line 65
    .line 66
    iget-boolean v4, v0, Lda/p0;->b:Z

    .line 67
    .line 68
    invoke-direct {v3, v1, v4, v2}, Lm0/z2;-><init>(Lna/u;ZLka/g;)V

    .line 69
    .line 70
    .line 71
    const v1, 0x2b884bf3

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v3, v12}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    const/high16 v13, 0x180000

    .line 79
    .line 80
    const/16 v14, 0x3f

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    const/4 v4, 0x0

    .line 84
    const-wide/16 v5, 0x0

    .line 85
    .line 86
    const-wide/16 v7, 0x0

    .line 87
    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    invoke-static/range {v3 .. v14}, Landroid/support/v4/media/session/b;->m(Lj1/q;Lq1/l0;JJLs/o;FLf1/f;Lx0/o;II)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-virtual {v12}, Lx0/o;->Q()V

    .line 95
    .line 96
    .line 97
    :goto_2
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 98
    .line 99
    return-object v1

    .line 100
    :pswitch_0
    iget-object v1, v0, Lda/p0;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Ljava/lang/String;

    .line 103
    .line 104
    move-object/from16 v2, p1

    .line 105
    .line 106
    check-cast v2, Ly/k1;

    .line 107
    .line 108
    move-object/from16 v3, p2

    .line 109
    .line 110
    check-cast v3, Lx0/o;

    .line 111
    .line 112
    move-object/from16 v4, p3

    .line 113
    .line 114
    check-cast v4, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    const-string v5, "$this$LongClickChip"

    .line 121
    .line 122
    invoke-static {v2, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    and-int/lit8 v2, v4, 0x11

    .line 126
    .line 127
    const/16 v5, 0x10

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    const/4 v7, 0x1

    .line 131
    if-eq v2, v5, :cond_4

    .line 132
    .line 133
    const/4 v2, 0x1

    .line 134
    goto :goto_3

    .line 135
    :cond_4
    const/4 v2, 0x0

    .line 136
    :goto_3
    and-int/2addr v4, v7

    .line 137
    invoke-virtual {v3, v4, v2}, Lx0/o;->N(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    iget-boolean v2, v0, Lda/p0;->b:Z

    .line 144
    .line 145
    if-nez v2, :cond_5

    .line 146
    .line 147
    const v4, -0xabf9b74

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v4}, Lx0/o;->W(I)V

    .line 151
    .line 152
    .line 153
    sget-object v4, Lm0/z8;->a:Lx0/z;

    .line 154
    .line 155
    invoke-virtual {v3, v4}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Lt2/l0;

    .line 160
    .line 161
    :goto_4
    invoke-virtual {v3, v6}, Lx0/o;->p(Z)V

    .line 162
    .line 163
    .line 164
    move-object/from16 v21, v4

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_5
    const v4, -0x4d3375eb

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v4}, Lx0/o;->W(I)V

    .line 171
    .line 172
    .line 173
    sget-object v4, Lm0/z8;->a:Lx0/z;

    .line 174
    .line 175
    invoke-virtual {v3, v4}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    move-object v8, v4

    .line 180
    check-cast v8, Lt2/l0;

    .line 181
    .line 182
    sget-object v4, Lm0/j1;->a:Lx0/z;

    .line 183
    .line 184
    invoke-virtual {v3, v4}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    check-cast v4, Lq1/q;

    .line 189
    .line 190
    iget-wide v4, v4, Lq1/q;->a:J

    .line 191
    .line 192
    const v9, 0x3f19999a    # 0.6f

    .line 193
    .line 194
    .line 195
    invoke-static {v9, v4, v5}, Lq1/q;->b(FJ)J

    .line 196
    .line 197
    .line 198
    move-result-wide v9

    .line 199
    new-instance v14, Lx2/i;

    .line 200
    .line 201
    invoke-direct {v14, v7}, Lx2/i;-><init>(I)V

    .line 202
    .line 203
    .line 204
    const/16 v23, 0x0

    .line 205
    .line 206
    const v24, 0xffeff6

    .line 207
    .line 208
    .line 209
    const-wide/16 v11, 0x0

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const/4 v15, 0x0

    .line 213
    const-wide/16 v16, 0x0

    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    const/16 v19, 0x0

    .line 218
    .line 219
    const-wide/16 v20, 0x0

    .line 220
    .line 221
    const/16 v22, 0x0

    .line 222
    .line 223
    invoke-static/range {v8 .. v24}, Lt2/l0;->a(Lt2/l0;JJLx2/k;Lx2/i;Lx2/n;JLq1/k0;Ls1/h;JLt2/w;Le3/i;I)Lt2/l0;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    goto :goto_4

    .line 228
    :goto_5
    if-eqz v2, :cond_6

    .line 229
    .line 230
    const-string v2, "?"

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_6
    const-string v2, ""

    .line 234
    .line 235
    :goto_6
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    const/16 v24, 0xc30

    .line 240
    .line 241
    const v25, 0xd7fe

    .line 242
    .line 243
    .line 244
    const/4 v4, 0x0

    .line 245
    const-wide/16 v5, 0x0

    .line 246
    .line 247
    const-wide/16 v7, 0x0

    .line 248
    .line 249
    const/4 v9, 0x0

    .line 250
    const/4 v10, 0x0

    .line 251
    const-wide/16 v11, 0x0

    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    const/4 v14, 0x0

    .line 255
    const-wide/16 v15, 0x0

    .line 256
    .line 257
    const/16 v17, 0x2

    .line 258
    .line 259
    const/16 v18, 0x0

    .line 260
    .line 261
    const/16 v19, 0x1

    .line 262
    .line 263
    const/16 v20, 0x0

    .line 264
    .line 265
    const/16 v23, 0x0

    .line 266
    .line 267
    move-object/from16 v22, v3

    .line 268
    .line 269
    move-object v3, v1

    .line 270
    invoke-static/range {v3 .. v25}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 271
    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_7
    move-object/from16 v22, v3

    .line 275
    .line 276
    invoke-virtual/range {v22 .. v22}, Lx0/o;->Q()V

    .line 277
    .line 278
    .line 279
    :goto_7
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 280
    .line 281
    return-object v1

    .line 282
    :pswitch_1
    iget-object v1, v0, Lda/p0;->c:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v1, Lic/a;

    .line 285
    .line 286
    move-object/from16 v2, p1

    .line 287
    .line 288
    check-cast v2, La0/d;

    .line 289
    .line 290
    move-object/from16 v10, p2

    .line 291
    .line 292
    check-cast v10, Lx0/o;

    .line 293
    .line 294
    move-object/from16 v3, p3

    .line 295
    .line 296
    check-cast v3, Ljava/lang/Integer;

    .line 297
    .line 298
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    const-string v4, "$this$item"

    .line 303
    .line 304
    invoke-static {v2, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    and-int/lit8 v2, v3, 0x11

    .line 308
    .line 309
    const/16 v4, 0x10

    .line 310
    .line 311
    const/4 v5, 0x1

    .line 312
    if-eq v2, v4, :cond_8

    .line 313
    .line 314
    const/4 v2, 0x1

    .line 315
    goto :goto_8

    .line 316
    :cond_8
    const/4 v2, 0x0

    .line 317
    :goto_8
    and-int/2addr v3, v5

    .line 318
    invoke-virtual {v10, v3, v2}, Lx0/o;->N(IZ)Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    if-eqz v2, :cond_b

    .line 323
    .line 324
    invoke-static {}, Ln7/b0;->m()Lw1/f;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    const v2, 0x7f0c0152

    .line 329
    .line 330
    .line 331
    invoke-static {v2}, Lna/q;->g(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-virtual {v10, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    invoke-virtual {v10}, Lx0/o;->K()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    if-nez v2, :cond_9

    .line 344
    .line 345
    sget-object v2, Lx0/k;->a:Lx0/r0;

    .line 346
    .line 347
    if-ne v5, v2, :cond_a

    .line 348
    .line 349
    :cond_9
    new-instance v5, Lba/j;

    .line 350
    .line 351
    const/4 v2, 0x2

    .line 352
    invoke-direct {v5, v2, v1}, Lba/j;-><init>(ILic/a;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v10, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    :cond_a
    move-object v8, v5

    .line 359
    check-cast v8, Lic/a;

    .line 360
    .line 361
    const/4 v11, 0x0

    .line 362
    const/16 v12, 0x54

    .line 363
    .line 364
    const/4 v5, 0x0

    .line 365
    iget-boolean v6, v0, Lda/p0;->b:Z

    .line 366
    .line 367
    const/4 v7, 0x0

    .line 368
    const/4 v9, 0x0

    .line 369
    invoke-static/range {v3 .. v12}, Lda/a;->e(Lw1/f;Ljava/lang/String;Ljava/lang/String;ZILic/a;Lic/a;Lx0/o;II)V

    .line 370
    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_b
    invoke-virtual {v10}, Lx0/o;->Q()V

    .line 374
    .line 375
    .line 376
    :goto_9
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 377
    .line 378
    return-object v1

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

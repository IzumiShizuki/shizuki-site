.class public final synthetic Lq9/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lbg/p;


# direct methods
.method public synthetic constructor <init>(Lbg/p;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq9/f;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lq9/f;->b:Lbg/p;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lq9/f;->a:I

    .line 4
    .line 5
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 6
    .line 7
    iget-object v3, v0, Lq9/f;->b:Lbg/p;

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x3

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, Lx0/o;

    .line 18
    .line 19
    move-object/from16 v8, p2

    .line 20
    .line 21
    check-cast v8, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    and-int/lit8 v9, v8, 0x3

    .line 28
    .line 29
    if-eq v9, v5, :cond_0

    .line 30
    .line 31
    const/4 v9, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v9, 0x0

    .line 34
    :goto_0
    and-int/2addr v8, v6

    .line 35
    invoke-virtual {v1, v8, v9}, Lx0/o;->N(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-eqz v8, :cond_1

    .line 40
    .line 41
    iget-object v8, v3, Lbg/p;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v9, v3, Lbg/p;->f:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v10, v3, Lbg/p;->g:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v11, v3, Lbg/p;->b:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v12, Lna/o;->e:Lub/p;

    .line 50
    .line 51
    invoke-virtual {v12}, Lub/p;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    check-cast v12, [Ljava/lang/String;

    .line 56
    .line 57
    iget v13, v3, Lbg/p;->c:I

    .line 58
    .line 59
    aget-object v12, v12, v13

    .line 60
    .line 61
    iget-object v13, v3, Lbg/p;->d:Ljava/lang/String;

    .line 62
    .line 63
    iget v14, v3, Lbg/p;->e:I

    .line 64
    .line 65
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    iget-object v15, v3, Lbg/p;->h:Ljava/lang/String;

    .line 70
    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    iget-object v4, v3, Lbg/p;->i:Ljava/lang/String;

    .line 74
    .line 75
    iget v3, v3, Lbg/p;->j:I

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const/16 v17, 0x1

    .line 82
    .line 83
    const/16 v6, 0xa

    .line 84
    .line 85
    new-array v6, v6, [Ljava/lang/Object;

    .line 86
    .line 87
    aput-object v8, v6, v16

    .line 88
    .line 89
    aput-object v9, v6, v17

    .line 90
    .line 91
    aput-object v10, v6, v5

    .line 92
    .line 93
    aput-object v11, v6, v7

    .line 94
    .line 95
    const/4 v5, 0x4

    .line 96
    aput-object v12, v6, v5

    .line 97
    .line 98
    const/4 v5, 0x5

    .line 99
    aput-object v13, v6, v5

    .line 100
    .line 101
    const/4 v5, 0x6

    .line 102
    aput-object v14, v6, v5

    .line 103
    .line 104
    const/4 v5, 0x7

    .line 105
    aput-object v15, v6, v5

    .line 106
    .line 107
    const/16 v5, 0x8

    .line 108
    .line 109
    aput-object v4, v6, v5

    .line 110
    .line 111
    const/16 v4, 0x9

    .line 112
    .line 113
    aput-object v3, v6, v4

    .line 114
    .line 115
    const v3, 0x7f0c0181

    .line 116
    .line 117
    .line 118
    invoke-static {v3, v6}, Lna/q;->h(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    const/16 v29, 0x0

    .line 123
    .line 124
    const v30, 0x1fffe

    .line 125
    .line 126
    .line 127
    const/4 v9, 0x0

    .line 128
    const-wide/16 v10, 0x0

    .line 129
    .line 130
    const-wide/16 v12, 0x0

    .line 131
    .line 132
    const/4 v14, 0x0

    .line 133
    const/4 v15, 0x0

    .line 134
    const-wide/16 v16, 0x0

    .line 135
    .line 136
    const/16 v18, 0x0

    .line 137
    .line 138
    const/16 v19, 0x0

    .line 139
    .line 140
    const-wide/16 v20, 0x0

    .line 141
    .line 142
    const/16 v22, 0x0

    .line 143
    .line 144
    const/16 v23, 0x0

    .line 145
    .line 146
    const/16 v24, 0x0

    .line 147
    .line 148
    const/16 v25, 0x0

    .line 149
    .line 150
    const/16 v26, 0x0

    .line 151
    .line 152
    const/16 v28, 0x0

    .line 153
    .line 154
    move-object/from16 v27, v1

    .line 155
    .line 156
    invoke-static/range {v8 .. v30}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_1
    move-object/from16 v27, v1

    .line 161
    .line 162
    invoke-virtual/range {v27 .. v27}, Lx0/o;->Q()V

    .line 163
    .line 164
    .line 165
    :goto_1
    return-object v2

    .line 166
    :pswitch_0
    const/16 v16, 0x0

    .line 167
    .line 168
    const/16 v17, 0x1

    .line 169
    .line 170
    move-object/from16 v1, p1

    .line 171
    .line 172
    check-cast v1, Lx0/o;

    .line 173
    .line 174
    move-object/from16 v4, p2

    .line 175
    .line 176
    check-cast v4, Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    and-int/lit8 v6, v4, 0x3

    .line 183
    .line 184
    if-eq v6, v5, :cond_2

    .line 185
    .line 186
    const/4 v5, 0x1

    .line 187
    goto :goto_2

    .line 188
    :cond_2
    const/4 v5, 0x0

    .line 189
    :goto_2
    and-int/lit8 v4, v4, 0x1

    .line 190
    .line 191
    invoke-virtual {v1, v4, v5}, Lx0/o;->N(IZ)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-eqz v4, :cond_3

    .line 196
    .line 197
    new-instance v4, Lq9/f;

    .line 198
    .line 199
    invoke-direct {v4, v3, v7}, Lq9/f;-><init>(Lbg/p;I)V

    .line 200
    .line 201
    .line 202
    const v3, 0x3a5e96f8

    .line 203
    .line 204
    .line 205
    invoke-static {v3, v4, v1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    const/16 v4, 0x30

    .line 210
    .line 211
    const/4 v5, 0x0

    .line 212
    const/4 v6, 0x1

    .line 213
    invoke-static {v5, v3, v1, v4, v6}, Ll0/u0;->b(Lj1/q;Lf1/f;Lx0/o;II)V

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_3
    invoke-virtual {v1}, Lx0/o;->Q()V

    .line 218
    .line 219
    .line 220
    :goto_3
    return-object v2

    .line 221
    :pswitch_1
    const/16 v16, 0x0

    .line 222
    .line 223
    move-object/from16 v1, p1

    .line 224
    .line 225
    check-cast v1, Lx0/o;

    .line 226
    .line 227
    move-object/from16 v4, p2

    .line 228
    .line 229
    check-cast v4, Ljava/lang/Integer;

    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    and-int/lit8 v6, v4, 0x3

    .line 236
    .line 237
    if-eq v6, v5, :cond_4

    .line 238
    .line 239
    const/4 v5, 0x1

    .line 240
    :goto_4
    const/16 v17, 0x1

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_4
    const/4 v5, 0x0

    .line 244
    goto :goto_4

    .line 245
    :goto_5
    and-int/lit8 v4, v4, 0x1

    .line 246
    .line 247
    invoke-virtual {v1, v4, v5}, Lx0/o;->N(IZ)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_6

    .line 252
    .line 253
    iget-object v3, v3, Lbg/p;->a:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    if-nez v3, :cond_5

    .line 260
    .line 261
    const v3, 0x7f0c004a

    .line 262
    .line 263
    .line 264
    invoke-static {v3}, Lna/q;->g(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    :goto_6
    move-object v7, v3

    .line 269
    goto :goto_7

    .line 270
    :cond_5
    const v3, 0x7f0c0079

    .line 271
    .line 272
    .line 273
    invoke-static {v3}, Lna/q;->g(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    goto :goto_6

    .line 278
    :goto_7
    const/16 v28, 0x0

    .line 279
    .line 280
    const v29, 0x1fffe

    .line 281
    .line 282
    .line 283
    const/4 v8, 0x0

    .line 284
    const-wide/16 v9, 0x0

    .line 285
    .line 286
    const-wide/16 v11, 0x0

    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const/4 v14, 0x0

    .line 290
    const-wide/16 v15, 0x0

    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const/16 v18, 0x0

    .line 295
    .line 296
    const-wide/16 v19, 0x0

    .line 297
    .line 298
    const/16 v21, 0x0

    .line 299
    .line 300
    const/16 v22, 0x0

    .line 301
    .line 302
    const/16 v23, 0x0

    .line 303
    .line 304
    const/16 v24, 0x0

    .line 305
    .line 306
    const/16 v25, 0x0

    .line 307
    .line 308
    const/16 v27, 0x0

    .line 309
    .line 310
    move-object/from16 v26, v1

    .line 311
    .line 312
    invoke-static/range {v7 .. v29}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 313
    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_6
    move-object/from16 v26, v1

    .line 317
    .line 318
    invoke-virtual/range {v26 .. v26}, Lx0/o;->Q()V

    .line 319
    .line 320
    .line 321
    :goto_8
    return-object v2

    .line 322
    :pswitch_2
    const/16 v16, 0x0

    .line 323
    .line 324
    move-object/from16 v1, p1

    .line 325
    .line 326
    check-cast v1, Lx0/o;

    .line 327
    .line 328
    move-object/from16 v4, p2

    .line 329
    .line 330
    check-cast v4, Ljava/lang/Integer;

    .line 331
    .line 332
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    and-int/lit8 v6, v4, 0x3

    .line 337
    .line 338
    if-eq v6, v5, :cond_7

    .line 339
    .line 340
    const/4 v5, 0x1

    .line 341
    :goto_9
    const/16 v17, 0x1

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :cond_7
    const/4 v5, 0x0

    .line 345
    goto :goto_9

    .line 346
    :goto_a
    and-int/lit8 v4, v4, 0x1

    .line 347
    .line 348
    invoke-virtual {v1, v4, v5}, Lx0/o;->N(IZ)Z

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-eqz v4, :cond_a

    .line 353
    .line 354
    if-eqz v3, :cond_8

    .line 355
    .line 356
    invoke-static {v3}, Lna/o;->a(Lbg/p;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    if-nez v3, :cond_9

    .line 361
    .line 362
    :cond_8
    const v3, 0x7f0c013a

    .line 363
    .line 364
    .line 365
    invoke-static {v3}, Lna/q;->g(I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    :cond_9
    const/16 v24, 0x0

    .line 370
    .line 371
    const v25, 0x1fffe

    .line 372
    .line 373
    .line 374
    const/4 v4, 0x0

    .line 375
    const-wide/16 v5, 0x0

    .line 376
    .line 377
    const-wide/16 v7, 0x0

    .line 378
    .line 379
    const/4 v9, 0x0

    .line 380
    const/4 v10, 0x0

    .line 381
    const-wide/16 v11, 0x0

    .line 382
    .line 383
    const/4 v13, 0x0

    .line 384
    const/4 v14, 0x0

    .line 385
    const-wide/16 v15, 0x0

    .line 386
    .line 387
    const/16 v17, 0x0

    .line 388
    .line 389
    const/16 v18, 0x0

    .line 390
    .line 391
    const/16 v19, 0x0

    .line 392
    .line 393
    const/16 v20, 0x0

    .line 394
    .line 395
    const/16 v21, 0x0

    .line 396
    .line 397
    const/16 v23, 0x0

    .line 398
    .line 399
    move-object/from16 v22, v1

    .line 400
    .line 401
    invoke-static/range {v3 .. v25}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 402
    .line 403
    .line 404
    goto :goto_b

    .line 405
    :cond_a
    move-object/from16 v22, v1

    .line 406
    .line 407
    invoke-virtual/range {v22 .. v22}, Lx0/o;->Q()V

    .line 408
    .line 409
    .line 410
    :goto_b
    return-object v2

    .line 411
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.class public final synthetic Lm9/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lx0/w0;

.field public final synthetic c:Lx0/w0;


# direct methods
.method public synthetic constructor <init>(Lx0/w0;Lx0/w0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lm9/g;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm9/g;->b:Lx0/w0;

    .line 4
    .line 5
    iput-object p2, p0, Lm9/g;->c:Lx0/w0;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lm9/g;->a:I

    .line 2
    .line 3
    check-cast p1, Ly/w;

    .line 4
    .line 5
    move-object v5, p2

    .line 6
    check-cast v5, Lx0/o;

    .line 7
    .line 8
    check-cast p3, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const-string p3, "$this$ExposedDropdownMenu"

    .line 18
    .line 19
    invoke-static {p1, p3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    and-int/lit8 p1, p2, 0x11

    .line 23
    .line 24
    const/16 p3, 0x10

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-eq p1, p3, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    :goto_0
    and-int/2addr p2, v1

    .line 34
    invoke-virtual {v5, p2, p1}, Lx0/o;->N(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    invoke-static {}, Lt9/a;->values()[Lt9/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    array-length p2, p1

    .line 45
    const/4 p3, 0x0

    .line 46
    :goto_1
    if-ge p3, p2, :cond_4

    .line 47
    .line 48
    aget-object v0, p1, p3

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v5, v1}, Lx0/o;->d(I)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {v5}, Lx0/o;->K()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    sget-object v1, Lx0/k;->a:Lx0/r0;

    .line 65
    .line 66
    if-ne v2, v1, :cond_2

    .line 67
    .line 68
    :cond_1
    new-instance v2, Lba/c;

    .line 69
    .line 70
    const/16 v1, 0x19

    .line 71
    .line 72
    iget-object v3, p0, Lm9/g;->b:Lx0/w0;

    .line 73
    .line 74
    iget-object v4, p0, Lm9/g;->c:Lx0/w0;

    .line 75
    .line 76
    invoke-direct {v2, v0, v3, v4, v1}, Lba/c;-><init>(Ljava/lang/Object;Lx0/w0;Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    check-cast v2, Lic/a;

    .line 83
    .line 84
    new-instance v1, Lba/l;

    .line 85
    .line 86
    const/16 v3, 0xd

    .line 87
    .line 88
    invoke-direct {v1, v3, v0}, Lba/l;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const v0, -0x6b0dabe0

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1, v5}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const/high16 v6, 0x30000

    .line 99
    .line 100
    const/16 v7, 0x1e

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    move-object v0, v2

    .line 104
    const/4 v2, 0x0

    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-static/range {v0 .. v7}, Lm0/b0;->b(Lic/a;Lj1/q;ZLy/d1;Lic/o;Lx0/o;II)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 p3, p3, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 113
    .line 114
    .line 115
    :cond_4
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 116
    .line 117
    return-object p1

    .line 118
    :pswitch_0
    const-string p3, "$this$ExposedDropdownMenu"

    .line 119
    .line 120
    invoke-static {p1, p3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    and-int/lit8 p1, p2, 0x11

    .line 124
    .line 125
    const/16 p3, 0x10

    .line 126
    .line 127
    const/4 v0, 0x1

    .line 128
    if-eq p1, p3, :cond_5

    .line 129
    .line 130
    const/4 p1, 0x1

    .line 131
    goto :goto_2

    .line 132
    :cond_5
    const/4 p1, 0x0

    .line 133
    :goto_2
    and-int/2addr p2, v0

    .line 134
    invoke-virtual {v5, p2, p1}, Lx0/o;->N(IZ)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_8

    .line 139
    .line 140
    sget-object p1, Lna/o;->e:Lub/p;

    .line 141
    .line 142
    invoke-virtual {p1}, Lub/p;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, [Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {p1}, Lvb/l;->O0([Ljava/lang/Object;)Ldf/o;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p1}, Ldf/o;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    :goto_3
    move-object p2, p1

    .line 157
    check-cast p2, Ldf/b;

    .line 158
    .line 159
    iget-object p3, p2, Ldf/b;->b:Ljava/util/Iterator;

    .line 160
    .line 161
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result p3

    .line 165
    if-eqz p3, :cond_9

    .line 166
    .line 167
    invoke-virtual {p2}, Ldf/b;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    check-cast p2, Lvb/u;

    .line 172
    .line 173
    invoke-virtual {v5, p2}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result p3

    .line 177
    invoke-virtual {v5}, Lx0/o;->K()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-nez p3, :cond_6

    .line 182
    .line 183
    sget-object p3, Lx0/k;->a:Lx0/r0;

    .line 184
    .line 185
    if-ne v0, p3, :cond_7

    .line 186
    .line 187
    :cond_6
    new-instance v0, Lba/c;

    .line 188
    .line 189
    const/16 p3, 0x12

    .line 190
    .line 191
    iget-object v1, p0, Lm9/g;->b:Lx0/w0;

    .line 192
    .line 193
    iget-object v2, p0, Lm9/g;->c:Lx0/w0;

    .line 194
    .line 195
    invoke-direct {v0, p2, v1, v2, p3}, Lba/c;-><init>(Ljava/lang/Object;Lx0/w0;Ljava/lang/Object;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v0}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_7
    check-cast v0, Lic/a;

    .line 202
    .line 203
    new-instance p3, Lba/l;

    .line 204
    .line 205
    const/16 v1, 0x9

    .line 206
    .line 207
    invoke-direct {p3, v1, p2}, Lba/l;-><init>(ILjava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    const p2, -0x424689f5

    .line 211
    .line 212
    .line 213
    invoke-static {p2, p3, v5}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    const/high16 v6, 0x30000

    .line 218
    .line 219
    const/16 v7, 0x1e

    .line 220
    .line 221
    const/4 v1, 0x0

    .line 222
    const/4 v2, 0x0

    .line 223
    const/4 v3, 0x0

    .line 224
    invoke-static/range {v0 .. v7}, Lm0/b0;->b(Lic/a;Lj1/q;ZLy/d1;Lic/o;Lx0/o;II)V

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_8
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 229
    .line 230
    .line 231
    :cond_9
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 232
    .line 233
    return-object p1

    .line 234
    :pswitch_1
    const-string p3, "$this$ExposedDropdownMenu"

    .line 235
    .line 236
    invoke-static {p1, p3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    and-int/lit8 p1, p2, 0x11

    .line 240
    .line 241
    const/16 p3, 0x10

    .line 242
    .line 243
    const/4 v0, 0x1

    .line 244
    if-eq p1, p3, :cond_a

    .line 245
    .line 246
    const/4 p1, 0x1

    .line 247
    goto :goto_4

    .line 248
    :cond_a
    const/4 p1, 0x0

    .line 249
    :goto_4
    and-int/2addr p2, v0

    .line 250
    invoke-virtual {v5, p2, p1}, Lx0/o;->N(IZ)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_d

    .line 255
    .line 256
    sget-object p1, Lg9/a;->e:Ljava/util/List;

    .line 257
    .line 258
    check-cast p1, Ljava/lang/Iterable;

    .line 259
    .line 260
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    if-eqz p2, :cond_e

    .line 269
    .line 270
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p2

    .line 274
    check-cast p2, Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v5, p2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result p3

    .line 280
    invoke-virtual {v5}, Lx0/o;->K()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-nez p3, :cond_b

    .line 285
    .line 286
    sget-object p3, Lx0/k;->a:Lx0/r0;

    .line 287
    .line 288
    if-ne v0, p3, :cond_c

    .line 289
    .line 290
    :cond_b
    new-instance v0, Lba/c;

    .line 291
    .line 292
    const/16 p3, 0xf

    .line 293
    .line 294
    iget-object v1, p0, Lm9/g;->b:Lx0/w0;

    .line 295
    .line 296
    iget-object v2, p0, Lm9/g;->c:Lx0/w0;

    .line 297
    .line 298
    invoke-direct {v0, p2, v1, v2, p3}, Lba/c;-><init>(Ljava/lang/Object;Lx0/w0;Ljava/lang/Object;I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v5, v0}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :cond_c
    check-cast v0, Lic/a;

    .line 305
    .line 306
    new-instance p3, Li9/k;

    .line 307
    .line 308
    const/4 v1, 0x1

    .line 309
    invoke-direct {p3, v1, p2}, Li9/k;-><init>(ILjava/lang/String;)V

    .line 310
    .line 311
    .line 312
    const p2, 0x1ea98b7d

    .line 313
    .line 314
    .line 315
    invoke-static {p2, p3, v5}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    const/high16 v6, 0x30000

    .line 320
    .line 321
    const/16 v7, 0x1e

    .line 322
    .line 323
    const/4 v1, 0x0

    .line 324
    const/4 v2, 0x0

    .line 325
    const/4 v3, 0x0

    .line 326
    invoke-static/range {v0 .. v7}, Lm0/b0;->b(Lic/a;Lj1/q;ZLy/d1;Lic/o;Lx0/o;II)V

    .line 327
    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_d
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 331
    .line 332
    .line 333
    :cond_e
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 334
    .line 335
    return-object p1

    .line 336
    nop

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

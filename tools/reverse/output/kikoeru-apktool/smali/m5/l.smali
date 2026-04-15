.class public final Lm5/l;
.super Lm5/n;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final e:I

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:Z


# direct methods
.method public constructor <init>(ILm4/j1;ILm5/j;ILjava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lm5/n;-><init>(ILm4/j1;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p5, p1}, Lq/t0;->v(IZ)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iput-boolean p2, p0, Lm5/l;->f:Z

    .line 10
    .line 11
    iget-object p2, p0, Lm5/n;->d:Lm4/q;

    .line 12
    .line 13
    iget p2, p2, Lm4/q;->e:I

    .line 14
    .line 15
    iget p3, p4, Lm4/o1;->w:I

    .line 16
    .line 17
    iget-object v0, p4, Lm4/o1;->u:Lya/i0;

    .line 18
    .line 19
    not-int p3, p3

    .line 20
    and-int/2addr p2, p3

    .line 21
    and-int/lit8 p3, p2, 0x1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    const/4 p3, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p3, 0x0

    .line 29
    :goto_0
    iput-boolean p3, p0, Lm5/l;->g:Z

    .line 30
    .line 31
    and-int/lit8 p2, p2, 0x2

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 p2, 0x0

    .line 38
    :goto_1
    iput-boolean p2, p0, Lm5/l;->h:Z

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    const-string p2, ""

    .line 47
    .line 48
    invoke-static {p2}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object p2, v0

    .line 54
    :goto_2
    const/4 p3, 0x0

    .line 55
    :goto_3
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const v3, 0x7fffffff

    .line 60
    .line 61
    .line 62
    if-ge p3, v2, :cond_4

    .line 63
    .line 64
    iget-object v2, p0, Lm5/n;->d:Lm4/q;

    .line 65
    .line 66
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/String;

    .line 71
    .line 72
    iget-boolean v5, p4, Lm4/o1;->x:Z

    .line 73
    .line 74
    invoke-static {v2, v4, v5}, Lm5/p;->g(Lm4/q;Ljava/lang/String;Z)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-lez v2, :cond_3

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    const p3, 0x7fffffff

    .line 85
    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    :goto_4
    iput p3, p0, Lm5/l;->i:I

    .line 89
    .line 90
    iput v2, p0, Lm5/l;->j:I

    .line 91
    .line 92
    iget-object p2, p0, Lm5/n;->d:Lm4/q;

    .line 93
    .line 94
    iget p2, p2, Lm4/q;->f:I

    .line 95
    .line 96
    iget p3, p4, Lm4/o1;->v:I

    .line 97
    .line 98
    sget-object v4, Lm5/p;->j:Lya/y0;

    .line 99
    .line 100
    if-eqz p2, :cond_5

    .line 101
    .line 102
    if-ne p2, p3, :cond_5

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_5
    and-int/2addr p2, p3

    .line 106
    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    :goto_5
    iput v3, p0, Lm5/l;->k:I

    .line 111
    .line 112
    iget-object p2, p0, Lm5/n;->d:Lm4/q;

    .line 113
    .line 114
    iget p2, p2, Lm4/q;->f:I

    .line 115
    .line 116
    and-int/lit16 p2, p2, 0x440

    .line 117
    .line 118
    if-eqz p2, :cond_6

    .line 119
    .line 120
    const/4 p2, 0x1

    .line 121
    goto :goto_6

    .line 122
    :cond_6
    const/4 p2, 0x0

    .line 123
    :goto_6
    iput-boolean p2, p0, Lm5/l;->m:Z

    .line 124
    .line 125
    invoke-static {p6}, Lm5/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    if-nez p2, :cond_7

    .line 130
    .line 131
    const/4 p2, 0x1

    .line 132
    goto :goto_7

    .line 133
    :cond_7
    const/4 p2, 0x0

    .line 134
    :goto_7
    iget-object p3, p0, Lm5/n;->d:Lm4/q;

    .line 135
    .line 136
    invoke-static {p3, p6, p2}, Lm5/p;->g(Lm4/q;Ljava/lang/String;Z)I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    iput p2, p0, Lm5/l;->l:I

    .line 141
    .line 142
    if-gtz v2, :cond_a

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result p3

    .line 148
    if-eqz p3, :cond_8

    .line 149
    .line 150
    if-gtz v3, :cond_a

    .line 151
    .line 152
    :cond_8
    iget-boolean p3, p0, Lm5/l;->g:Z

    .line 153
    .line 154
    if-nez p3, :cond_a

    .line 155
    .line 156
    iget-boolean p3, p0, Lm5/l;->h:Z

    .line 157
    .line 158
    if-eqz p3, :cond_9

    .line 159
    .line 160
    if-lez p2, :cond_9

    .line 161
    .line 162
    goto :goto_8

    .line 163
    :cond_9
    const/4 p2, 0x0

    .line 164
    goto :goto_9

    .line 165
    :cond_a
    :goto_8
    const/4 p2, 0x1

    .line 166
    :goto_9
    iget-boolean p3, p4, Lm5/j;->p0:Z

    .line 167
    .line 168
    invoke-static {p5, p3}, Lq/t0;->v(IZ)Z

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    if-eqz p3, :cond_b

    .line 173
    .line 174
    if-eqz p2, :cond_b

    .line 175
    .line 176
    const/4 p1, 0x1

    .line 177
    :cond_b
    iput p1, p0, Lm5/l;->e:I

    .line 178
    .line 179
    return-void
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
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lm5/l;->e:I

    .line 2
    .line 3
    return v0
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

.method public final bridge synthetic b(Lm5/n;)Z
    .locals 0

    .line 1
    check-cast p1, Lm5/l;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final c(Lm5/l;)I
    .locals 7

    .line 1
    iget-boolean v0, p0, Lm5/l;->f:Z

    .line 2
    .line 3
    iget-boolean v1, p1, Lm5/l;->f:Z

    .line 4
    .line 5
    sget-object v2, Lya/y;->a:Lya/w;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Lya/w;->c(ZZ)Lya/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lm5/l;->i:I

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p1, Lm5/l;->i:I

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lya/x0;->b:Lya/x0;

    .line 24
    .line 25
    sget-object v4, Lya/x0;->c:Lya/x0;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v4}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v1, p1, Lm5/l;->j:I

    .line 32
    .line 33
    iget v2, p0, Lm5/l;->j:I

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lya/y;->a(II)Lya/y;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget v1, p1, Lm5/l;->k:I

    .line 40
    .line 41
    iget v5, p0, Lm5/l;->k:I

    .line 42
    .line 43
    invoke-virtual {v0, v5, v1}, Lya/y;->a(II)Lya/y;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-boolean v1, p0, Lm5/l;->g:Z

    .line 48
    .line 49
    iget-boolean v6, p1, Lm5/l;->g:Z

    .line 50
    .line 51
    invoke-virtual {v0, v1, v6}, Lya/y;->c(ZZ)Lya/y;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-boolean v1, p0, Lm5/l;->h:Z

    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-boolean v6, p1, Lm5/l;->h:Z

    .line 62
    .line 63
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    if-nez v2, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object v3, v4

    .line 71
    :goto_0
    invoke-virtual {v0, v1, v6, v3}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget v1, p0, Lm5/l;->l:I

    .line 76
    .line 77
    iget v2, p1, Lm5/l;->l:I

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Lya/y;->a(II)Lya/y;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v5, :cond_1

    .line 84
    .line 85
    iget-boolean v1, p0, Lm5/l;->m:Z

    .line 86
    .line 87
    iget-boolean p1, p1, Lm5/l;->m:Z

    .line 88
    .line 89
    invoke-virtual {v0, v1, p1}, Lya/y;->d(ZZ)Lya/y;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :cond_1
    invoke-virtual {v0}, Lya/y;->e()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    return p1
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lm5/l;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm5/l;->c(Lm5/l;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

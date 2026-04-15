.class public final synthetic Laa/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lx0/w0;


# direct methods
.method public synthetic constructor <init>(Lx0/w0;I)V
    .locals 0

    .line 1
    iput p2, p0, Laa/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Laa/d;->b:Lx0/w0;

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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Laa/d;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    const-string v2, "it"

    .line 13
    .line 14
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_0
    check-cast v1, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, Laa/d;->b:Lx0/w0;

    .line 31
    .line 32
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    xor-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v1, v2}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 52
    .line 53
    return-object v1

    .line 54
    :pswitch_1
    check-cast v1, Ljava/lang/String;

    .line 55
    .line 56
    const-string v2, "it"

    .line 57
    .line 58
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 62
    .line 63
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 67
    .line 68
    return-object v1

    .line 69
    :pswitch_2
    check-cast v1, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Laa/d;->b:Lx0/w0;

    .line 75
    .line 76
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    xor-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-interface {v1, v2}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 96
    .line 97
    return-object v1

    .line 98
    :pswitch_3
    check-cast v1, Ljava/lang/String;

    .line 99
    .line 100
    const-string v2, "it"

    .line 101
    .line 102
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 106
    .line 107
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 111
    .line 112
    return-object v1

    .line 113
    :pswitch_4
    check-cast v1, Ljava/lang/String;

    .line 114
    .line 115
    const-string v2, "it"

    .line 116
    .line 117
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 121
    .line 122
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 126
    .line 127
    return-object v1

    .line 128
    :pswitch_5
    check-cast v1, Ljava/lang/String;

    .line 129
    .line 130
    const-string v2, "it"

    .line 131
    .line 132
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 136
    .line 137
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 141
    .line 142
    return-object v1

    .line 143
    :pswitch_6
    check-cast v1, Lg/a;

    .line 144
    .line 145
    const-string v2, "activityResult"

    .line 146
    .line 147
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object v1, v1, Lg/a;->b:Landroid/content/Intent;

    .line 151
    .line 152
    if-eqz v1, :cond_0

    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    if-eqz v1, :cond_0

    .line 159
    .line 160
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    const/4 v4, 0x3

    .line 173
    invoke-virtual {v2, v3, v1, v4}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    .line 174
    .line 175
    .line 176
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v2, v1, v4}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 185
    .line 186
    .line 187
    const v2, 0x7f0c0167

    .line 188
    .line 189
    .line 190
    invoke-static {v2}, Lna/q;->g(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    const/4 v7, 0x0

    .line 195
    const/16 v8, 0x1ff

    .line 196
    .line 197
    const-wide/16 v4, 0x0

    .line 198
    .line 199
    const/4 v6, 0x0

    .line 200
    invoke-static/range {v3 .. v8}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 201
    .line 202
    .line 203
    const-string v2, "selectDocument"

    .line 204
    .line 205
    invoke-static {v1, v2}, Lna/q;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 209
    .line 210
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    check-cast v2, Lhf/j;

    .line 215
    .line 216
    if-eqz v2, :cond_0

    .line 217
    .line 218
    invoke-interface {v2, v1}, Lyb/c;->h(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_0
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 222
    .line 223
    return-object v1

    .line 224
    :pswitch_7
    check-cast v1, Lp1/b;

    .line 225
    .line 226
    iget-wide v1, v1, Lp1/b;->a:J

    .line 227
    .line 228
    new-instance v3, Lp1/b;

    .line 229
    .line 230
    invoke-direct {v3, v1, v2}, Lp1/b;-><init>(J)V

    .line 231
    .line 232
    .line 233
    iget-object v1, v0, Laa/d;->b:Lx0/w0;

    .line 234
    .line 235
    invoke-interface {v1, v3}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 239
    .line 240
    return-object v1

    .line 241
    :pswitch_8
    check-cast v1, Lf3/l;

    .line 242
    .line 243
    iget-wide v1, v1, Lf3/l;->a:J

    .line 244
    .line 245
    const/16 v3, 0x20

    .line 246
    .line 247
    shr-long v4, v1, v3

    .line 248
    .line 249
    long-to-int v5, v4

    .line 250
    int-to-float v4, v5

    .line 251
    const-wide v5, 0xffffffffL

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    and-long/2addr v1, v5

    .line 257
    long-to-int v2, v1

    .line 258
    int-to-float v1, v2

    .line 259
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    int-to-long v7, v2

    .line 264
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    int-to-long v1, v1

    .line 269
    shl-long v3, v7, v3

    .line 270
    .line 271
    and-long/2addr v1, v5

    .line 272
    or-long/2addr v1, v3

    .line 273
    new-instance v3, Lp1/b;

    .line 274
    .line 275
    invoke-direct {v3, v1, v2}, Lp1/b;-><init>(J)V

    .line 276
    .line 277
    .line 278
    iget-object v1, v0, Laa/d;->b:Lx0/w0;

    .line 279
    .line 280
    invoke-interface {v1, v3}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 284
    .line 285
    return-object v1

    .line 286
    :pswitch_9
    check-cast v1, Landroid/net/Uri;

    .line 287
    .line 288
    if-nez v1, :cond_1

    .line 289
    .line 290
    goto :goto_0

    .line 291
    :cond_1
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 292
    .line 293
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    check-cast v2, Lhf/j;

    .line 298
    .line 299
    if-eqz v2, :cond_2

    .line 300
    .line 301
    const-string v3, ""

    .line 302
    .line 303
    invoke-static {v1, v3}, Lna/q;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-interface {v2, v1}, Lyb/c;->h(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    :cond_2
    :goto_0
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 310
    .line 311
    return-object v1

    .line 312
    :pswitch_a
    check-cast v1, Ljava/lang/String;

    .line 313
    .line 314
    const-string v2, "it"

    .line 315
    .line 316
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 320
    .line 321
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 325
    .line 326
    return-object v1

    .line 327
    :pswitch_b
    check-cast v1, Landroid/content/Context;

    .line 328
    .line 329
    const-string v2, "it"

    .line 330
    .line 331
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    new-instance v2, Landroid/widget/RatingBar;

    .line 335
    .line 336
    invoke-direct {v2, v1}, Landroid/widget/RatingBar;-><init>(Landroid/content/Context;)V

    .line 337
    .line 338
    .line 339
    const/4 v1, 0x5

    .line 340
    invoke-virtual {v2, v1}, Landroid/widget/RatingBar;->setMax(I)V

    .line 341
    .line 342
    .line 343
    const/high16 v1, 0x3f800000    # 1.0f

    .line 344
    .line 345
    invoke-virtual {v2, v1}, Landroid/widget/RatingBar;->setStepSize(F)V

    .line 346
    .line 347
    .line 348
    iget-object v1, v0, Laa/d;->b:Lx0/w0;

    .line 349
    .line 350
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    check-cast v3, Ljava/lang/Integer;

    .line 355
    .line 356
    if-eqz v3, :cond_3

    .line 357
    .line 358
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    goto :goto_1

    .line 363
    :cond_3
    const/4 v3, 0x0

    .line 364
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 365
    .line 366
    .line 367
    new-instance v3, Lma/b;

    .line 368
    .line 369
    invoke-direct {v3, v1}, Lma/b;-><init>(Lx0/w0;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v3}, Landroid/widget/RatingBar;->setOnRatingBarChangeListener(Landroid/widget/RatingBar$OnRatingBarChangeListener;)V

    .line 373
    .line 374
    .line 375
    return-object v2

    .line 376
    :pswitch_c
    check-cast v1, Ljava/lang/String;

    .line 377
    .line 378
    const-string v2, "it"

    .line 379
    .line 380
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 384
    .line 385
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 389
    .line 390
    return-object v1

    .line 391
    :pswitch_d
    check-cast v1, Ljava/lang/String;

    .line 392
    .line 393
    const-string v2, "it"

    .line 394
    .line 395
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 399
    .line 400
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 404
    .line 405
    return-object v1

    .line 406
    :pswitch_e
    check-cast v1, Ljava/lang/Boolean;

    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    iget-object v1, v0, Laa/d;->b:Lx0/w0;

    .line 412
    .line 413
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    check-cast v2, Ljava/lang/Boolean;

    .line 418
    .line 419
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    xor-int/lit8 v2, v2, 0x1

    .line 424
    .line 425
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-interface {v1, v2}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 433
    .line 434
    return-object v1

    .line 435
    :pswitch_f
    check-cast v1, Ljava/lang/String;

    .line 436
    .line 437
    const-string v2, "it"

    .line 438
    .line 439
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 443
    .line 444
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 448
    .line 449
    return-object v1

    .line 450
    :pswitch_10
    move-object v2, v1

    .line 451
    check-cast v2, Ls1/d;

    .line 452
    .line 453
    iget-object v1, v0, Laa/d;->b:Lx0/w0;

    .line 454
    .line 455
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    check-cast v1, Lq1/q;

    .line 460
    .line 461
    iget-wide v3, v1, Lq1/q;->a:J

    .line 462
    .line 463
    sget v1, Lm0/v7;->a:F

    .line 464
    .line 465
    invoke-interface {v2, v1}, Lf3/c;->Q(F)F

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    sget v5, Lm0/v7;->b:F

    .line 470
    .line 471
    invoke-interface {v2, v5}, Lf3/c;->Q(F)F

    .line 472
    .line 473
    .line 474
    move-result v9

    .line 475
    const/4 v5, 0x2

    .line 476
    int-to-float v5, v5

    .line 477
    div-float v5, v9, v5

    .line 478
    .line 479
    invoke-interface {v2}, Ls1/d;->c0()J

    .line 480
    .line 481
    .line 482
    move-result-wide v6

    .line 483
    const-wide v10, 0xffffffffL

    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    and-long/2addr v6, v10

    .line 489
    long-to-int v7, v6

    .line 490
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 495
    .line 496
    .line 497
    move-result v7

    .line 498
    int-to-long v7, v7

    .line 499
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 500
    .line 501
    .line 502
    move-result v6

    .line 503
    int-to-long v12, v6

    .line 504
    const/16 v6, 0x20

    .line 505
    .line 506
    shl-long/2addr v7, v6

    .line 507
    and-long/2addr v12, v10

    .line 508
    or-long/2addr v7, v12

    .line 509
    sub-float/2addr v1, v5

    .line 510
    invoke-interface {v2}, Ls1/d;->c0()J

    .line 511
    .line 512
    .line 513
    move-result-wide v12

    .line 514
    and-long/2addr v12, v10

    .line 515
    long-to-int v5, v12

    .line 516
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 517
    .line 518
    .line 519
    move-result v5

    .line 520
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    int-to-long v12, v1

    .line 525
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    int-to-long v14, v1

    .line 530
    shl-long v5, v12, v6

    .line 531
    .line 532
    and-long/2addr v10, v14

    .line 533
    or-long/2addr v5, v10

    .line 534
    const/4 v10, 0x1

    .line 535
    const/16 v11, 0x1e0

    .line 536
    .line 537
    move-wide/from16 v16, v7

    .line 538
    .line 539
    move-wide v7, v5

    .line 540
    move-wide/from16 v5, v16

    .line 541
    .line 542
    invoke-static/range {v2 .. v11}, Lq/t0;->m(Ls1/d;JJJFII)V

    .line 543
    .line 544
    .line 545
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 546
    .line 547
    return-object v1

    .line 548
    :pswitch_11
    check-cast v1, Lx0/f0;

    .line 549
    .line 550
    const-string v2, "$this$DisposableEffect"

    .line 551
    .line 552
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    new-instance v1, Lfg/c;

    .line 556
    .line 557
    const/4 v2, 0x1

    .line 558
    iget-object v3, v0, Laa/d;->b:Lx0/w0;

    .line 559
    .line 560
    invoke-direct {v1, v3, v2}, Lfg/c;-><init>(Lx0/w0;I)V

    .line 561
    .line 562
    .line 563
    return-object v1

    .line 564
    :pswitch_12
    check-cast v1, Ljava/lang/String;

    .line 565
    .line 566
    const-string v2, "it"

    .line 567
    .line 568
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 572
    .line 573
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 577
    .line 578
    return-object v1

    .line 579
    :pswitch_13
    check-cast v1, Lp1/b;

    .line 580
    .line 581
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 582
    .line 583
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    check-cast v2, Lic/k;

    .line 588
    .line 589
    invoke-interface {v2, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 593
    .line 594
    return-object v1

    .line 595
    :pswitch_14
    check-cast v1, Lp1/b;

    .line 596
    .line 597
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 598
    .line 599
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    check-cast v2, Lic/k;

    .line 604
    .line 605
    if-eqz v2, :cond_4

    .line 606
    .line 607
    invoke-interface {v2, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    :cond_4
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 611
    .line 612
    return-object v1

    .line 613
    :pswitch_15
    check-cast v1, Lp1/b;

    .line 614
    .line 615
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 616
    .line 617
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    check-cast v2, Lic/k;

    .line 622
    .line 623
    if-eqz v2, :cond_5

    .line 624
    .line 625
    invoke-interface {v2, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    :cond_5
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 629
    .line 630
    return-object v1

    .line 631
    :pswitch_16
    const-string v2, "null cannot be cast to non-null type T of loli.ball.okkv.OkkvStateExtendsKt.observeAsState"

    .line 632
    .line 633
    invoke-static {v1, v2}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 637
    .line 638
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 642
    .line 643
    return-object v1

    .line 644
    :pswitch_17
    check-cast v1, Ljava/lang/Float;

    .line 645
    .line 646
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 647
    .line 648
    .line 649
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 650
    .line 651
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 655
    .line 656
    return-object v1

    .line 657
    :pswitch_18
    check-cast v1, Lp1/b;

    .line 658
    .line 659
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 660
    .line 661
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 662
    .line 663
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 667
    .line 668
    return-object v1

    .line 669
    :pswitch_19
    check-cast v1, Lp1/b;

    .line 670
    .line 671
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 672
    .line 673
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 674
    .line 675
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 679
    .line 680
    return-object v1

    .line 681
    :pswitch_1a
    check-cast v1, Ly2/y;

    .line 682
    .line 683
    const-string v2, "it"

    .line 684
    .line 685
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 689
    .line 690
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 694
    .line 695
    return-object v1

    .line 696
    :pswitch_1b
    check-cast v1, Lo1/u;

    .line 697
    .line 698
    const-string v2, "it"

    .line 699
    .line 700
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v1}, Lo1/u;->a()Z

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 712
    .line 713
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 717
    .line 718
    return-object v1

    .line 719
    :pswitch_1c
    check-cast v1, Ljava/lang/Boolean;

    .line 720
    .line 721
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    iget-object v2, v0, Laa/d;->b:Lx0/w0;

    .line 725
    .line 726
    invoke-interface {v2, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    sget-object v1, Lka/b;->f:Lx0/p1;

    .line 730
    .line 731
    if-eqz v1, :cond_6

    .line 732
    .line 733
    invoke-virtual {v1}, Lx0/p1;->c()V

    .line 734
    .line 735
    .line 736
    :cond_6
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 737
    .line 738
    return-object v1

    .line 739
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

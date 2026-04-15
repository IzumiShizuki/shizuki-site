.class public abstract Lg5/y;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg5/y;->a:Ljava/util/HashMap;

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
.end method

.method public static a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 10

    .line 1
    const-string v0, "audio/raw"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    sget p0, Lp4/c0;->a:I

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    if-ge p0, v2, :cond_0

    .line 16
    .line 17
    sget-object p0, Lp4/c0;->b:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "R9"

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lg5/n;

    .line 38
    .line 39
    iget-object p0, p0, Lg5/n;->a:Ljava/lang/String;

    .line 40
    .line 41
    const-string v2, "OMX.MTK.AUDIO.DECODER.RAW"

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v9, 0x0

    .line 51
    const-string v2, "OMX.google.raw.decoder"

    .line 52
    .line 53
    const-string v3, "audio/raw"

    .line 54
    .line 55
    const-string v4, "audio/raw"

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x1

    .line 60
    invoke-static/range {v2 .. v9}, Lg5/n;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Lg5/n;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_0
    new-instance p0, Lg5/i;

    .line 68
    .line 69
    const/4 v2, 0x3

    .line 70
    invoke-direct {p0, v2}, Lg5/i;-><init>(I)V

    .line 71
    .line 72
    .line 73
    new-instance v2, Lg5/s;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-direct {v2, v3, p0}, Lg5/s;-><init>(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    sget p0, Lp4/c0;->a:I

    .line 83
    .line 84
    const/16 v2, 0x20

    .line 85
    .line 86
    if-ge p0, v2, :cond_2

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-le p0, v0, :cond_2

    .line 93
    .line 94
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, Lg5/n;

    .line 99
    .line 100
    iget-object p0, p0, Lg5/n;->a:Ljava/lang/String;

    .line 101
    .line 102
    const-string v0, "OMX.qti.audio.decoder.flac"

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_2

    .line 109
    .line 110
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Lg5/n;

    .line 115
    .line 116
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_2
    return-void
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

.method public static b(Lm4/q;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lm4/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lm4/q;->n:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "audio/eac3-joc"

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string p0, "audio/eac3"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string v0, "video/dolby-vision"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v2, "video/hevc"

    .line 23
    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    invoke-static {p0}, Lg5/y;->d(Lm4/q;)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_4

    .line 31
    .line 32
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/16 v0, 0x10

    .line 41
    .line 42
    if-eq p0, v0, :cond_3

    .line 43
    .line 44
    const/16 v0, 0x100

    .line 45
    .line 46
    if-ne p0, v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/16 v0, 0x200

    .line 50
    .line 51
    if-ne p0, v0, :cond_2

    .line 52
    .line 53
    const-string p0, "video/avc"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_2
    const/16 v0, 0x400

    .line 57
    .line 58
    if-ne p0, v0, :cond_4

    .line 59
    .line 60
    const-string p0, "video/av01"

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    :goto_0
    return-object v2

    .line 64
    :cond_4
    const-string p0, "video/mv-hevc"

    .line 65
    .line 66
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_5
    const/4 p0, 0x0

    .line 74
    return-object p0
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

.method public static c(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    invoke-virtual {v2, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p0, "video/dolby-vision"

    .line 22
    .line 23
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_4

    .line 28
    .line 29
    const-string p0, "OMX.MS.HEVCDV.Decoder"

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    const-string p0, "video/hevcdv"

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    const-string p0, "OMX.RTK.video.decoder"

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_3

    .line 47
    .line 48
    const-string p0, "OMX.realtek.video.decoder.tunneled"

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_8

    .line 55
    .line 56
    :cond_3
    const-string p0, "video/dv_hevc"

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_4
    const-string p0, "video/mv-hevc"

    .line 60
    .line 61
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    const-string p0, "c2.qti.mvhevc.decoder"

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_8

    .line 74
    .line 75
    const-string p0, "video/x-mvhevc"

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    const-string p0, "audio/alac"

    .line 79
    .line 80
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_6

    .line 85
    .line 86
    const-string p0, "OMX.lge.alac.decoder"

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_6

    .line 93
    .line 94
    const-string p0, "audio/x-lg-alac"

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_6
    const-string p0, "audio/flac"

    .line 98
    .line 99
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_7

    .line 104
    .line 105
    const-string p0, "OMX.lge.flac.decoder"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eqz p0, :cond_7

    .line 112
    .line 113
    const-string p0, "audio/x-lg-flac"

    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_7
    const-string p0, "audio/ac3"

    .line 117
    .line 118
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_8

    .line 123
    .line 124
    const-string p0, "OMX.lge.ac3.decoder"

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_8

    .line 131
    .line 132
    const-string p0, "audio/lg-ac3"

    .line 133
    .line 134
    return-object p0

    .line 135
    :cond_8
    const/4 p0, 0x0

    .line 136
    return-object p0
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

.method public static d(Lm4/q;)Landroid/util/Pair;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lp4/d;->a:[B

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object v3, v0, Lm4/q;->k:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v4, v0, Lm4/q;->B:Lm4/h;

    .line 13
    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    const/16 v21, 0x0

    .line 17
    .line 18
    goto/16 :goto_b

    .line 19
    .line 20
    :cond_0
    const-string v6, "\\."

    .line 21
    .line 22
    invoke-virtual {v3, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const-string v7, "video/dolby-vision"

    .line 27
    .line 28
    iget-object v0, v0, Lm4/q;->n:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v16, 0x200

    .line 35
    .line 36
    const/16 v17, 0x100

    .line 37
    .line 38
    const/16 v18, 0x80

    .line 39
    .line 40
    const/16 v19, 0x40

    .line 41
    .line 42
    const/16 v20, 0x20

    .line 43
    .line 44
    const/16 v21, 0x0

    .line 45
    .line 46
    const/16 v5, 0x8

    .line 47
    .line 48
    const/16 v8, 0x10

    .line 49
    .line 50
    const/16 v22, 0x400

    .line 51
    .line 52
    const/4 v11, 0x4

    .line 53
    const/16 v23, 0x800

    .line 54
    .line 55
    const/4 v14, 0x3

    .line 56
    const/16 v24, 0x1000

    .line 57
    .line 58
    const-string v15, "CodecSpecificDataUtil"

    .line 59
    .line 60
    const/4 v7, 0x2

    .line 61
    if-eqz v0, :cond_1f

    .line 62
    .line 63
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v20

    .line 79
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v19

    .line 83
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v18

    .line 87
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v17

    .line 91
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v16

    .line 95
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v22

    .line 99
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v25

    .line 103
    array-length v5, v6

    .line 104
    const-string v11, "Ignoring malformed Dolby Vision codec string: "

    .line 105
    .line 106
    if-ge v5, v14, :cond_1

    .line 107
    .line 108
    invoke-static {v11, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v21

    .line 112
    :cond_1
    sget-object v5, Lp4/d;->c:Ljava/util/regex/Pattern;

    .line 113
    .line 114
    const/16 v26, 0x0

    .line 115
    .line 116
    aget-object v13, v6, v1

    .line 117
    .line 118
    invoke-virtual {v5, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    if-nez v13, :cond_2

    .line 127
    .line 128
    invoke-static {v11, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v21

    .line 132
    :cond_2
    invoke-virtual {v5, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    const-string v5, "10"

    .line 137
    .line 138
    const-string v13, "09"

    .line 139
    .line 140
    const-string v11, "08"

    .line 141
    .line 142
    const-string v10, "07"

    .line 143
    .line 144
    const-string v9, "06"

    .line 145
    .line 146
    const-string v12, "05"

    .line 147
    .line 148
    const/16 v27, 0x2

    .line 149
    .line 150
    const-string v7, "04"

    .line 151
    .line 152
    const/16 v28, 0x1

    .line 153
    .line 154
    const-string v1, "03"

    .line 155
    .line 156
    const-string v14, "02"

    .line 157
    .line 158
    move-object/from16 v30, v0

    .line 159
    .line 160
    const-string v0, "01"

    .line 161
    .line 162
    if-nez v3, :cond_3

    .line 163
    .line 164
    move-object/from16 v31, v4

    .line 165
    .line 166
    :goto_0
    move-object/from16 v4, v21

    .line 167
    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 171
    .line 172
    .line 173
    move-result v31

    .line 174
    sparse-switch v31, :sswitch_data_0

    .line 175
    .line 176
    .line 177
    :goto_1
    move-object/from16 v31, v4

    .line 178
    .line 179
    :goto_2
    const/4 v4, -0x1

    .line 180
    goto/16 :goto_3

    .line 181
    .line 182
    :sswitch_0
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v31

    .line 186
    if-nez v31, :cond_4

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_4
    move-object/from16 v31, v4

    .line 190
    .line 191
    const/16 v4, 0xa

    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :sswitch_1
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v31

    .line 199
    if-nez v31, :cond_5

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_5
    move-object/from16 v31, v4

    .line 203
    .line 204
    const/16 v4, 0x9

    .line 205
    .line 206
    goto/16 :goto_3

    .line 207
    .line 208
    :sswitch_2
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v31

    .line 212
    if-nez v31, :cond_6

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_6
    move-object/from16 v31, v4

    .line 216
    .line 217
    const/16 v4, 0x8

    .line 218
    .line 219
    goto/16 :goto_3

    .line 220
    .line 221
    :sswitch_3
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v31

    .line 225
    if-nez v31, :cond_7

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_7
    move-object/from16 v31, v4

    .line 229
    .line 230
    const/4 v4, 0x7

    .line 231
    goto :goto_3

    .line 232
    :sswitch_4
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v31

    .line 236
    if-nez v31, :cond_8

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_8
    move-object/from16 v31, v4

    .line 240
    .line 241
    const/4 v4, 0x6

    .line 242
    goto :goto_3

    .line 243
    :sswitch_5
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v31

    .line 247
    if-nez v31, :cond_9

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_9
    move-object/from16 v31, v4

    .line 251
    .line 252
    const/4 v4, 0x5

    .line 253
    goto :goto_3

    .line 254
    :sswitch_6
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v31

    .line 258
    if-nez v31, :cond_a

    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_a
    move-object/from16 v31, v4

    .line 262
    .line 263
    const/4 v4, 0x4

    .line 264
    goto :goto_3

    .line 265
    :sswitch_7
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v31

    .line 269
    if-nez v31, :cond_b

    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_b
    move-object/from16 v31, v4

    .line 273
    .line 274
    const/4 v4, 0x3

    .line 275
    goto :goto_3

    .line 276
    :sswitch_8
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v31

    .line 280
    if-nez v31, :cond_c

    .line 281
    .line 282
    goto :goto_1

    .line 283
    :cond_c
    move-object/from16 v31, v4

    .line 284
    .line 285
    const/4 v4, 0x2

    .line 286
    goto :goto_3

    .line 287
    :sswitch_9
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v31

    .line 291
    if-nez v31, :cond_d

    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_d
    move-object/from16 v31, v4

    .line 295
    .line 296
    const/4 v4, 0x1

    .line 297
    goto :goto_3

    .line 298
    :sswitch_a
    move-object/from16 v31, v4

    .line 299
    .line 300
    const-string v4, "00"

    .line 301
    .line 302
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-nez v4, :cond_e

    .line 307
    .line 308
    goto/16 :goto_2

    .line 309
    .line 310
    :cond_e
    const/4 v4, 0x0

    .line 311
    :goto_3
    packed-switch v4, :pswitch_data_0

    .line 312
    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    :pswitch_0
    move-object/from16 v4, v22

    .line 317
    .line 318
    goto :goto_4

    .line 319
    :pswitch_1
    move-object/from16 v4, v16

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :pswitch_2
    move-object/from16 v4, v17

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :pswitch_3
    move-object/from16 v4, v18

    .line 326
    .line 327
    goto :goto_4

    .line 328
    :pswitch_4
    move-object/from16 v4, v19

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :pswitch_5
    move-object/from16 v4, v20

    .line 332
    .line 333
    goto :goto_4

    .line 334
    :pswitch_6
    move-object v4, v8

    .line 335
    goto :goto_4

    .line 336
    :pswitch_7
    move-object/from16 v4, v31

    .line 337
    .line 338
    goto :goto_4

    .line 339
    :pswitch_8
    move-object/from16 v4, v30

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :pswitch_9
    move-object/from16 v4, v25

    .line 343
    .line 344
    goto :goto_4

    .line 345
    :pswitch_a
    move-object v4, v2

    .line 346
    :goto_4
    if-nez v4, :cond_f

    .line 347
    .line 348
    const-string v0, "Unknown Dolby Vision profile string: "

    .line 349
    .line 350
    invoke-static {v0, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return-object v21

    .line 354
    :cond_f
    aget-object v3, v6, v27

    .line 355
    .line 356
    if-nez v3, :cond_10

    .line 357
    .line 358
    :goto_5
    move-object/from16 v2, v21

    .line 359
    .line 360
    goto/16 :goto_8

    .line 361
    .line 362
    :cond_10
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    sparse-switch v6, :sswitch_data_1

    .line 367
    .line 368
    .line 369
    :goto_6
    const/4 v1, -0x1

    .line 370
    goto/16 :goto_7

    .line 371
    .line 372
    :sswitch_b
    const-string v0, "13"

    .line 373
    .line 374
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    if-nez v0, :cond_11

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_11
    const/16 v1, 0xc

    .line 382
    .line 383
    goto/16 :goto_7

    .line 384
    .line 385
    :sswitch_c
    const-string v0, "12"

    .line 386
    .line 387
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-nez v0, :cond_12

    .line 392
    .line 393
    goto :goto_6

    .line 394
    :cond_12
    const/16 v1, 0xb

    .line 395
    .line 396
    goto/16 :goto_7

    .line 397
    .line 398
    :sswitch_d
    const-string v0, "11"

    .line 399
    .line 400
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_13

    .line 405
    .line 406
    goto :goto_6

    .line 407
    :cond_13
    const/16 v1, 0xa

    .line 408
    .line 409
    goto/16 :goto_7

    .line 410
    .line 411
    :sswitch_e
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-nez v0, :cond_14

    .line 416
    .line 417
    goto :goto_6

    .line 418
    :cond_14
    const/16 v1, 0x9

    .line 419
    .line 420
    goto :goto_7

    .line 421
    :sswitch_f
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-nez v0, :cond_15

    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_15
    const/16 v1, 0x8

    .line 429
    .line 430
    goto :goto_7

    .line 431
    :sswitch_10
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-nez v0, :cond_16

    .line 436
    .line 437
    goto :goto_6

    .line 438
    :cond_16
    const/4 v1, 0x7

    .line 439
    goto :goto_7

    .line 440
    :sswitch_11
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-nez v0, :cond_17

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_17
    const/4 v1, 0x6

    .line 448
    goto :goto_7

    .line 449
    :sswitch_12
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-nez v0, :cond_18

    .line 454
    .line 455
    goto :goto_6

    .line 456
    :cond_18
    const/4 v1, 0x5

    .line 457
    goto :goto_7

    .line 458
    :sswitch_13
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-nez v0, :cond_19

    .line 463
    .line 464
    goto :goto_6

    .line 465
    :cond_19
    const/4 v1, 0x4

    .line 466
    goto :goto_7

    .line 467
    :sswitch_14
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    if-nez v0, :cond_1a

    .line 472
    .line 473
    goto :goto_6

    .line 474
    :cond_1a
    const/4 v1, 0x3

    .line 475
    goto :goto_7

    .line 476
    :sswitch_15
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-nez v0, :cond_1b

    .line 481
    .line 482
    goto :goto_6

    .line 483
    :cond_1b
    const/4 v1, 0x2

    .line 484
    goto :goto_7

    .line 485
    :sswitch_16
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-nez v0, :cond_1c

    .line 490
    .line 491
    goto :goto_6

    .line 492
    :cond_1c
    const/4 v1, 0x1

    .line 493
    goto :goto_7

    .line 494
    :sswitch_17
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-nez v0, :cond_1d

    .line 499
    .line 500
    goto/16 :goto_6

    .line 501
    .line 502
    :cond_1d
    const/4 v1, 0x0

    .line 503
    :goto_7
    packed-switch v1, :pswitch_data_1

    .line 504
    .line 505
    .line 506
    goto/16 :goto_5

    .line 507
    .line 508
    :pswitch_b
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    goto :goto_8

    .line 513
    :pswitch_c
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    goto :goto_8

    .line 518
    :pswitch_d
    move-object/from16 v2, v22

    .line 519
    .line 520
    goto :goto_8

    .line 521
    :pswitch_e
    move-object/from16 v2, v16

    .line 522
    .line 523
    goto :goto_8

    .line 524
    :pswitch_f
    move-object/from16 v2, v17

    .line 525
    .line 526
    goto :goto_8

    .line 527
    :pswitch_10
    move-object/from16 v2, v18

    .line 528
    .line 529
    goto :goto_8

    .line 530
    :pswitch_11
    move-object/from16 v2, v19

    .line 531
    .line 532
    goto :goto_8

    .line 533
    :pswitch_12
    move-object/from16 v2, v20

    .line 534
    .line 535
    goto :goto_8

    .line 536
    :pswitch_13
    move-object v2, v8

    .line 537
    goto :goto_8

    .line 538
    :pswitch_14
    move-object/from16 v2, v31

    .line 539
    .line 540
    goto :goto_8

    .line 541
    :pswitch_15
    move-object/from16 v2, v30

    .line 542
    .line 543
    goto :goto_8

    .line 544
    :pswitch_16
    move-object/from16 v2, v25

    .line 545
    .line 546
    :goto_8
    :pswitch_17
    if-nez v2, :cond_1e

    .line 547
    .line 548
    const-string v0, "Unknown Dolby Vision level string: "

    .line 549
    .line 550
    invoke-static {v0, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    return-object v21

    .line 554
    :cond_1e
    new-instance v0, Landroid/util/Pair;

    .line 555
    .line 556
    invoke-direct {v0, v4, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    return-object v0

    .line 560
    :cond_1f
    const/16 v26, 0x0

    .line 561
    .line 562
    const/16 v27, 0x2

    .line 563
    .line 564
    const/16 v28, 0x1

    .line 565
    .line 566
    aget-object v0, v6, v26

    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 572
    .line 573
    .line 574
    move-result v1

    .line 575
    sparse-switch v1, :sswitch_data_2

    .line 576
    .line 577
    .line 578
    :goto_9
    const/4 v0, -0x1

    .line 579
    goto/16 :goto_a

    .line 580
    .line 581
    :sswitch_18
    const-string v1, "vp09"

    .line 582
    .line 583
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-nez v0, :cond_20

    .line 588
    .line 589
    goto :goto_9

    .line 590
    :cond_20
    const/4 v0, 0x7

    .line 591
    goto :goto_a

    .line 592
    :sswitch_19
    const-string v1, "s263"

    .line 593
    .line 594
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    if-nez v0, :cond_21

    .line 599
    .line 600
    goto :goto_9

    .line 601
    :cond_21
    const/4 v0, 0x6

    .line 602
    goto :goto_a

    .line 603
    :sswitch_1a
    const-string v1, "mp4a"

    .line 604
    .line 605
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    if-nez v0, :cond_22

    .line 610
    .line 611
    goto :goto_9

    .line 612
    :cond_22
    const/4 v0, 0x5

    .line 613
    goto :goto_a

    .line 614
    :sswitch_1b
    const-string v1, "hvc1"

    .line 615
    .line 616
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    if-nez v0, :cond_23

    .line 621
    .line 622
    goto :goto_9

    .line 623
    :cond_23
    const/4 v0, 0x4

    .line 624
    goto :goto_a

    .line 625
    :sswitch_1c
    const-string v1, "hev1"

    .line 626
    .line 627
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    if-nez v0, :cond_24

    .line 632
    .line 633
    goto :goto_9

    .line 634
    :cond_24
    const/4 v0, 0x3

    .line 635
    goto :goto_a

    .line 636
    :sswitch_1d
    const-string v1, "avc2"

    .line 637
    .line 638
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-nez v0, :cond_25

    .line 643
    .line 644
    goto :goto_9

    .line 645
    :cond_25
    const/4 v0, 0x2

    .line 646
    goto :goto_a

    .line 647
    :sswitch_1e
    const-string v1, "avc1"

    .line 648
    .line 649
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v0

    .line 653
    if-nez v0, :cond_26

    .line 654
    .line 655
    goto :goto_9

    .line 656
    :cond_26
    const/4 v0, 0x1

    .line 657
    goto :goto_a

    .line 658
    :sswitch_1f
    const-string v1, "av01"

    .line 659
    .line 660
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v0

    .line 664
    if-nez v0, :cond_27

    .line 665
    .line 666
    goto :goto_9

    .line 667
    :cond_27
    const/4 v0, 0x0

    .line 668
    :goto_a
    const/16 v1, 0x4000

    .line 669
    .line 670
    const v5, 0x8000

    .line 671
    .line 672
    .line 673
    const/high16 v7, 0x10000

    .line 674
    .line 675
    const/16 v9, 0x14

    .line 676
    .line 677
    const/16 v10, 0x2000

    .line 678
    .line 679
    packed-switch v0, :pswitch_data_2

    .line 680
    .line 681
    .line 682
    :goto_b
    return-object v21

    .line 683
    :pswitch_18
    array-length v0, v6

    .line 684
    const-string v1, "Ignoring malformed VP9 codec string: "

    .line 685
    .line 686
    const/4 v2, 0x3

    .line 687
    if-ge v0, v2, :cond_28

    .line 688
    .line 689
    invoke-static {v1, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    return-object v21

    .line 693
    :cond_28
    :try_start_0
    aget-object v0, v6, v28

    .line 694
    .line 695
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 696
    .line 697
    .line 698
    move-result v0

    .line 699
    aget-object v2, v6, v27

    .line 700
    .line 701
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 702
    .line 703
    .line 704
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 705
    if-eqz v0, :cond_2c

    .line 706
    .line 707
    const/4 v2, 0x1

    .line 708
    if-eq v0, v2, :cond_2b

    .line 709
    .line 710
    const/4 v2, 0x2

    .line 711
    if-eq v0, v2, :cond_2a

    .line 712
    .line 713
    const/4 v2, 0x3

    .line 714
    if-eq v0, v2, :cond_29

    .line 715
    .line 716
    const/4 v2, -0x1

    .line 717
    :goto_c
    const/4 v3, -0x1

    .line 718
    goto :goto_d

    .line 719
    :cond_29
    const/16 v2, 0x8

    .line 720
    .line 721
    goto :goto_c

    .line 722
    :cond_2a
    const/4 v2, 0x4

    .line 723
    goto :goto_c

    .line 724
    :cond_2b
    const/4 v2, 0x2

    .line 725
    goto :goto_c

    .line 726
    :cond_2c
    const/4 v2, 0x1

    .line 727
    goto :goto_c

    .line 728
    :goto_d
    if-ne v2, v3, :cond_2d

    .line 729
    .line 730
    const-string v1, "Unknown VP9 profile: "

    .line 731
    .line 732
    invoke-static {v0, v1, v15}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    return-object v21

    .line 736
    :cond_2d
    const/16 v0, 0xa

    .line 737
    .line 738
    if-eq v1, v0, :cond_37

    .line 739
    .line 740
    const/16 v0, 0xb

    .line 741
    .line 742
    if-eq v1, v0, :cond_36

    .line 743
    .line 744
    if-eq v1, v9, :cond_35

    .line 745
    .line 746
    const/16 v0, 0x15

    .line 747
    .line 748
    if-eq v1, v0, :cond_34

    .line 749
    .line 750
    const/16 v0, 0x1e

    .line 751
    .line 752
    if-eq v1, v0, :cond_33

    .line 753
    .line 754
    const/16 v0, 0x1f

    .line 755
    .line 756
    if-eq v1, v0, :cond_32

    .line 757
    .line 758
    const/16 v0, 0x28

    .line 759
    .line 760
    if-eq v1, v0, :cond_31

    .line 761
    .line 762
    const/16 v0, 0x29

    .line 763
    .line 764
    if-eq v1, v0, :cond_30

    .line 765
    .line 766
    const/16 v0, 0x32

    .line 767
    .line 768
    if-eq v1, v0, :cond_2f

    .line 769
    .line 770
    const/16 v0, 0x33

    .line 771
    .line 772
    if-eq v1, v0, :cond_2e

    .line 773
    .line 774
    packed-switch v1, :pswitch_data_3

    .line 775
    .line 776
    .line 777
    const/4 v3, -0x1

    .line 778
    const/4 v8, -0x1

    .line 779
    goto :goto_e

    .line 780
    :pswitch_19
    const/4 v3, -0x1

    .line 781
    const/16 v8, 0x2000

    .line 782
    .line 783
    goto :goto_e

    .line 784
    :pswitch_1a
    const/4 v3, -0x1

    .line 785
    const/16 v8, 0x1000

    .line 786
    .line 787
    goto :goto_e

    .line 788
    :pswitch_1b
    const/4 v3, -0x1

    .line 789
    const/16 v8, 0x800

    .line 790
    .line 791
    goto :goto_e

    .line 792
    :cond_2e
    const/4 v3, -0x1

    .line 793
    const/16 v8, 0x200

    .line 794
    .line 795
    goto :goto_e

    .line 796
    :cond_2f
    const/4 v3, -0x1

    .line 797
    const/16 v8, 0x100

    .line 798
    .line 799
    goto :goto_e

    .line 800
    :cond_30
    const/4 v3, -0x1

    .line 801
    const/16 v8, 0x80

    .line 802
    .line 803
    goto :goto_e

    .line 804
    :cond_31
    const/4 v3, -0x1

    .line 805
    const/16 v8, 0x40

    .line 806
    .line 807
    goto :goto_e

    .line 808
    :cond_32
    const/4 v3, -0x1

    .line 809
    const/16 v8, 0x20

    .line 810
    .line 811
    goto :goto_e

    .line 812
    :cond_33
    const/4 v3, -0x1

    .line 813
    goto :goto_e

    .line 814
    :cond_34
    const/4 v3, -0x1

    .line 815
    const/16 v8, 0x8

    .line 816
    .line 817
    goto :goto_e

    .line 818
    :cond_35
    const/4 v3, -0x1

    .line 819
    const/4 v8, 0x4

    .line 820
    goto :goto_e

    .line 821
    :cond_36
    const/4 v3, -0x1

    .line 822
    const/4 v8, 0x2

    .line 823
    goto :goto_e

    .line 824
    :cond_37
    const/4 v3, -0x1

    .line 825
    const/4 v8, 0x1

    .line 826
    :goto_e
    if-ne v8, v3, :cond_38

    .line 827
    .line 828
    const-string v0, "Unknown VP9 level: "

    .line 829
    .line 830
    invoke-static {v1, v0, v15}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    return-object v21

    .line 834
    :cond_38
    new-instance v0, Landroid/util/Pair;

    .line 835
    .line 836
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 837
    .line 838
    .line 839
    move-result-object v1

    .line 840
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    return-object v0

    .line 848
    :catch_0
    invoke-static {v1, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    :cond_39
    :goto_f
    move-object/from16 v5, v21

    .line 852
    .line 853
    goto/16 :goto_18

    .line 854
    .line 855
    :pswitch_1c
    new-instance v5, Landroid/util/Pair;

    .line 856
    .line 857
    invoke-direct {v5, v2, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    array-length v0, v6

    .line 861
    const-string v1, "Ignoring malformed H263 codec string: "

    .line 862
    .line 863
    const/4 v2, 0x3

    .line 864
    if-ge v0, v2, :cond_3a

    .line 865
    .line 866
    invoke-static {v1, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    return-object v5

    .line 870
    :cond_3a
    const/16 v28, 0x1

    .line 871
    .line 872
    :try_start_1
    aget-object v0, v6, v28

    .line 873
    .line 874
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 875
    .line 876
    .line 877
    move-result v0

    .line 878
    const/16 v27, 0x2

    .line 879
    .line 880
    aget-object v2, v6, v27

    .line 881
    .line 882
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 883
    .line 884
    .line 885
    move-result v2

    .line 886
    new-instance v4, Landroid/util/Pair;

    .line 887
    .line 888
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 893
    .line 894
    .line 895
    move-result-object v2

    .line 896
    invoke-direct {v4, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 897
    .line 898
    .line 899
    return-object v4

    .line 900
    :catch_1
    invoke-static {v1, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    goto/16 :goto_18

    .line 904
    .line 905
    :pswitch_1d
    array-length v0, v6

    .line 906
    const-string v1, "Ignoring malformed MP4A codec string: "

    .line 907
    .line 908
    const/4 v2, 0x3

    .line 909
    if-eq v0, v2, :cond_3b

    .line 910
    .line 911
    invoke-static {v1, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    return-object v21

    .line 915
    :cond_3b
    const/16 v28, 0x1

    .line 916
    .line 917
    :try_start_2
    aget-object v0, v6, v28

    .line 918
    .line 919
    invoke-static {v0, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 920
    .line 921
    .line 922
    move-result v0

    .line 923
    invoke-static {v0}, Lm4/o0;->f(I)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    const-string v2, "audio/mp4a-latm"

    .line 928
    .line 929
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 930
    .line 931
    .line 932
    move-result v0

    .line 933
    if-eqz v0, :cond_39

    .line 934
    .line 935
    const/16 v27, 0x2

    .line 936
    .line 937
    aget-object v0, v6, v27

    .line 938
    .line 939
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 940
    .line 941
    .line 942
    move-result v0

    .line 943
    const/16 v2, 0x11

    .line 944
    .line 945
    if-eq v0, v2, :cond_3c

    .line 946
    .line 947
    if-eq v0, v9, :cond_3d

    .line 948
    .line 949
    const/16 v2, 0x17

    .line 950
    .line 951
    if-eq v0, v2, :cond_3c

    .line 952
    .line 953
    const/16 v2, 0x1d

    .line 954
    .line 955
    if-eq v0, v2, :cond_3c

    .line 956
    .line 957
    const/16 v2, 0x27

    .line 958
    .line 959
    if-eq v0, v2, :cond_3c

    .line 960
    .line 961
    const/16 v2, 0x2a

    .line 962
    .line 963
    if-eq v0, v2, :cond_3c

    .line 964
    .line 965
    packed-switch v0, :pswitch_data_4

    .line 966
    .line 967
    .line 968
    const/4 v0, -0x1

    .line 969
    const/4 v2, -0x1

    .line 970
    goto :goto_10

    .line 971
    :pswitch_1e
    const/4 v0, -0x1

    .line 972
    const/4 v2, 0x6

    .line 973
    goto :goto_10

    .line 974
    :pswitch_1f
    const/4 v0, -0x1

    .line 975
    const/4 v2, 0x5

    .line 976
    goto :goto_10

    .line 977
    :pswitch_20
    const/4 v0, -0x1

    .line 978
    const/4 v2, 0x4

    .line 979
    goto :goto_10

    .line 980
    :pswitch_21
    const/4 v0, -0x1

    .line 981
    const/4 v2, 0x3

    .line 982
    goto :goto_10

    .line 983
    :pswitch_22
    const/4 v0, -0x1

    .line 984
    const/4 v2, 0x2

    .line 985
    goto :goto_10

    .line 986
    :pswitch_23
    const/4 v0, -0x1

    .line 987
    const/4 v2, 0x1

    .line 988
    goto :goto_10

    .line 989
    :cond_3c
    const/4 v0, -0x1

    .line 990
    goto :goto_10

    .line 991
    :cond_3d
    const/4 v0, -0x1

    .line 992
    const/16 v2, 0x14

    .line 993
    .line 994
    :goto_10
    if-eq v2, v0, :cond_39

    .line 995
    .line 996
    new-instance v0, Landroid/util/Pair;

    .line 997
    .line 998
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 999
    .line 1000
    .line 1001
    move-result-object v2

    .line 1002
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v4

    .line 1006
    invoke-direct {v0, v2, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1007
    .line 1008
    .line 1009
    return-object v0

    .line 1010
    :catch_2
    invoke-static {v1, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    goto/16 :goto_f

    .line 1014
    .line 1015
    :pswitch_24
    invoke-static {v3, v6, v4}, Lp4/d;->b(Ljava/lang/String;[Ljava/lang/String;Lm4/h;)Landroid/util/Pair;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    return-object v0

    .line 1020
    :pswitch_25
    array-length v0, v6

    .line 1021
    const-string v2, "Ignoring malformed AVC codec string: "

    .line 1022
    .line 1023
    const/4 v4, 0x2

    .line 1024
    if-ge v0, v4, :cond_3e

    .line 1025
    .line 1026
    invoke-static {v2, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    return-object v21

    .line 1030
    :cond_3e
    const/16 v28, 0x1

    .line 1031
    .line 1032
    :try_start_3
    aget-object v0, v6, v28

    .line 1033
    .line 1034
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1035
    .line 1036
    .line 1037
    move-result v0

    .line 1038
    const/4 v9, 0x6

    .line 1039
    if-ne v0, v9, :cond_3f

    .line 1040
    .line 1041
    aget-object v0, v6, v28

    .line 1042
    .line 1043
    const/4 v9, 0x0

    .line 1044
    invoke-virtual {v0, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-static {v0, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1049
    .line 1050
    .line 1051
    move-result v0

    .line 1052
    aget-object v4, v6, v28

    .line 1053
    .line 1054
    const/4 v6, 0x4

    .line 1055
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v4

    .line 1059
    invoke-static {v4, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1060
    .line 1061
    .line 1062
    move-result v2

    .line 1063
    goto :goto_11

    .line 1064
    :cond_3f
    array-length v0, v6

    .line 1065
    const/4 v4, 0x3

    .line 1066
    if-lt v0, v4, :cond_49

    .line 1067
    .line 1068
    const/16 v28, 0x1

    .line 1069
    .line 1070
    aget-object v0, v6, v28

    .line 1071
    .line 1072
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1073
    .line 1074
    .line 1075
    move-result v0

    .line 1076
    const/16 v27, 0x2

    .line 1077
    .line 1078
    aget-object v4, v6, v27

    .line 1079
    .line 1080
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1081
    .line 1082
    .line 1083
    move-result v2
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1084
    :goto_11
    const/16 v3, 0x42

    .line 1085
    .line 1086
    if-eq v0, v3, :cond_46

    .line 1087
    .line 1088
    const/16 v3, 0x4d

    .line 1089
    .line 1090
    if-eq v0, v3, :cond_45

    .line 1091
    .line 1092
    const/16 v3, 0x58

    .line 1093
    .line 1094
    if-eq v0, v3, :cond_44

    .line 1095
    .line 1096
    const/16 v3, 0x64

    .line 1097
    .line 1098
    if-eq v0, v3, :cond_43

    .line 1099
    .line 1100
    const/16 v3, 0x6e

    .line 1101
    .line 1102
    if-eq v0, v3, :cond_42

    .line 1103
    .line 1104
    const/16 v3, 0x7a

    .line 1105
    .line 1106
    if-eq v0, v3, :cond_41

    .line 1107
    .line 1108
    const/16 v3, 0xf4

    .line 1109
    .line 1110
    if-eq v0, v3, :cond_40

    .line 1111
    .line 1112
    const/4 v3, -0x1

    .line 1113
    :goto_12
    const/4 v4, -0x1

    .line 1114
    goto :goto_13

    .line 1115
    :cond_40
    const/16 v3, 0x40

    .line 1116
    .line 1117
    goto :goto_12

    .line 1118
    :cond_41
    const/16 v3, 0x20

    .line 1119
    .line 1120
    goto :goto_12

    .line 1121
    :cond_42
    const/16 v3, 0x10

    .line 1122
    .line 1123
    goto :goto_12

    .line 1124
    :cond_43
    const/16 v3, 0x8

    .line 1125
    .line 1126
    goto :goto_12

    .line 1127
    :cond_44
    const/4 v3, 0x4

    .line 1128
    goto :goto_12

    .line 1129
    :cond_45
    const/4 v3, 0x2

    .line 1130
    goto :goto_12

    .line 1131
    :cond_46
    const/4 v3, 0x1

    .line 1132
    goto :goto_12

    .line 1133
    :goto_13
    if-ne v3, v4, :cond_47

    .line 1134
    .line 1135
    const-string v1, "Unknown AVC profile: "

    .line 1136
    .line 1137
    invoke-static {v0, v1, v15}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 1138
    .line 1139
    .line 1140
    return-object v21

    .line 1141
    :cond_47
    packed-switch v2, :pswitch_data_5

    .line 1142
    .line 1143
    .line 1144
    packed-switch v2, :pswitch_data_6

    .line 1145
    .line 1146
    .line 1147
    packed-switch v2, :pswitch_data_7

    .line 1148
    .line 1149
    .line 1150
    packed-switch v2, :pswitch_data_8

    .line 1151
    .line 1152
    .line 1153
    packed-switch v2, :pswitch_data_9

    .line 1154
    .line 1155
    .line 1156
    const/4 v0, -0x1

    .line 1157
    const/4 v1, -0x1

    .line 1158
    goto :goto_14

    .line 1159
    :pswitch_26
    const/4 v0, -0x1

    .line 1160
    const/high16 v1, 0x10000

    .line 1161
    .line 1162
    goto :goto_14

    .line 1163
    :pswitch_27
    const/4 v0, -0x1

    .line 1164
    const v1, 0x8000

    .line 1165
    .line 1166
    .line 1167
    goto :goto_14

    .line 1168
    :pswitch_28
    const/4 v0, -0x1

    .line 1169
    goto :goto_14

    .line 1170
    :pswitch_29
    const/4 v0, -0x1

    .line 1171
    const/16 v1, 0x2000

    .line 1172
    .line 1173
    goto :goto_14

    .line 1174
    :pswitch_2a
    const/4 v0, -0x1

    .line 1175
    const/16 v1, 0x1000

    .line 1176
    .line 1177
    goto :goto_14

    .line 1178
    :pswitch_2b
    const/4 v0, -0x1

    .line 1179
    const/16 v1, 0x800

    .line 1180
    .line 1181
    goto :goto_14

    .line 1182
    :pswitch_2c
    const/4 v0, -0x1

    .line 1183
    const/16 v1, 0x400

    .line 1184
    .line 1185
    goto :goto_14

    .line 1186
    :pswitch_2d
    const/4 v0, -0x1

    .line 1187
    const/16 v1, 0x200

    .line 1188
    .line 1189
    goto :goto_14

    .line 1190
    :pswitch_2e
    const/4 v0, -0x1

    .line 1191
    const/16 v1, 0x100

    .line 1192
    .line 1193
    goto :goto_14

    .line 1194
    :pswitch_2f
    const/4 v0, -0x1

    .line 1195
    const/16 v1, 0x80

    .line 1196
    .line 1197
    goto :goto_14

    .line 1198
    :pswitch_30
    const/4 v0, -0x1

    .line 1199
    const/16 v1, 0x40

    .line 1200
    .line 1201
    goto :goto_14

    .line 1202
    :pswitch_31
    const/4 v0, -0x1

    .line 1203
    const/16 v1, 0x20

    .line 1204
    .line 1205
    goto :goto_14

    .line 1206
    :pswitch_32
    const/4 v0, -0x1

    .line 1207
    const/16 v1, 0x10

    .line 1208
    .line 1209
    goto :goto_14

    .line 1210
    :pswitch_33
    const/4 v0, -0x1

    .line 1211
    const/16 v1, 0x8

    .line 1212
    .line 1213
    goto :goto_14

    .line 1214
    :pswitch_34
    const/4 v0, -0x1

    .line 1215
    const/4 v1, 0x4

    .line 1216
    goto :goto_14

    .line 1217
    :pswitch_35
    const/4 v0, -0x1

    .line 1218
    const/4 v1, 0x1

    .line 1219
    :goto_14
    if-ne v1, v0, :cond_48

    .line 1220
    .line 1221
    const-string v0, "Unknown AVC level: "

    .line 1222
    .line 1223
    invoke-static {v2, v0, v15}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 1224
    .line 1225
    .line 1226
    return-object v21

    .line 1227
    :cond_48
    new-instance v0, Landroid/util/Pair;

    .line 1228
    .line 1229
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v2

    .line 1233
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v1

    .line 1237
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1238
    .line 1239
    .line 1240
    return-object v0

    .line 1241
    :cond_49
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1242
    .line 1243
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v0

    .line 1253
    invoke-static {v15, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1254
    .line 1255
    .line 1256
    return-object v21

    .line 1257
    :catch_3
    invoke-static {v2, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1258
    .line 1259
    .line 1260
    goto/16 :goto_f

    .line 1261
    .line 1262
    :pswitch_36
    array-length v0, v6

    .line 1263
    const-string v2, "Ignoring malformed AV1 codec string: "

    .line 1264
    .line 1265
    const/4 v9, 0x4

    .line 1266
    if-ge v0, v9, :cond_4a

    .line 1267
    .line 1268
    invoke-static {v2, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1269
    .line 1270
    .line 1271
    return-object v21

    .line 1272
    :cond_4a
    const/16 v28, 0x1

    .line 1273
    .line 1274
    :try_start_5
    aget-object v0, v6, v28

    .line 1275
    .line 1276
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1277
    .line 1278
    .line 1279
    move-result v0

    .line 1280
    const/4 v11, 0x2

    .line 1281
    aget-object v12, v6, v11

    .line 1282
    .line 1283
    const/4 v13, 0x0

    .line 1284
    invoke-virtual {v12, v13, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v12

    .line 1288
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1289
    .line 1290
    .line 1291
    move-result v12

    .line 1292
    const/16 v29, 0x3

    .line 1293
    .line 1294
    aget-object v6, v6, v29

    .line 1295
    .line 1296
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1297
    .line 1298
    .line 1299
    move-result v2
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_4

    .line 1300
    if-eqz v0, :cond_4b

    .line 1301
    .line 1302
    const-string v1, "Unknown AV1 profile: "

    .line 1303
    .line 1304
    invoke-static {v0, v1, v15}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 1305
    .line 1306
    .line 1307
    return-object v21

    .line 1308
    :cond_4b
    const/16 v0, 0x8

    .line 1309
    .line 1310
    if-eq v2, v0, :cond_4c

    .line 1311
    .line 1312
    const/16 v3, 0xa

    .line 1313
    .line 1314
    if-eq v2, v3, :cond_4c

    .line 1315
    .line 1316
    const-string v0, "Unknown AV1 bit depth: "

    .line 1317
    .line 1318
    invoke-static {v2, v0, v15}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 1319
    .line 1320
    .line 1321
    return-object v21

    .line 1322
    :cond_4c
    if-ne v2, v0, :cond_4d

    .line 1323
    .line 1324
    const/4 v2, 0x1

    .line 1325
    goto :goto_15

    .line 1326
    :cond_4d
    if-eqz v4, :cond_4f

    .line 1327
    .line 1328
    iget-object v2, v4, Lm4/h;->d:[B

    .line 1329
    .line 1330
    if-nez v2, :cond_4e

    .line 1331
    .line 1332
    iget v2, v4, Lm4/h;->c:I

    .line 1333
    .line 1334
    const/4 v3, 0x7

    .line 1335
    if-eq v2, v3, :cond_4e

    .line 1336
    .line 1337
    const/4 v3, 0x6

    .line 1338
    if-ne v2, v3, :cond_4f

    .line 1339
    .line 1340
    :cond_4e
    const/16 v2, 0x1000

    .line 1341
    .line 1342
    goto :goto_15

    .line 1343
    :cond_4f
    const/4 v2, 0x2

    .line 1344
    :goto_15
    packed-switch v12, :pswitch_data_a

    .line 1345
    .line 1346
    .line 1347
    const/4 v0, -0x1

    .line 1348
    const/4 v1, -0x1

    .line 1349
    goto/16 :goto_17

    .line 1350
    .line 1351
    :pswitch_37
    const/high16 v1, 0x800000

    .line 1352
    .line 1353
    :goto_16
    :pswitch_38
    const/4 v0, -0x1

    .line 1354
    goto :goto_17

    .line 1355
    :pswitch_39
    const/high16 v1, 0x400000

    .line 1356
    .line 1357
    goto :goto_16

    .line 1358
    :pswitch_3a
    const/high16 v1, 0x200000

    .line 1359
    .line 1360
    goto :goto_16

    .line 1361
    :pswitch_3b
    const/high16 v1, 0x100000

    .line 1362
    .line 1363
    goto :goto_16

    .line 1364
    :pswitch_3c
    const/high16 v1, 0x80000

    .line 1365
    .line 1366
    goto :goto_16

    .line 1367
    :pswitch_3d
    const/high16 v1, 0x40000

    .line 1368
    .line 1369
    goto :goto_16

    .line 1370
    :pswitch_3e
    const/high16 v1, 0x20000

    .line 1371
    .line 1372
    goto :goto_16

    .line 1373
    :pswitch_3f
    const/4 v0, -0x1

    .line 1374
    const/high16 v1, 0x10000

    .line 1375
    .line 1376
    goto :goto_17

    .line 1377
    :pswitch_40
    const/4 v0, -0x1

    .line 1378
    const v1, 0x8000

    .line 1379
    .line 1380
    .line 1381
    goto :goto_17

    .line 1382
    :pswitch_41
    const/4 v0, -0x1

    .line 1383
    const/16 v1, 0x2000

    .line 1384
    .line 1385
    goto :goto_17

    .line 1386
    :pswitch_42
    const/4 v0, -0x1

    .line 1387
    const/16 v1, 0x1000

    .line 1388
    .line 1389
    goto :goto_17

    .line 1390
    :pswitch_43
    const/4 v0, -0x1

    .line 1391
    const/16 v1, 0x800

    .line 1392
    .line 1393
    goto :goto_17

    .line 1394
    :pswitch_44
    const/4 v0, -0x1

    .line 1395
    const/16 v1, 0x400

    .line 1396
    .line 1397
    goto :goto_17

    .line 1398
    :pswitch_45
    const/4 v0, -0x1

    .line 1399
    const/16 v1, 0x200

    .line 1400
    .line 1401
    goto :goto_17

    .line 1402
    :pswitch_46
    const/4 v0, -0x1

    .line 1403
    const/16 v1, 0x100

    .line 1404
    .line 1405
    goto :goto_17

    .line 1406
    :pswitch_47
    const/4 v0, -0x1

    .line 1407
    const/16 v1, 0x80

    .line 1408
    .line 1409
    goto :goto_17

    .line 1410
    :pswitch_48
    const/4 v0, -0x1

    .line 1411
    const/16 v1, 0x40

    .line 1412
    .line 1413
    goto :goto_17

    .line 1414
    :pswitch_49
    const/4 v0, -0x1

    .line 1415
    const/16 v1, 0x20

    .line 1416
    .line 1417
    goto :goto_17

    .line 1418
    :pswitch_4a
    const/4 v0, -0x1

    .line 1419
    const/16 v1, 0x10

    .line 1420
    .line 1421
    goto :goto_17

    .line 1422
    :pswitch_4b
    const/4 v0, -0x1

    .line 1423
    const/16 v1, 0x8

    .line 1424
    .line 1425
    goto :goto_17

    .line 1426
    :pswitch_4c
    const/4 v0, -0x1

    .line 1427
    const/4 v1, 0x4

    .line 1428
    goto :goto_17

    .line 1429
    :pswitch_4d
    const/4 v0, -0x1

    .line 1430
    const/4 v1, 0x2

    .line 1431
    goto :goto_17

    .line 1432
    :pswitch_4e
    const/4 v0, -0x1

    .line 1433
    const/4 v1, 0x1

    .line 1434
    :goto_17
    if-ne v1, v0, :cond_50

    .line 1435
    .line 1436
    const-string v0, "Unknown AV1 level: "

    .line 1437
    .line 1438
    invoke-static {v12, v0, v15}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 1439
    .line 1440
    .line 1441
    return-object v21

    .line 1442
    :cond_50
    new-instance v0, Landroid/util/Pair;

    .line 1443
    .line 1444
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v2

    .line 1448
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v1

    .line 1452
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1453
    .line 1454
    .line 1455
    return-object v0

    .line 1456
    :catch_4
    invoke-static {v2, v3, v15}, Lj2/h0;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    goto/16 :goto_f

    .line 1460
    .line 1461
    :goto_18
    return-object v5

    .line 1462
    nop

    .line 1463
    :sswitch_data_0
    .sparse-switch
        0x600 -> :sswitch_a
        0x601 -> :sswitch_9
        0x602 -> :sswitch_8
        0x603 -> :sswitch_7
        0x604 -> :sswitch_6
        0x605 -> :sswitch_5
        0x606 -> :sswitch_4
        0x607 -> :sswitch_3
        0x608 -> :sswitch_2
        0x609 -> :sswitch_1
        0x61f -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
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
    :sswitch_data_1
    .sparse-switch
        0x601 -> :sswitch_17
        0x602 -> :sswitch_16
        0x603 -> :sswitch_15
        0x604 -> :sswitch_14
        0x605 -> :sswitch_13
        0x606 -> :sswitch_12
        0x607 -> :sswitch_11
        0x608 -> :sswitch_10
        0x609 -> :sswitch_f
        0x61f -> :sswitch_e
        0x620 -> :sswitch_d
        0x621 -> :sswitch_c
        0x622 -> :sswitch_b
    .end sparse-switch

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
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    :pswitch_data_1
    .packed-switch 0x0
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
    .end packed-switch

    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    :sswitch_data_2
    .sparse-switch
        0x2dd8f6 -> :sswitch_1f
        0x2ddf23 -> :sswitch_1e
        0x2ddf24 -> :sswitch_1d
        0x30d038 -> :sswitch_1c
        0x310dbc -> :sswitch_1b
        0x333790 -> :sswitch_1a
        0x35091c -> :sswitch_19
        0x374e43 -> :sswitch_18
    .end sparse-switch

    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_36
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_1d
        :pswitch_1c
        :pswitch_18
    .end packed-switch

    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    :pswitch_data_3
    .packed-switch 0x3c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    :pswitch_data_5
    .packed-switch 0xa
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch

    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    :pswitch_data_6
    .packed-switch 0x14
        :pswitch_31
        :pswitch_30
        :pswitch_2f
    .end packed-switch

    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    :pswitch_data_7
    .packed-switch 0x1e
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
    .end packed-switch

    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    :pswitch_data_8
    .packed-switch 0x28
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    :pswitch_data_9
    .packed-switch 0x32
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch

    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_38
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_37
    .end packed-switch
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
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

.method public static declared-synchronized e(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 5

    .line 1
    const-string v0, "MediaCodecList API didn\'t list secure decoder for: "

    .line 2
    .line 3
    const-class v1, Lg5/y;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    new-instance v2, Lg5/t;

    .line 7
    .line 8
    invoke-direct {v2, p0, p1, p2}, Lg5/t;-><init>(Ljava/lang/String;ZZ)V

    .line 9
    .line 10
    .line 11
    sget-object v3, Lg5/y;->a:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v1

    .line 22
    return-object v4

    .line 23
    :cond_0
    :try_start_1
    new-instance v4, Lb7/m;

    .line 24
    .line 25
    invoke-direct {v4, p1, p2}, Lb7/m;-><init>(ZZ)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v4}, Lg5/y;->f(Lg5/t;Lg5/v;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    sget p1, Lp4/c0;->a:I

    .line 41
    .line 42
    const/16 v4, 0x17

    .line 43
    .line 44
    if-gt p1, v4, :cond_1

    .line 45
    .line 46
    new-instance p1, Lg5/w;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    invoke-direct {p1, p2}, Lg5/w;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v2, p1}, Lg5/y;->f(Lg5/t;Lg5/v;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    const-string p1, "MediaCodecUtil"

    .line 63
    .line 64
    new-instance v4, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, ". Assuming: "

    .line 73
    .line 74
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lg5/n;

    .line 83
    .line 84
    iget-object v0, v0, Lg5/n;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {p1, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    :goto_0
    invoke-static {p0, p2}, Lg5/y;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p2}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v3, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    monitor-exit v1

    .line 110
    return-object p0

    .line 111
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    throw p0
    .line 113
    .line 114
.end method

.method public static f(Lg5/t;Lg5/v;)Ljava/util/ArrayList;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-boolean v3, v1, Lg5/t;->b:Z

    .line 6
    .line 7
    const-string v4, "secure-playback"

    .line 8
    .line 9
    const-string v5, "tunneled-playback"

    .line 10
    .line 11
    :try_start_0
    new-instance v6, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v8, v1, Lg5/t;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {v2}, Lg5/v;->j()I

    .line 19
    .line 20
    .line 21
    move-result v15

    .line 22
    invoke-interface {v2}, Lg5/v;->l()Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    const/16 v16, 0x0

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    :goto_0
    if-ge v9, v15, :cond_10

    .line 30
    .line 31
    invoke-interface {v2, v9}, Lg5/v;->d(I)Landroid/media/MediaCodecInfo;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget v10, Lp4/c0;->a:I

    .line 36
    .line 37
    const/16 v11, 0x1d

    .line 38
    .line 39
    if-lt v10, v11, :cond_0

    .line 40
    .line 41
    invoke-static {v0}, Landroidx/lifecycle/g0;->D(Landroid/media/MediaCodecInfo;)Z

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    if-eqz v12, :cond_0

    .line 46
    .line 47
    :goto_1
    move/from16 v18, v7

    .line 48
    .line 49
    move/from16 v17, v9

    .line 50
    .line 51
    goto/16 :goto_c

    .line 52
    .line 53
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    invoke-static {v0, v12, v7, v8}, Lg5/y;->h(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v13

    .line 61
    if-nez v13, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move v13, v9

    .line 65
    invoke-static {v0, v12, v8}, Lg5/y;->c(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 69
    if-nez v9, :cond_3

    .line 70
    .line 71
    :cond_2
    :goto_2
    move/from16 v18, v7

    .line 72
    .line 73
    move/from16 v17, v13

    .line 74
    .line 75
    goto/16 :goto_c

    .line 76
    .line 77
    :cond_3
    :try_start_1
    invoke-virtual {v0, v9}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 78
    .line 79
    .line 80
    move-result-object v14

    .line 81
    invoke-interface {v2, v5, v9, v14}, Lg5/v;->g(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 82
    .line 83
    .line 84
    move-result v17

    .line 85
    invoke-interface {v2, v5, v14}, Lg5/v;->i(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 86
    .line 87
    .line 88
    move-result v18

    .line 89
    iget-boolean v11, v1, Lg5/t;->c:Z

    .line 90
    .line 91
    if-nez v11, :cond_4

    .line 92
    .line 93
    if-nez v18, :cond_2

    .line 94
    .line 95
    :cond_4
    if-eqz v11, :cond_5

    .line 96
    .line 97
    if-nez v17, :cond_5

    .line 98
    .line 99
    :goto_3
    goto :goto_2

    .line 100
    :cond_5
    invoke-interface {v2, v4, v9, v14}, Lg5/v;->g(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    invoke-interface {v2, v4, v14}, Lg5/v;->i(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 105
    .line 106
    .line 107
    move-result v17

    .line 108
    if-nez v3, :cond_6

    .line 109
    .line 110
    if-nez v17, :cond_2

    .line 111
    .line 112
    :cond_6
    if-eqz v3, :cond_7

    .line 113
    .line 114
    if-nez v11, :cond_7

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_7
    const/16 v17, 0x1

    .line 118
    .line 119
    const/16 v1, 0x1d

    .line 120
    .line 121
    if-lt v10, v1, :cond_8

    .line 122
    .line 123
    invoke-static {v0}, Landroidx/lifecycle/g0;->B(Landroid/media/MediaCodecInfo;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    :goto_4
    move/from16 v18, v7

    .line 128
    .line 129
    move-object v7, v12

    .line 130
    goto :goto_5

    .line 131
    :cond_8
    invoke-static {v0, v8}, Lg5/y;->i(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 135
    xor-int/lit8 v1, v1, 0x1

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :goto_5
    :try_start_2
    invoke-static {v0, v8}, Lg5/y;->i(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    move-object/from16 v19, v0

    .line 143
    .line 144
    const/16 v0, 0x1d

    .line 145
    .line 146
    if-lt v10, v0, :cond_9

    .line 147
    .line 148
    invoke-static/range {v19 .. v19}, Landroidx/lifecycle/g0;->C(Landroid/media/MediaCodecInfo;)Z

    .line 149
    .line 150
    .line 151
    move-result v17

    .line 152
    goto :goto_6

    .line 153
    :cond_9
    invoke-virtual/range {v19 .. v19}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, Lud/e;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v10, "omx.google."

    .line 162
    .line 163
    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-nez v10, :cond_a

    .line 168
    .line 169
    const-string v10, "c2.android."

    .line 170
    .line 171
    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-nez v10, :cond_a

    .line 176
    .line 177
    const-string v10, "c2.google."

    .line 178
    .line 179
    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 183
    if-nez v0, :cond_a

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_a
    const/16 v17, 0x0

    .line 187
    .line 188
    :goto_6
    if-eqz v18, :cond_c

    .line 189
    .line 190
    if-eq v3, v11, :cond_b

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_b
    :goto_7
    move-object v10, v14

    .line 194
    goto :goto_9

    .line 195
    :cond_c
    :goto_8
    if-nez v18, :cond_e

    .line 196
    .line 197
    if-nez v3, :cond_e

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :goto_9
    const/4 v14, 0x0

    .line 201
    move v11, v1

    .line 202
    move v1, v13

    .line 203
    move/from16 v13, v17

    .line 204
    .line 205
    :try_start_3
    invoke-static/range {v7 .. v14}, Lg5/n;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Lg5/n;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :cond_d
    move/from16 v17, v1

    .line 213
    .line 214
    goto/16 :goto_c

    .line 215
    .line 216
    :catch_0
    move-exception v0

    .line 217
    move/from16 v17, v1

    .line 218
    .line 219
    move-object v1, v7

    .line 220
    goto :goto_b

    .line 221
    :cond_e
    move v0, v11

    .line 222
    move-object v10, v14

    .line 223
    move v11, v1

    .line 224
    move v1, v13

    .line 225
    move/from16 v13, v17

    .line 226
    .line 227
    if-nez v18, :cond_d

    .line 228
    .line 229
    if-eqz v0, :cond_d

    .line 230
    .line 231
    new-instance v0, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v14, ".secure"

    .line 240
    .line 241
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 248
    const/4 v14, 0x1

    .line 249
    move/from16 v17, v1

    .line 250
    .line 251
    move-object v1, v7

    .line 252
    move-object v7, v0

    .line 253
    :try_start_4
    invoke-static/range {v7 .. v14}, Lg5/n;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)Lg5/n;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 258
    .line 259
    .line 260
    goto :goto_d

    .line 261
    :catch_1
    move-exception v0

    .line 262
    goto :goto_b

    .line 263
    :catch_2
    move-exception v0

    .line 264
    move-object v1, v7

    .line 265
    :goto_a
    move/from16 v17, v13

    .line 266
    .line 267
    goto :goto_b

    .line 268
    :catch_3
    move-exception v0

    .line 269
    move/from16 v18, v7

    .line 270
    .line 271
    move-object v1, v12

    .line 272
    goto :goto_a

    .line 273
    :goto_b
    :try_start_5
    sget v7, Lp4/c0;->a:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 274
    .line 275
    const/16 v10, 0x17

    .line 276
    .line 277
    const-string v11, "MediaCodecUtil"

    .line 278
    .line 279
    if-gt v7, v10, :cond_f

    .line 280
    .line 281
    :try_start_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    if-nez v7, :cond_f

    .line 286
    .line 287
    new-instance v0, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const-string v7, "Skipping codec "

    .line 293
    .line 294
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string v1, " (failed to query capabilities)"

    .line 301
    .line 302
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {v11, v0}, Lp4/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    :goto_c
    add-int/lit8 v9, v17, 0x1

    .line 313
    .line 314
    move-object/from16 v1, p0

    .line 315
    .line 316
    move/from16 v7, v18

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :cond_f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 323
    .line 324
    .line 325
    const-string v3, "Failed to query codec "

    .line 326
    .line 327
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v1, " ("

    .line 334
    .line 335
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v1, ")"

    .line 342
    .line 343
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-static {v11, v1}, Lp4/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 354
    :cond_10
    :goto_d
    return-object v6

    .line 355
    :catch_4
    move-exception v0

    .line 356
    new-instance v1, Lg5/u;

    .line 357
    .line 358
    const-string v2, "Failed to query underlying media codecs"

    .line 359
    .line 360
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 361
    .line 362
    .line 363
    throw v1
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

.method public static g(Lg5/r;Lm4/q;ZZ)Lya/a1;
    .locals 1

    .line 1
    iget-object v0, p1, Lm4/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {p0, v0, p2, p3}, Lg5/r;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lg5/y;->b(Lm4/q;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    sget-object p0, Lya/a1;->e:Lya/a1;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lg5/r;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, v0}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lya/f0;->f()Lya/a1;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
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

.method public static h(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_4

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const-string p0, ".secure"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    sget p0, Lp4/c0;->a:I

    .line 20
    .line 21
    const/16 p2, 0x18

    .line 22
    .line 23
    if-ge p0, p2, :cond_2

    .line 24
    .line 25
    const-string p2, "OMX.SEC.aac.dec"

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_1

    .line 32
    .line 33
    const-string p2, "OMX.Exynos.AAC.Decoder"

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    :cond_1
    const-string p2, "samsung"

    .line 42
    .line 43
    sget-object v0, Lp4/c0;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    sget-object p2, Lp4/c0;->b:Ljava/lang/String;

    .line 52
    .line 53
    const-string v0, "zeroflte"

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    const-string v0, "zerolte"

    .line 62
    .line 63
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    const-string v0, "zenlte"

    .line 70
    .line 71
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    const-string v0, "SC-05G"

    .line 78
    .line 79
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_4

    .line 84
    .line 85
    const-string v0, "marinelteatt"

    .line 86
    .line 87
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    const-string v0, "404SC"

    .line 94
    .line 95
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    const-string v0, "SC-04G"

    .line 102
    .line 103
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_4

    .line 108
    .line 109
    const-string v0, "SCV31"

    .line 110
    .line 111
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_2

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    const/16 p2, 0x17

    .line 119
    .line 120
    if-gt p0, p2, :cond_3

    .line 121
    .line 122
    const-string p0, "audio/eac3-joc"

    .line 123
    .line 124
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_3

    .line 129
    .line 130
    const-string p0, "OMX.MTK.AUDIO.DECODER.DSPAC3"

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_3

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_3
    const/4 p0, 0x1

    .line 140
    return p0

    .line 141
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 142
    return p0
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

.method public static i(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lp4/c0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/lifecycle/g0;->w(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p1}, Lm4/o0;->k(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lud/e;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "arc."

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string p1, "omx.google."

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_5

    .line 43
    .line 44
    const-string p1, "omx.ffmpeg."

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_5

    .line 51
    .line 52
    const-string p1, "omx.sec."

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    const-string p1, ".sw."

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    :cond_3
    const-string p1, "omx.qcom.video.decoder.hevcswvdec"

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    const-string p1, "c2.android."

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    const-string p1, "c2.google."

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    const-string p1, "omx."

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    const-string p1, "c2."

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 110
    return p0

    .line 111
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 112
    return p0
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

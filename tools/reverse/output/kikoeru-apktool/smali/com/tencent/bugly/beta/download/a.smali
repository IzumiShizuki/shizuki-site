.class public Lcom/tencent/bugly/beta/download/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lcom/tencent/bugly/beta/download/DownloadListener;


# instance fields
.field final a:I

.field final b:[Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/tencent/bugly/beta/download/a;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

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
.method public onCompleted(Lcom/tencent/bugly/beta/download/DownloadTask;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v4, "copy "

    .line 11
    .line 12
    :try_start_0
    iget v5, v1, Lcom/tencent/bugly/beta/download/a;->a:I

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    if-eq v5, v6, :cond_f

    .line 16
    .line 17
    const/4 v7, 0x2

    .line 18
    if-eq v5, v7, :cond_e

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/16 v9, 0x820

    .line 22
    .line 23
    const/4 v10, 0x3

    .line 24
    if-eq v5, v10, :cond_6

    .line 25
    .line 26
    const/4 v11, 0x4

    .line 27
    if-eq v5, v11, :cond_0

    .line 28
    .line 29
    goto/16 :goto_5

    .line 30
    .line 31
    :cond_0
    iget-object v5, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 32
    .line 33
    aget-object v11, v5, v2

    .line 34
    .line 35
    check-cast v11, Lcom/tencent/bugly/proguard/r;

    .line 36
    .line 37
    aget-object v5, v5, v6

    .line 38
    .line 39
    check-cast v5, Ljava/lang/Integer;

    .line 40
    .line 41
    iget-object v12, v11, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 42
    .line 43
    if-eqz v12, :cond_16

    .line 44
    .line 45
    iget-object v13, v12, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    if-nez v13, :cond_1

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    const-string v13, "patch download success !!!"

    .line 52
    .line 53
    :try_start_1
    new-array v14, v2, [Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v13, v14}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSaveFile()Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    iget-object v14, v12, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 63
    .line 64
    iget-object v14, v14, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 65
    .line 66
    iget-object v14, v14, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    .line 68
    const-string v15, "SHA"

    .line 69
    .line 70
    :try_start_2
    invoke-static {v13, v14, v15}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    if-eqz v14, :cond_4

    .line 75
    .line 76
    iget-object v0, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 77
    .line 78
    aput-object v3, v0, v6

    .line 79
    .line 80
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    .line 83
    .line 84
    invoke-static {v13, v0}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/io/File;Ljava/io/File;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 100
    .line 101
    .line 102
    const-string v3, " to "

    .line 103
    .line 104
    :try_start_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 108
    .line 109
    iget-object v3, v3, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 116
    .line 117
    .line 118
    const-string v3, " success!"

    .line 119
    .line 120
    :try_start_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    new-array v3, v2, [Ljava/lang/Object;

    .line 128
    .line 129
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    iget-object v0, v11, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 133
    .line 134
    if-eqz v0, :cond_2

    .line 135
    .line 136
    const-string v0, "delete temp file"

    .line 137
    .line 138
    :try_start_5
    new-array v3, v2, [Ljava/lang/Object;

    .line 139
    .line 140
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    iget-object v0, v11, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 144
    .line 145
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :catch_0
    move-exception v0

    .line 150
    goto/16 :goto_4

    .line 151
    .line 152
    :cond_2
    :goto_0
    const-string v0, "UPLOAD_PATCH_RESULT"

    .line 153
    .line 154
    :try_start_6
    invoke-static {v0, v2}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 155
    .line 156
    .line 157
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 162
    .line 163
    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 170
    .line 171
    iget-boolean v3, v3, Lcom/tencent/bugly/beta/global/e;->X:Z

    .line 172
    .line 173
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->onDownloadSuccess(Ljava/lang/String;Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_3
    const-string v0, "copy file failed"

    .line 178
    .line 179
    :try_start_7
    new-array v2, v2, [Ljava/lang/Object;

    .line 180
    .line 181
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 185
    .line 186
    .line 187
    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 188
    const-string v2, "copy file failure."

    .line 189
    .line 190
    :try_start_8
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->onDownloadFailure(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-ge v4, v7, :cond_5

    .line 199
    .line 200
    iget-object v3, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 201
    .line 202
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    add-int/2addr v4, v6

    .line 207
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    aput-object v4, v3, v6

    .line 212
    .line 213
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 214
    .line 215
    .line 216
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 217
    .line 218
    iget-object v3, v0, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    .line 219
    .line 220
    iget-object v4, v12, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 221
    .line 222
    iget-object v4, v4, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 223
    .line 224
    iget-object v4, v4, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    .line 225
    .line 226
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget-object v5, v12, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 233
    .line 234
    iget-object v5, v5, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 235
    .line 236
    iget-object v5, v5, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    .line 237
    .line 238
    invoke-interface {v3, v4, v0, v8, v5}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iput-object v0, v11, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 243
    .line 244
    invoke-virtual {v0, v10}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 245
    .line 246
    .line 247
    iget-object v0, v11, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 248
    .line 249
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->setNeededNotify(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v0, v11, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 255
    .line 256
    .line 257
    iget-object v0, v11, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 258
    .line 259
    invoke-static {v0}, Lcom/tencent/bugly/beta/download/BetaReceiver;->addTask(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 260
    .line 261
    .line 262
    iget-object v0, v11, Lcom/tencent/bugly/proguard/r;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 263
    .line 264
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->download()V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_5
    iget-object v2, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 269
    .line 270
    aput-object v3, v2, v6
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 271
    .line 272
    const-string v2, "file sha1 verify fail"

    .line 273
    .line 274
    :try_start_9
    invoke-virtual {v1, v0, v9, v2}, Lcom/tencent/bugly/beta/download/a;->onFailed(Lcom/tencent/bugly/beta/download/DownloadTask;ILjava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 278
    .line 279
    .line 280
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 281
    .line 282
    .line 283
    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 284
    const-string v2, "retry download patch too many times."

    .line 285
    .line 286
    :try_start_a
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->onDownloadFailure(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_6
    iget-object v4, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 291
    .line 292
    aget-object v4, v4, v2

    .line 293
    .line 294
    check-cast v4, Lcom/tencent/bugly/beta/upgrade/d;

    .line 295
    .line 296
    iget-object v5, v4, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 297
    .line 298
    if-eqz v5, :cond_16

    .line 299
    .line 300
    iget-object v11, v5, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 301
    .line 302
    if-nez v11, :cond_7

    .line 303
    .line 304
    goto/16 :goto_5

    .line 305
    .line 306
    :cond_7
    iget-object v11, v4, Lcom/tencent/bugly/beta/upgrade/d;->f:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    .line 307
    .line 308
    if-eqz v11, :cond_8

    .line 309
    .line 310
    new-instance v12, Lcom/tencent/bugly/beta/global/d;

    .line 311
    .line 312
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v13

    .line 316
    iget-boolean v14, v4, Lcom/tencent/bugly/beta/upgrade/d;->g:Z

    .line 317
    .line 318
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 319
    .line 320
    .line 321
    move-result-object v14

    .line 322
    new-array v10, v10, [Ljava/lang/Object;

    .line 323
    .line 324
    aput-object v11, v10, v2

    .line 325
    .line 326
    aput-object v13, v10, v6

    .line 327
    .line 328
    aput-object v14, v10, v7

    .line 329
    .line 330
    const/16 v11, 0x12

    .line 331
    .line 332
    invoke-direct {v12, v11, v10}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v12}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 336
    .line 337
    .line 338
    :cond_8
    const-string v10, "apk download completed"

    .line 339
    .line 340
    :try_start_b
    new-array v2, v2, [Ljava/lang/Object;

    .line 341
    .line 342
    invoke-static {v10, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    new-instance v11, Lcom/tencent/bugly/proguard/z;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 346
    .line 347
    const-string v12, "download"

    .line 348
    .line 349
    :try_start_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 350
    .line 351
    .line 352
    move-result-wide v13

    .line 353
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getCostTime()J

    .line 354
    .line 355
    .line 356
    move-result-wide v16

    .line 357
    iget-object v2, v5, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 358
    .line 359
    iget-object v10, v2, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 360
    .line 361
    iget-object v15, v2, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 362
    .line 363
    iget v2, v2, Lcom/tencent/bugly/proguard/B;->u:I

    .line 364
    .line 365
    const/16 v21, 0x0

    .line 366
    .line 367
    move-object/from16 v19, v15

    .line 368
    .line 369
    const/4 v15, 0x0

    .line 370
    move/from16 v20, v2

    .line 371
    .line 372
    move-object/from16 v18, v10

    .line 373
    .line 374
    invoke-direct/range {v11 .. v21}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 375
    .line 376
    .line 377
    sget-object v2, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 378
    .line 379
    invoke-virtual {v2, v11}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-eqz v2, :cond_9

    .line 384
    .line 385
    sget-object v2, Lcom/tencent/bugly/beta/upgrade/b;->a:Lcom/tencent/bugly/beta/upgrade/b;

    .line 386
    .line 387
    invoke-virtual {v2, v11, v6}, Lcom/tencent/bugly/beta/upgrade/b;->a(Lcom/tencent/bugly/proguard/z;Z)V

    .line 388
    .line 389
    .line 390
    :cond_9
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 391
    .line 392
    iget-boolean v2, v2, Lcom/tencent/bugly/beta/global/e;->fa:Z

    .line 393
    .line 394
    if-nez v2, :cond_a

    .line 395
    .line 396
    goto/16 :goto_5

    .line 397
    .line 398
    :cond_a
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSaveFile()Ljava/io/File;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    iget-object v10, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 403
    .line 404
    aget-object v10, v10, v6

    .line 405
    .line 406
    check-cast v10, Ljava/lang/Integer;

    .line 407
    .line 408
    sget-object v11, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 409
    .line 410
    iget-object v11, v11, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 411
    .line 412
    iget-object v12, v5, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 413
    .line 414
    iget-object v12, v12, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 415
    .line 416
    iget-object v12, v12, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 417
    .line 418
    invoke-static {v11, v2, v12}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    if-eqz v2, :cond_b

    .line 423
    .line 424
    iget-object v0, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 425
    .line 426
    aput-object v3, v0, v6

    .line 427
    .line 428
    sget-object v0, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 429
    .line 430
    new-instance v6, Lcom/tencent/bugly/proguard/z;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    .line 431
    .line 432
    const-string v7, "install"

    .line 433
    .line 434
    :try_start_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 435
    .line 436
    .line 437
    move-result-wide v8

    .line 438
    iget-object v2, v5, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 439
    .line 440
    iget-object v13, v2, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 441
    .line 442
    iget-object v14, v2, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 443
    .line 444
    iget v15, v2, Lcom/tencent/bugly/proguard/B;->u:I

    .line 445
    .line 446
    const/16 v16, 0x0

    .line 447
    .line 448
    const/4 v10, 0x0

    .line 449
    const-wide/16 v11, 0x0

    .line 450
    .line 451
    invoke-direct/range {v6 .. v16}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 455
    .line 456
    .line 457
    return-void

    .line 458
    :cond_b
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    if-ge v2, v7, :cond_d

    .line 463
    .line 464
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 465
    .line 466
    const/16 v7, 0x18

    .line 467
    .line 468
    if-lt v2, v7, :cond_c

    .line 469
    .line 470
    iget-object v2, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 471
    .line 472
    aput-object v3, v2, v6
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    .line 473
    .line 474
    const-string v2, "\u5b89\u88c5\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u60a8\u7684App\u662f\u5426\u517c\u5bb97.0\u8bbe\u5907"

    .line 475
    .line 476
    :try_start_e
    invoke-virtual {v1, v0, v9, v2}, Lcom/tencent/bugly/beta/download/a;->onFailed(Lcom/tencent/bugly/beta/download/DownloadTask;ILjava/lang/String;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :cond_c
    iget-object v2, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 484
    .line 485
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    add-int/2addr v3, v6

    .line 490
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    aput-object v3, v2, v6

    .line 495
    .line 496
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 497
    .line 498
    .line 499
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 500
    .line 501
    iget-object v2, v0, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    .line 502
    .line 503
    iget-object v3, v5, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 504
    .line 505
    iget-object v3, v3, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 506
    .line 507
    iget-object v3, v3, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    .line 508
    .line 509
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    iget-object v7, v5, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 516
    .line 517
    iget-object v7, v7, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 518
    .line 519
    iget-object v7, v7, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    .line 520
    .line 521
    invoke-interface {v2, v3, v0, v8, v7}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    iput-object v0, v4, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 526
    .line 527
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 528
    .line 529
    .line 530
    sget-object v0, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->instance:Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    .line 531
    .line 532
    iget-object v2, v5, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 533
    .line 534
    iget-object v3, v4, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 535
    .line 536
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->setUpgradeInfo(Lcom/tencent/bugly/proguard/B;Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 537
    .line 538
    .line 539
    iget-object v0, v4, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 540
    .line 541
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 542
    .line 543
    .line 544
    iget-object v0, v4, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 545
    .line 546
    invoke-static {v0}, Lcom/tencent/bugly/beta/download/BetaReceiver;->addTask(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 547
    .line 548
    .line 549
    iget-object v0, v4, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 550
    .line 551
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->download()V

    .line 552
    .line 553
    .line 554
    return-void

    .line 555
    :cond_d
    iget-object v2, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 556
    .line 557
    aput-object v3, v2, v6
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    .line 558
    .line 559
    const-string v2, "file md5 verify fail"

    .line 560
    .line 561
    :try_start_f
    invoke-virtual {v1, v0, v9, v2}, Lcom/tencent/bugly/beta/download/a;->onFailed(Lcom/tencent/bugly/beta/download/DownloadTask;ILjava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0, v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 565
    .line 566
    .line 567
    return-void

    .line 568
    :cond_e
    iget-object v3, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 569
    .line 570
    aget-object v2, v3, v2

    .line 571
    .line 572
    check-cast v2, Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    .line 573
    .line 574
    invoke-virtual {v2, v0}, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->updateBtn(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :cond_f
    iget-object v0, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 579
    .line 580
    aget-object v3, v0, v2

    .line 581
    .line 582
    monitor-enter v3
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    .line 583
    :try_start_10
    iget-object v0, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 584
    .line 585
    aget-object v0, v0, v6

    .line 586
    .line 587
    check-cast v0, Ljava/util/Map;

    .line 588
    .line 589
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    if-nez v4, :cond_10

    .line 594
    .line 595
    monitor-exit v3

    .line 596
    return-void

    .line 597
    :catchall_0
    move-exception v0

    .line 598
    goto/16 :goto_3

    .line 599
    .line 600
    :cond_10
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 605
    .line 606
    .line 607
    move-result-object v4

    .line 608
    const/4 v5, 0x0

    .line 609
    :cond_11
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 610
    .line 611
    .line 612
    move-result v7

    .line 613
    if-eqz v7, :cond_12

    .line 614
    .line 615
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v7

    .line 619
    check-cast v7, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 620
    .line 621
    invoke-virtual {v7}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 622
    .line 623
    .line 624
    move-result v7

    .line 625
    if-ne v7, v6, :cond_11

    .line 626
    .line 627
    add-int/lit8 v5, v5, 0x1

    .line 628
    .line 629
    goto :goto_1

    .line 630
    :cond_12
    new-instance v4, Ljava/lang/StringBuilder;

    .line 631
    .line 632
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 636
    .line 637
    .line 638
    const-string v6, " has completed"

    .line 639
    .line 640
    :try_start_11
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    new-array v6, v2, [Ljava/lang/Object;

    .line 648
    .line 649
    invoke-static {v4, v6}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 653
    .line 654
    .line 655
    move-result v4

    .line 656
    if-ge v5, v4, :cond_13

    .line 657
    .line 658
    monitor-exit v3

    .line 659
    return-void

    .line 660
    :cond_13
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 661
    .line 662
    .line 663
    move-result-object v4

    .line 664
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    :cond_14
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 669
    .line 670
    .line 671
    move-result v5

    .line 672
    if-eqz v5, :cond_15

    .line 673
    .line 674
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v5

    .line 678
    check-cast v5, Ljava/lang/String;

    .line 679
    .line 680
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v6

    .line 684
    check-cast v6, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 685
    .line 686
    invoke-virtual {v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSaveFile()Ljava/io/File;

    .line 687
    .line 688
    .line 689
    move-result-object v6

    .line 690
    if-eqz v6, :cond_14

    .line 691
    .line 692
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v6

    .line 696
    check-cast v6, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 697
    .line 698
    invoke-virtual {v6}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSaveFile()Ljava/io/File;

    .line 699
    .line 700
    .line 701
    move-result-object v6

    .line 702
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 703
    .line 704
    .line 705
    move-result v6

    .line 706
    if-eqz v6, :cond_14

    .line 707
    .line 708
    sget-object v6, Lcom/tencent/bugly/beta/global/ResBean;->a:Lcom/tencent/bugly/beta/global/ResBean;

    .line 709
    .line 710
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v7

    .line 714
    check-cast v7, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 715
    .line 716
    invoke-virtual {v7}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSaveFile()Ljava/io/File;

    .line 717
    .line 718
    .line 719
    move-result-object v7

    .line 720
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v7

    .line 724
    invoke-virtual {v6, v5, v7}, Lcom/tencent/bugly/beta/global/ResBean;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 725
    .line 726
    .line 727
    goto :goto_2

    .line 728
    :cond_15
    const-string v0, "rb.bch"

    .line 729
    .line 730
    :try_start_12
    sget-object v4, Lcom/tencent/bugly/beta/global/ResBean;->a:Lcom/tencent/bugly/beta/global/ResBean;

    .line 731
    .line 732
    invoke-static {v0, v4}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable;)Z

    .line 733
    .line 734
    .line 735
    iget-object v0, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 736
    .line 737
    aget-object v0, v0, v2

    .line 738
    .line 739
    check-cast v0, Lcom/tencent/bugly/beta/global/f;

    .line 740
    .line 741
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/global/f;->a()V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/global/f;->b()V

    .line 745
    .line 746
    .line 747
    monitor-exit v3

    .line 748
    return-void

    .line 749
    :goto_3
    monitor-exit v3
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 750
    :try_start_13
    throw v0
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0

    .line 751
    :goto_4
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    if-nez v2, :cond_16

    .line 756
    .line 757
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 758
    .line 759
    .line 760
    :cond_16
    :goto_5
    return-void
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

.method public onFailed(Lcom/tencent/bugly/beta/download/DownloadTask;ILjava/lang/String;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    :try_start_0
    iget v3, v1, Lcom/tencent/bugly/beta/download/a;->a:I

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    if-eq v3, v4, :cond_5

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    if-eq v3, v6, :cond_4

    .line 15
    .line 16
    const/4 v7, 0x3

    .line 17
    if-eq v3, v7, :cond_2

    .line 18
    .line 19
    const/4 v7, 0x4

    .line 20
    if-eq v3, v7, :cond_0

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v3, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 25
    .line 26
    aget-object v3, v3, v5

    .line 27
    .line 28
    check-cast v3, Lcom/tencent/bugly/proguard/r;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    sget-object v7, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 33
    .line 34
    new-instance v8, Lcom/tencent/bugly/proguard/z;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    const-string v9, "download"

    .line 37
    .line 38
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v10

    .line 42
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getCostTime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v13

    .line 46
    iget-object v0, v3, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 49
    .line 50
    iget-object v15, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 51
    .line 52
    iget-object v3, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 53
    .line 54
    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I

    .line 55
    .line 56
    const/16 v18, 0x0

    .line 57
    .line 58
    const/4 v12, 0x1

    .line 59
    move/from16 v17, v0

    .line 60
    .line 61
    move-object/from16 v16, v3

    .line 62
    .line 63
    invoke-direct/range {v8 .. v18}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v8}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception v0

    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_1
    :goto_0
    const-string v0, "hotfix download failed\uff1a(%d)%s"

    .line 74
    .line 75
    :try_start_2
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    new-array v6, v6, [Ljava/lang/Object;

    .line 80
    .line 81
    aput-object v3, v6, v5

    .line 82
    .line 83
    aput-object v2, v6, v4

    .line 84
    .line 85
    invoke-static {v0, v6}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->onDownloadFailure(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_2
    iget-object v3, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 97
    .line 98
    aget-object v3, v3, v5

    .line 99
    .line 100
    check-cast v3, Lcom/tencent/bugly/beta/upgrade/d;

    .line 101
    .line 102
    if-eqz v0, :cond_3

    .line 103
    .line 104
    sget-object v7, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 105
    .line 106
    new-instance v8, Lcom/tencent/bugly/proguard/z;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 107
    .line 108
    const-string v9, "download"

    .line 109
    .line 110
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 111
    .line 112
    .line 113
    move-result-wide v10

    .line 114
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getCostTime()J

    .line 115
    .line 116
    .line 117
    move-result-wide v13

    .line 118
    iget-object v0, v3, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 119
    .line 120
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 121
    .line 122
    iget-object v15, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 123
    .line 124
    iget-object v3, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 125
    .line 126
    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I

    .line 127
    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    const/4 v12, 0x1

    .line 131
    move/from16 v17, v0

    .line 132
    .line 133
    move-object/from16 v16, v3

    .line 134
    .line 135
    invoke-direct/range {v8 .. v18}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v8}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 139
    .line 140
    .line 141
    :cond_3
    const-string v0, "upgrade failed\uff1a(%d)%s"

    .line 142
    .line 143
    :try_start_4
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    new-array v6, v6, [Ljava/lang/Object;

    .line 148
    .line 149
    aput-object v3, v6, v5

    .line 150
    .line 151
    aput-object v2, v6, v4

    .line 152
    .line 153
    invoke-static {v0, v6}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    sget-object v0, Lcom/tencent/bugly/proguard/X;->b:Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 157
    .line 158
    const-string v2, "download fail, please try later"

    .line 159
    .line 160
    :try_start_5
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_4
    iget-object v2, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 165
    .line 166
    aget-object v2, v2, v5

    .line 167
    .line 168
    check-cast v2, Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    .line 169
    .line 170
    invoke-virtual {v2, v0}, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->updateBtn(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_5
    iget-object v0, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 175
    .line 176
    aget-object v2, v0, v5

    .line 177
    .line 178
    monitor-enter v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 179
    :try_start_6
    iget-object v0, v1, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 180
    .line 181
    aget-object v0, v0, v5

    .line 182
    .line 183
    check-cast v0, Lcom/tencent/bugly/beta/global/f;

    .line 184
    .line 185
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/global/f;->a()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/global/f;->b()V

    .line 189
    .line 190
    .line 191
    monitor-exit v2

    .line 192
    return-void

    .line 193
    :catchall_0
    move-exception v0

    .line 194
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 195
    :try_start_7
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 196
    :goto_1
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-nez v2, :cond_6

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 203
    .line 204
    .line 205
    :cond_6
    :goto_2
    return-void
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

.method public onReceive(Lcom/tencent/bugly/beta/download/DownloadTask;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/tencent/bugly/beta/download/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/download/a;->b:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aget-object v0, v0, v1

    .line 11
    .line 12
    check-cast v0, Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->updateBtn(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 15
    .line 16
    .line 17
    return-void
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

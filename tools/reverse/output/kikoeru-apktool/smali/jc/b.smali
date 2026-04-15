.class public Ljc/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/util/Iterator;
.implements Lkc/a;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ljc/b;->a:I

    iput-object p2, p0, Ljc/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lwf/x;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Ljc/b;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 5
    iget p1, p1, Lwf/b1;->c:I

    .line 6
    iput p1, p0, Ljc/b;->b:I

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ljc/b;->a:I

    const-string v0, "array"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Ljc/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ljc/b;->b:I

    .line 7
    .line 8
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lvb/d;

    .line 11
    .line 12
    invoke-virtual {v1}, Lvb/a;->a()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    return v0

    .line 22
    :pswitch_0
    iget v0, p0, Ljc/b;->b:I

    .line 23
    .line 24
    if-lez v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_1
    return v0

    .line 30
    :pswitch_1
    iget v0, p0, Ljc/b;->b:I

    .line 31
    .line 32
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, [S

    .line 35
    .line 36
    array-length v1, v1

    .line 37
    if-ge v0, v1, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/4 v0, 0x0

    .line 42
    :goto_2
    return v0

    .line 43
    :pswitch_2
    iget v0, p0, Ljc/b;->b:I

    .line 44
    .line 45
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, [J

    .line 48
    .line 49
    array-length v1, v1

    .line 50
    if-ge v0, v1, :cond_3

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    const/4 v0, 0x0

    .line 55
    :goto_3
    return v0

    .line 56
    :pswitch_3
    iget v0, p0, Ljc/b;->b:I

    .line 57
    .line 58
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, [I

    .line 61
    .line 62
    array-length v1, v1

    .line 63
    if-ge v0, v1, :cond_4

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    goto :goto_4

    .line 67
    :cond_4
    const/4 v0, 0x0

    .line 68
    :goto_4
    return v0

    .line 69
    :pswitch_4
    iget v0, p0, Ljc/b;->b:I

    .line 70
    .line 71
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, [B

    .line 74
    .line 75
    array-length v1, v1

    .line 76
    if-ge v0, v1, :cond_5

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    const/4 v0, 0x0

    .line 81
    :goto_5
    return v0

    .line 82
    :pswitch_5
    iget v0, p0, Ljc/b;->b:I

    .line 83
    .line 84
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lo/v0;

    .line 87
    .line 88
    invoke-virtual {v1}, Lo/v0;->g()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-ge v0, v1, :cond_6

    .line 93
    .line 94
    const/4 v0, 0x1

    .line 95
    goto :goto_6

    .line 96
    :cond_6
    const/4 v0, 0x0

    .line 97
    :goto_6
    return v0

    .line 98
    :pswitch_6
    iget v0, p0, Ljc/b;->b:I

    .line 99
    .line 100
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, [Ljava/lang/Object;

    .line 103
    .line 104
    array-length v1, v1

    .line 105
    if-ge v0, v1, :cond_7

    .line 106
    .line 107
    const/4 v0, 0x1

    .line 108
    goto :goto_7

    .line 109
    :cond_7
    const/4 v0, 0x0

    .line 110
    :goto_7
    return v0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ljc/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljc/b;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lvb/d;

    .line 15
    .line 16
    iget v1, p0, Ljc/b;->b:I

    .line 17
    .line 18
    add-int/lit8 v2, v1, 0x1

    .line 19
    .line 20
    iput v2, p0, Ljc/b;->b:I

    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :pswitch_0
    iget-object v0, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lwf/x;

    .line 36
    .line 37
    iget v1, v0, Lwf/b1;->c:I

    .line 38
    .line 39
    iget v2, p0, Ljc/b;->b:I

    .line 40
    .line 41
    add-int/lit8 v3, v2, -0x1

    .line 42
    .line 43
    iput v3, p0, Ljc/b;->b:I

    .line 44
    .line 45
    sub-int/2addr v1, v2

    .line 46
    iget-object v0, v0, Lwf/b1;->e:[Ljava/lang/String;

    .line 47
    .line 48
    aget-object v0, v0, v1

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    iget v0, p0, Ljc/b;->b:I

    .line 52
    .line 53
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, [S

    .line 56
    .line 57
    array-length v2, v1

    .line 58
    if-ge v0, v2, :cond_1

    .line 59
    .line 60
    add-int/lit8 v2, v0, 0x1

    .line 61
    .line 62
    iput v2, p0, Ljc/b;->b:I

    .line 63
    .line 64
    aget-short v0, v1, v0

    .line 65
    .line 66
    new-instance v1, Lub/y;

    .line 67
    .line 68
    invoke-direct {v1, v0}, Lub/y;-><init>(S)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 73
    .line 74
    iget v1, p0, Ljc/b;->b:I

    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :pswitch_2
    iget v0, p0, Ljc/b;->b:I

    .line 85
    .line 86
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, [J

    .line 89
    .line 90
    array-length v2, v1

    .line 91
    if-ge v0, v2, :cond_2

    .line 92
    .line 93
    add-int/lit8 v2, v0, 0x1

    .line 94
    .line 95
    iput v2, p0, Ljc/b;->b:I

    .line 96
    .line 97
    aget-wide v0, v1, v0

    .line 98
    .line 99
    new-instance v2, Lub/v;

    .line 100
    .line 101
    invoke-direct {v2, v0, v1}, Lub/v;-><init>(J)V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 106
    .line 107
    iget v1, p0, Ljc/b;->b:I

    .line 108
    .line 109
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :pswitch_3
    iget v0, p0, Ljc/b;->b:I

    .line 118
    .line 119
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, [I

    .line 122
    .line 123
    array-length v2, v1

    .line 124
    if-ge v0, v2, :cond_3

    .line 125
    .line 126
    add-int/lit8 v2, v0, 0x1

    .line 127
    .line 128
    iput v2, p0, Ljc/b;->b:I

    .line 129
    .line 130
    aget v0, v1, v0

    .line 131
    .line 132
    new-instance v1, Lub/t;

    .line 133
    .line 134
    invoke-direct {v1, v0}, Lub/t;-><init>(I)V

    .line 135
    .line 136
    .line 137
    return-object v1

    .line 138
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 139
    .line 140
    iget v1, p0, Ljc/b;->b:I

    .line 141
    .line 142
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v0

    .line 150
    :pswitch_4
    iget v0, p0, Ljc/b;->b:I

    .line 151
    .line 152
    iget-object v1, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, [B

    .line 155
    .line 156
    array-length v2, v1

    .line 157
    if-ge v0, v2, :cond_4

    .line 158
    .line 159
    add-int/lit8 v2, v0, 0x1

    .line 160
    .line 161
    iput v2, p0, Ljc/b;->b:I

    .line 162
    .line 163
    aget-byte v0, v1, v0

    .line 164
    .line 165
    new-instance v1, Lub/r;

    .line 166
    .line 167
    invoke-direct {v1, v0}, Lub/r;-><init>(B)V

    .line 168
    .line 169
    .line 170
    return-object v1

    .line 171
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 172
    .line 173
    iget v1, p0, Ljc/b;->b:I

    .line 174
    .line 175
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v0

    .line 183
    :pswitch_5
    iget-object v0, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Lo/v0;

    .line 186
    .line 187
    iget v1, p0, Ljc/b;->b:I

    .line 188
    .line 189
    add-int/lit8 v2, v1, 0x1

    .line 190
    .line 191
    iput v2, p0, Ljc/b;->b:I

    .line 192
    .line 193
    invoke-virtual {v0, v1}, Lo/v0;->h(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    :pswitch_6
    :try_start_0
    iget-object v0, p0, Ljc/b;->c:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, [Ljava/lang/Object;

    .line 201
    .line 202
    iget v1, p0, Ljc/b;->b:I

    .line 203
    .line 204
    add-int/lit8 v2, v1, 0x1

    .line 205
    .line 206
    iput v2, p0, Ljc/b;->b:I

    .line 207
    .line 208
    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    .line 210
    return-object v0

    .line 211
    :catch_0
    move-exception v0

    .line 212
    iget v1, p0, Ljc/b;->b:I

    .line 213
    .line 214
    add-int/lit8 v1, v1, -0x1

    .line 215
    .line 216
    iput v1, p0, Ljc/b;->b:I

    .line 217
    .line 218
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v1

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget v0, p0, Ljc/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v1, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v1, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v1, "Operation is not supported for read-only collection"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :pswitch_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 31
    .line 32
    const-string v1, "Operation is not supported for read-only collection"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :pswitch_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 39
    .line 40
    const-string v1, "Operation is not supported for read-only collection"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :pswitch_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 47
    .line 48
    const-string v1, "Operation is not supported for read-only collection"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :pswitch_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 55
    .line 56
    const-string v1, "Operation is not supported for read-only collection"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :pswitch_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 63
    .line 64
    const-string v1, "Operation is not supported for read-only collection"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

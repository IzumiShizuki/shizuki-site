.class public final synthetic Lba/d0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILd0/d;Lhf/y;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lba/d0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lba/d0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lba/d0;->d:Ljava/lang/Object;

    iput p1, p0, Lba/d0;->b:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lwf/x;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Lba/d0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lba/d0;->b:I

    iput-object p2, p0, Lba/d0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lba/d0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lba/d0;->a:I

    iput-object p1, p0, Lba/d0;->c:Ljava/lang/Object;

    iput p2, p0, Lba/d0;->b:I

    iput-object p3, p0, Lba/d0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lba/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lba/d0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lba/d0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lwf/x;

    .line 13
    .line 14
    iget v2, p0, Lba/d0;->b:I

    .line 15
    .line 16
    new-array v3, v2, [Luf/g;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    :goto_0
    if-ge v5, v2, :cond_0

    .line 21
    .line 22
    new-instance v6, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v7, 0x2e

    .line 31
    .line 32
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v7, v1, Lwf/b1;->e:[Ljava/lang/String;

    .line 36
    .line 37
    aget-object v7, v7, v5

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    sget-object v7, Luf/k;->e:Luf/k;

    .line 47
    .line 48
    new-array v8, v4, [Luf/g;

    .line 49
    .line 50
    invoke-static {v6, v7, v8}, Lud/e;->h(Ljava/lang/String;Lud/n;[Luf/g;)Luf/h;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    aput-object v6, v3, v5

    .line 55
    .line 56
    add-int/lit8 v5, v5, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-object v3

    .line 60
    :pswitch_0
    iget-object v0, p0, Lba/d0;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lfg/f;

    .line 63
    .line 64
    iget-object v1, p0, Lba/d0;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Lic/k;

    .line 67
    .line 68
    invoke-virtual {v0}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iget v3, p0, Lba/d0;->b:I

    .line 79
    .line 80
    if-eq v2, v3, :cond_1

    .line 81
    .line 82
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    :goto_1
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_1
    iget-object v0, p0, Lba/d0;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lch/p;

    .line 103
    .line 104
    iget v1, p0, Lba/d0;->b:I

    .line 105
    .line 106
    iget-object v2, p0, Lba/d0;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Lch/b;

    .line 109
    .line 110
    :try_start_0
    iget-object v3, v0, Lch/p;->w:Lch/y;

    .line 111
    .line 112
    invoke-virtual {v3, v1, v2}, Lch/y;->q(ILch/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :catch_0
    move-exception v1

    .line 117
    sget-object v2, Lch/b;->d:Lch/b;

    .line 118
    .line 119
    invoke-virtual {v0, v2, v2, v1}, Lch/p;->b(Lch/b;Lch/b;Ljava/io/IOException;)V

    .line 120
    .line 121
    .line 122
    :goto_2
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_2
    iget-object v0, p0, Lba/d0;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lhf/y;

    .line 128
    .line 129
    iget-object v1, p0, Lba/d0;->d:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Ld0/d;

    .line 132
    .line 133
    new-instance v2, Lba/i0;

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    iget v4, p0, Lba/d0;->b:I

    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    invoke-direct {v2, v1, v4, v5, v3}, Lba/i0;-><init>(Ld0/d;ILyb/c;I)V

    .line 140
    .line 141
    .line 142
    const/4 v1, 0x3

    .line 143
    invoke-static {v0, v5, v5, v2, v1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 144
    .line 145
    .line 146
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

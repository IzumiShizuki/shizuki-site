.class public final synthetic Laa/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lx0/w0;


# direct methods
.method public synthetic constructor <init>(Lx0/w0;)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    iput v0, p0, Laa/f;->a:I

    sget-object v0, Lfa/v;->a:Lfa/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/f;->b:Lx0/w0;

    return-void
.end method

.method public synthetic constructor <init>(Lx0/w0;I)V
    .locals 0

    .line 2
    iput p2, p0, Laa/f;->a:I

    iput-object p1, p0, Laa/f;->b:Lx0/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Laa/f;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 5
    .line 6
    iget-object v3, p0, Laa/f;->b:Lx0/w0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_1
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    xor-int/2addr v0, v1

    .line 41
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :pswitch_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :pswitch_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :pswitch_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
    :pswitch_6
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :pswitch_7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :pswitch_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :pswitch_9
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :pswitch_a
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-object v2

    .line 97
    :pswitch_b
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-object v2

    .line 103
    :pswitch_c
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v2

    .line 109
    :pswitch_d
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-object v2

    .line 115
    :pswitch_e
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object v2

    .line 121
    :pswitch_f
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    xor-int/2addr v0, v1

    .line 132
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-object v2

    .line 140
    :pswitch_10
    sget-object v0, Lfa/v;->a:Lfa/v;

    .line 141
    .line 142
    sget-object v0, Lfa/v;->g:Lx0/e1;

    .line 143
    .line 144
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Ljava/util/Timer;

    .line 149
    .line 150
    if-nez v0, :cond_0

    .line 151
    .line 152
    sget v0, Lff/a;->d:I

    .line 153
    .line 154
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Ljava/lang/Number;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    float-to-int v0, v0

    .line 165
    sget-object v1, Lff/c;->e:Lff/c;

    .line 166
    .line 167
    invoke-static {v0, v1}, Lff/f;->m(ILff/c;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v0

    .line 171
    invoke-static {v0, v1}, Lfa/v;->a(J)V

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_0
    sget v0, Lff/a;->d:I

    .line 176
    .line 177
    const-wide/16 v0, 0x0

    .line 178
    .line 179
    invoke-static {v0, v1}, Lfa/v;->a(J)V

    .line 180
    .line 181
    .line 182
    :goto_0
    return-object v2

    .line 183
    :pswitch_11
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    return-object v2

    .line 189
    :pswitch_12
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-object v2

    .line 195
    :pswitch_13
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Lbg/a2;

    .line 200
    .line 201
    if-eqz v0, :cond_1

    .line 202
    .line 203
    iget-object v2, v0, Lbg/a2;->m:Ljava/lang/String;

    .line 204
    .line 205
    if-nez v2, :cond_2

    .line 206
    .line 207
    iget-object v2, v0, Lbg/a2;->w:Ljava/lang/Integer;

    .line 208
    .line 209
    if-nez v2, :cond_2

    .line 210
    .line 211
    iget-object v0, v0, Lbg/a2;->t:Ljava/lang/String;

    .line 212
    .line 213
    if-eqz v0, :cond_1

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_1
    const/4 v1, 0x0

    .line 217
    :cond_2
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    return-object v0

    .line 222
    :pswitch_14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-object v2

    .line 228
    :pswitch_15
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 229
    .line 230
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    return-object v2

    .line 234
    :pswitch_16
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    return-object v2

    .line 240
    :pswitch_17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 241
    .line 242
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    return-object v2

    .line 246
    :pswitch_18
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Ly2/y;

    .line 251
    .line 252
    iget-object v0, v0, Ly2/y;->a:Lt2/g;

    .line 253
    .line 254
    iget-object v0, v0, Lt2/g;->b:Ljava/lang/String;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_19
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Ly2/y;

    .line 262
    .line 263
    iget-object v0, v0, Ly2/y;->a:Lt2/g;

    .line 264
    .line 265
    iget-object v0, v0, Lt2/g;->b:Ljava/lang/String;

    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_1a
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 269
    .line 270
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    return-object v2

    .line 274
    :pswitch_1b
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 275
    .line 276
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    return-object v2

    .line 280
    :pswitch_1c
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 281
    .line 282
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    return-object v2

    .line 286
    nop

    .line 287
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

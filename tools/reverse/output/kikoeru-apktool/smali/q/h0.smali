.class public final Lq/h0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lq/q0;

.field public final synthetic d:Lq/r0;


# direct methods
.method public synthetic constructor <init>(Lq/q0;Lq/r0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lq/h0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lq/h0;->c:Lq/q0;

    .line 4
    .line 5
    iput-object p2, p0, Lq/h0;->d:Lq/r0;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lq/h0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lq/f0;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lq/h0;->d:Lq/r0;

    .line 21
    .line 22
    iget-object p1, p1, Lq/r0;->a:Lq/y1;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Lce/j0;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    :goto_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_0
    check-cast p1, Lr/k1;

    .line 39
    .line 40
    sget-object v0, Lq/f0;->a:Lq/f0;

    .line 41
    .line 42
    sget-object v1, Lq/f0;->b:Lq/f0;

    .line 43
    .line 44
    invoke-interface {p1, v0, v1}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    sget-object p1, Lq/l0;->b:Lr/z0;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    sget-object v0, Lq/f0;->c:Lq/f0;

    .line 54
    .line 55
    invoke-interface {p1, v1, v0}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p1, p0, Lq/h0;->d:Lq/r0;

    .line 62
    .line 63
    iget-object p1, p1, Lq/r0;->a:Lq/y1;

    .line 64
    .line 65
    sget-object p1, Lq/l0;->b:Lr/z0;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    sget-object p1, Lq/l0;->b:Lr/z0;

    .line 69
    .line 70
    :goto_1
    return-object p1

    .line 71
    :pswitch_1
    check-cast p1, Lq/f0;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const/4 v0, 0x0

    .line 78
    const/high16 v1, 0x3f800000    # 1.0f

    .line 79
    .line 80
    if-eqz p1, :cond_6

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    if-eq p1, v2, :cond_4

    .line 84
    .line 85
    const/4 v2, 0x2

    .line 86
    if-ne p1, v2, :cond_5

    .line 87
    .line 88
    iget-object p1, p0, Lq/h0;->d:Lq/r0;

    .line 89
    .line 90
    iget-object p1, p1, Lq/r0;->a:Lq/y1;

    .line 91
    .line 92
    iget-object p1, p1, Lq/y1;->a:Lq/s0;

    .line 93
    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    new-instance p1, Lce/j0;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_6
    iget-object p1, p0, Lq/h0;->c:Lq/q0;

    .line 107
    .line 108
    iget-object p1, p1, Lq/q0;->a:Lq/y1;

    .line 109
    .line 110
    iget-object p1, p1, Lq/y1;->a:Lq/s0;

    .line 111
    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    return-object p1

    .line 119
    :pswitch_2
    check-cast p1, Lr/k1;

    .line 120
    .line 121
    sget-object v0, Lq/f0;->a:Lq/f0;

    .line 122
    .line 123
    sget-object v1, Lq/f0;->b:Lq/f0;

    .line 124
    .line 125
    invoke-interface {p1, v0, v1}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_8

    .line 130
    .line 131
    iget-object p1, p0, Lq/h0;->c:Lq/q0;

    .line 132
    .line 133
    iget-object p1, p1, Lq/q0;->a:Lq/y1;

    .line 134
    .line 135
    iget-object p1, p1, Lq/y1;->a:Lq/s0;

    .line 136
    .line 137
    if-eqz p1, :cond_7

    .line 138
    .line 139
    iget-object p1, p1, Lq/s0;->a:Lr/x;

    .line 140
    .line 141
    if-nez p1, :cond_b

    .line 142
    .line 143
    :cond_7
    sget-object p1, Lq/l0;->b:Lr/z0;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    sget-object v0, Lq/f0;->c:Lq/f0;

    .line 147
    .line 148
    invoke-interface {p1, v1, v0}, Lr/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_a

    .line 153
    .line 154
    iget-object p1, p0, Lq/h0;->d:Lq/r0;

    .line 155
    .line 156
    iget-object p1, p1, Lq/r0;->a:Lq/y1;

    .line 157
    .line 158
    iget-object p1, p1, Lq/y1;->a:Lq/s0;

    .line 159
    .line 160
    if-eqz p1, :cond_9

    .line 161
    .line 162
    iget-object p1, p1, Lq/s0;->a:Lr/x;

    .line 163
    .line 164
    if-nez p1, :cond_b

    .line 165
    .line 166
    :cond_9
    sget-object p1, Lq/l0;->b:Lr/z0;

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_a
    sget-object p1, Lq/l0;->b:Lr/z0;

    .line 170
    .line 171
    :cond_b
    :goto_3
    return-object p1

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

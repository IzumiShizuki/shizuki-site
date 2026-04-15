.class public final Lq/k0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lic/k;


# direct methods
.method public synthetic constructor <init>(Lic/k;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq/k0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lq/k0;->c:Lic/k;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .locals 6

    .line 1
    iget v0, p0, Lq/k0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Lq/k0;->c:Lic/k;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v0, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Lf3/l;

    .line 25
    .line 26
    iget-wide v0, p1, Lf3/l;->a:J

    .line 27
    .line 28
    const-wide v2, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v0, v2

    .line 34
    long-to-int p1, v0

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v0, p0, Lq/k0;->c:Lic/k;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/4 v0, 0x0

    .line 52
    int-to-long v0, v0

    .line 53
    const/16 v4, 0x20

    .line 54
    .line 55
    shl-long/2addr v0, v4

    .line 56
    int-to-long v4, p1

    .line 57
    and-long/2addr v2, v4

    .line 58
    or-long/2addr v0, v2

    .line 59
    new-instance p1, Lf3/j;

    .line 60
    .line 61
    invoke-direct {p1, v0, v1}, Lf3/j;-><init>(J)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_1
    check-cast p1, Lf3/l;

    .line 66
    .line 67
    iget-wide v0, p1, Lf3/l;->a:J

    .line 68
    .line 69
    const/16 p1, 0x20

    .line 70
    .line 71
    shr-long/2addr v0, p1

    .line 72
    long-to-int v1, v0

    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v1, p0, Lq/k0;->c:Lic/k;

    .line 78
    .line 79
    invoke-interface {v1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    int-to-long v0, v0

    .line 90
    shl-long/2addr v0, p1

    .line 91
    const/4 p1, 0x0

    .line 92
    int-to-long v2, p1

    .line 93
    const-wide v4, 0xffffffffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    and-long/2addr v2, v4

    .line 99
    or-long/2addr v0, v2

    .line 100
    new-instance p1, Lf3/j;

    .line 101
    .line 102
    invoke-direct {p1, v0, v1}, Lf3/j;-><init>(J)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :pswitch_2
    check-cast p1, Lf3/l;

    .line 107
    .line 108
    iget-wide v0, p1, Lf3/l;->a:J

    .line 109
    .line 110
    const-wide v2, 0xffffffffL

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    and-long/2addr v0, v2

    .line 116
    long-to-int p1, v0

    .line 117
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object v0, p0, Lq/k0;->c:Lic/k;

    .line 122
    .line 123
    invoke-interface {v0, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    const/4 v0, 0x0

    .line 134
    int-to-long v0, v0

    .line 135
    const/16 v4, 0x20

    .line 136
    .line 137
    shl-long/2addr v0, v4

    .line 138
    int-to-long v4, p1

    .line 139
    and-long/2addr v2, v4

    .line 140
    or-long/2addr v0, v2

    .line 141
    new-instance p1, Lf3/j;

    .line 142
    .line 143
    invoke-direct {p1, v0, v1}, Lf3/j;-><init>(J)V

    .line 144
    .line 145
    .line 146
    return-object p1

    .line 147
    :pswitch_3
    check-cast p1, Lf3/l;

    .line 148
    .line 149
    iget-wide v0, p1, Lf3/l;->a:J

    .line 150
    .line 151
    const/16 p1, 0x20

    .line 152
    .line 153
    shr-long/2addr v0, p1

    .line 154
    long-to-int v1, v0

    .line 155
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iget-object v1, p0, Lq/k0;->c:Lic/k;

    .line 160
    .line 161
    invoke-interface {v1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/lang/Number;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    int-to-long v0, v0

    .line 172
    shl-long/2addr v0, p1

    .line 173
    const/4 p1, 0x0

    .line 174
    int-to-long v2, p1

    .line 175
    const-wide v4, 0xffffffffL

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    and-long/2addr v2, v4

    .line 181
    or-long/2addr v0, v2

    .line 182
    new-instance p1, Lf3/j;

    .line 183
    .line 184
    invoke-direct {p1, v0, v1}, Lf3/j;-><init>(J)V

    .line 185
    .line 186
    .line 187
    return-object p1

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

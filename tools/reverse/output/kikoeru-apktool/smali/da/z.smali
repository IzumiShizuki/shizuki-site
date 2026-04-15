.class public final synthetic Lda/z;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lic/a;


# direct methods
.method public synthetic constructor <init>(ILic/a;)V
    .locals 0

    .line 1
    iput p1, p0, Lda/z;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lda/z;->b:Lic/a;

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
    .locals 6

    .line 1
    iget v0, p0, Lda/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lf3/c;

    .line 7
    .line 8
    iget-object p1, p0, Lda/z;->b:Lic/a;

    .line 9
    .line 10
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Llc/b;->R(F)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-long v0, p1

    .line 25
    const/16 p1, 0x20

    .line 26
    .line 27
    shl-long/2addr v0, p1

    .line 28
    const/4 p1, 0x0

    .line 29
    int-to-long v2, p1

    .line 30
    const-wide v4, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v2, v4

    .line 36
    or-long/2addr v0, v2

    .line 37
    new-instance p1, Lf3/j;

    .line 38
    .line 39
    invoke-direct {p1, v0, v1}, Lf3/j;-><init>(J)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_0
    check-cast p1, Lp1/b;

    .line 44
    .line 45
    iget-object p1, p0, Lda/z;->b:Lic/a;

    .line 46
    .line 47
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_1
    check-cast p1, Lp1/b;

    .line 54
    .line 55
    iget-object p1, p0, Lda/z;->b:Lic/a;

    .line 56
    .line 57
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_2
    check-cast p1, Lp1/b;

    .line 64
    .line 65
    iget-object p1, p0, Lda/z;->b:Lic/a;

    .line 66
    .line 67
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_3
    const-string v0, "it"

    .line 74
    .line 75
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lda/z;->b:Lic/a;

    .line 79
    .line 80
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lda/z;->b:Lic/a;

    .line 91
    .line 92
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 96
    .line 97
    return-object p1

    .line 98
    :pswitch_5
    check-cast p1, Lp1/b;

    .line 99
    .line 100
    iget-object p1, p0, Lda/z;->b:Lic/a;

    .line 101
    .line 102
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 106
    .line 107
    return-object p1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.class public final Lcg/c;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lx0/w0;


# direct methods
.method public synthetic constructor <init>(Lx0/w0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcg/c;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lcg/c;->c:Lx0/w0;

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
    .locals 4

    .line 1
    iget v0, p0, Lcg/c;->b:I

    .line 2
    .line 3
    const-string v1, "it"

    .line 4
    .line 5
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 6
    .line 7
    iget-object v3, p0, Lcg/c;->c:Lx0/w0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lg2/c0;

    .line 13
    .line 14
    invoke-static {p1, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    invoke-interface {p1, v0, v1}, Lg2/c0;->H(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    new-instance p1, Lp1/b;

    .line 24
    .line 25
    invoke-direct {p1, v0, v1}, Lp1/b;-><init>(J)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v3, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :pswitch_0
    check-cast p1, Lta/c;

    .line 33
    .line 34
    invoke-static {p1, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lic/k;

    .line 42
    .line 43
    invoke-interface {v0, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lic/k;

    .line 58
    .line 59
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {v0, p1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ljava/lang/Float;

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_2
    check-cast p1, Ll0/r;

    .line 71
    .line 72
    invoke-interface {v3, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v2

    .line 76
    :pswitch_3
    check-cast p1, Landroid/content/res/Configuration;

    .line 77
    .line 78
    new-instance v0, Landroid/content/res/Configuration;

    .line 79
    .line 80
    invoke-direct {v0, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lx0/z;

    .line 84
    .line 85
    invoke-interface {v3, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :pswitch_4
    check-cast p1, Lp1/b;

    .line 90
    .line 91
    iget-wide v0, p1, Lp1/b;->a:J

    .line 92
    .line 93
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Lic/k;

    .line 98
    .line 99
    new-instance v3, Lp1/b;

    .line 100
    .line 101
    invoke-direct {v3, v0, v1}, Lp1/b;-><init>(J)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1, v3}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    return-object v2

    .line 108
    :pswitch_5
    check-cast p1, Lf3/l;

    .line 109
    .line 110
    iget-wide v0, p1, Lf3/l;->a:J

    .line 111
    .line 112
    new-instance p1, Lf3/l;

    .line 113
    .line 114
    invoke-direct {p1, v0, v1}, Lf3/l;-><init>(J)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v3, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object v2

    .line 121
    :pswitch_6
    check-cast p1, Lf3/l;

    .line 122
    .line 123
    iget-wide v0, p1, Lf3/l;->a:J

    .line 124
    .line 125
    new-instance p1, Lf3/l;

    .line 126
    .line 127
    invoke-direct {p1, v0, v1}, Lf3/l;-><init>(J)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v3, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-object v2

    .line 134
    :pswitch_7
    check-cast p1, Lcg/x;

    .line 135
    .line 136
    invoke-static {p1, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-interface {v3, p1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object v2

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

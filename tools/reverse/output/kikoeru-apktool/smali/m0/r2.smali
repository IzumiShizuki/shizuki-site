.class public final Lm0/r2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lic/a;


# direct methods
.method public synthetic constructor <init>(ILic/a;)V
    .locals 0

    .line 1
    iput p1, p0, Lm0/r2;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lm0/r2;->b:Lic/a;

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
.method public final invoke(Lc2/x;Lyb/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lm0/r2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v5, Lda/z;

    .line 7
    .line 8
    const/4 v0, 0x5

    .line 9
    iget-object v1, p0, Lm0/r2;->b:Lic/a;

    .line 10
    .line 11
    invoke-direct {v5, v0, v1}, Lda/z;-><init>(ILic/a;)V

    .line 12
    .line 13
    .line 14
    const/4 v7, 0x7

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v1, p1

    .line 19
    move-object v6, p2

    .line 20
    invoke-static/range {v1 .. v7}, Lu/n2;->f(Lc2/x;Lic/k;Lic/k;Lic/o;Lic/k;Lyb/c;I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 25
    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    :goto_0
    return-object p1

    .line 32
    :pswitch_0
    move-object v0, p1

    .line 33
    move-object v5, p2

    .line 34
    new-instance p1, Lm0/e3;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    const/4 v1, 0x0

    .line 38
    iget-object v2, p0, Lm0/r2;->b:Lic/a;

    .line 39
    .line 40
    invoke-direct {p1, v1, v2, p2}, Lm0/e3;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p1, v5}, Lu/w1;->e(Lc2/x;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 48
    .line 49
    if-ne p1, p2, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 53
    .line 54
    :goto_1
    return-object p1

    .line 55
    :pswitch_1
    move-object v0, p1

    .line 56
    move-object v5, p2

    .line 57
    new-instance v4, Lda/z;

    .line 58
    .line 59
    const/4 p1, 0x4

    .line 60
    iget-object p2, p0, Lm0/r2;->b:Lic/a;

    .line 61
    .line 62
    invoke-direct {v4, p1, p2}, Lda/z;-><init>(ILic/a;)V

    .line 63
    .line 64
    .line 65
    const/4 v6, 0x7

    .line 66
    const/4 v1, 0x0

    .line 67
    const/4 v2, 0x0

    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-static/range {v0 .. v6}, Lu/n2;->f(Lc2/x;Lic/k;Lic/k;Lic/o;Lic/k;Lyb/c;I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 74
    .line 75
    if-ne p1, p2, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 79
    .line 80
    :goto_2
    return-object p1

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
